package ca.concordia.algos.huffman;
import java.io.*;
import java.util.*;
import java.util.Comparator;

// Node class for Huffman tree
class HuffmanNode {
    char data;
    int frequency;
    HuffmanNode left, right;

    public HuffmanNode(char data, int frequency, HuffmanNode left, HuffmanNode right) {
        this.data = data;
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }
}

// Comparator for sorting nodes based on frequency
class FrequencyComparator implements Comparator<HuffmanNode> {
    public int compare(HuffmanNode node1, HuffmanNode node2) {
        return node1.frequency - node2.frequency;
    }
}

// Huffman coding tree class
class HuffmanTree {
    private HuffmanNode root;

    public HuffmanTree(HuffmanNode root) {
        this.root = root;
    }

    // Traverse the Huffman tree and assign codes to each character
    public void buildCodeTable(Map<Character, String> codeTable) {
        buildCodeTableHelper(root, "", codeTable);
    }

    private void buildCodeTableHelper(HuffmanNode node, String code, Map<Character, String> codeTable) {
        if (node == null)
            return;

        if (node.left == null && node.right == null) {
            codeTable.put(node.data, code);
            return;
        }

        buildCodeTableHelper(node.left, code + "0", codeTable);
        buildCodeTableHelper(node.right, code + "1", codeTable);
    }
}

// Huffman coding driver class
public class HCDriver {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java HCDriver <filename> <encode/decode>");
            return;
        }
          //String filename = "haiku1.txt";
          //String operation = "decode";
        String filename = args[0];
        String operation = args[1];

        if (operation.equals("encode")) {
            try {
                // Read the input file
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    // convert line to lowercase
                    line = line.toLowerCase();
                    sb.append(line);
                    sb.append("\n");
                }
                
                reader.close();

                // Build the Huffman tree and code table
                Map<Character, Integer> frequencyTable = buildFrequencyTable(sb.toString());
                HuffmanNode root = buildHuffmanTree(frequencyTable);
                HuffmanTree tree = new HuffmanTree(root);
                Map<Character, String> codeTable = new HashMap<>();
                tree.buildCodeTable(codeTable);

                // Ask the user for input a String to encode
                System.out.print("> ");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();

                // Encode the input text
                StringBuilder encodedText = new StringBuilder();
                for (char c : input.toCharArray()) {
                    encodedText.append(codeTable.get(c));
                }

                // Print the encoded text
                System.out.println(encodedText.toString());

            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else if (operation.equals("decode")) {
            try {
                // Read the input file
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                StringBuilder sb = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    // convert line to lowercase
                    line = line.toLowerCase();
                    sb.append(line);
                    sb.append("\n");
                }
                // Remove the last newline character
                // sb.deleteCharAt(sb.length() - 1);
                reader.close();

                // Build the Huffman tree and code table
                Map<Character, Integer> frequencyTable = buildFrequencyTable(sb.toString());
                HuffmanNode root = buildHuffmanTree(frequencyTable);
                HuffmanTree tree = new HuffmanTree(root);
                Map<Character, String> codeTable = new HashMap<>();
                tree.buildCodeTable(codeTable);
                // System.out.println("--- Code Table ---");
                // System.out.println(codeTable);

                // Decode the input text
                StringBuilder decodedText = new StringBuilder();
                HuffmanNode currentNode = root;
                for (char c : sb.toString().toCharArray()) {
                    if (c == '0')
                        currentNode = currentNode.left;
                    else if (c == '1')
                        currentNode = currentNode.right;

                    if (currentNode.left == null && currentNode.right == null) {
                        decodedText.append(currentNode.data);
                        currentNode = root;
                    }
                }

                // Ask the user for input a String to Decode
                System.out.print("> ");
                Scanner scanner = new Scanner(System.in);
                String input = scanner.nextLine();
                
                // Decode the input text
                decodedText = new StringBuilder();
                currentNode = root;
                for (char c : input.toCharArray()) {
                    if (c == '0')
                        currentNode = currentNode.left;
                    else if (c == '1')
                        currentNode = currentNode.right;

                    if (currentNode.left == null && currentNode.right == null) {
                        decodedText.append(currentNode.data);
                        currentNode = root;
                    }
                }

                // Print the decoded text
                System.out.println(decodedText.toString());
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid operation. Use 'encode' or 'decode'.");
        }
    }

    // Build frequency table from input text
    private static Map<Character, Integer> buildFrequencyTable(String text) {
        Map<Character, Integer> frequencyTable = new HashMap<>();
        // for (char c : text.toCharArray()) {
        //     frequencyTable.put(c, frequencyTable.getOrDefault(c, 0) + 1);
        // }

        // consider carriage return and NULL as a character in the frequency table
       for (int i = 0; i < text.length(); i++) {
               char c = text.charAt(i);
            frequencyTable.put(c, frequencyTable.getOrDefault(c, 0) + 1);
               if (c == '\n')
               {
                    // add a carriage return character to the frequency table
                    // frequencyTable.put('\r', frequencyTable.getOrDefault('\r', 0) + 1); 
               }
            }
        
        return frequencyTable;
    }

    // Build Huffman tree from frequency table
    private static HuffmanNode buildHuffmanTree(Map<Character, Integer> frequencyTable) {
        PriorityQueue<HuffmanNode> pq = new PriorityQueue<>(new FrequencyComparator());

        for (Map.Entry<Character, Integer> entry : frequencyTable.entrySet()) {
            pq.enqueue(new HuffmanNode(entry.getKey(), entry.getValue(), null, null));
        }

        while (pq.size() > 1) {
            HuffmanNode left = pq.dequeue();
            HuffmanNode right = pq.dequeue();
            HuffmanNode newNode = new HuffmanNode('\0', left.frequency + right.frequency, left, right);
            pq.enqueue(newNode);
        }

        return pq.dequeue();
    }
}
