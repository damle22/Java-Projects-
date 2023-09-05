import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingTextFileUisngBufferedReader {
	public static void main(String[] args) throws IOException {
	
	try {
		
	
	BufferedReader br = new BufferedReader (new FileReader("football.txt"));
	
	String line = br.readLine();
	System.out.println("First line read: " + line);
	
	line = br.readLine();
	int n2 = br.read(); 
	
	
	
	System.out.println("The second line read: " + line);
	System.out.println("The second number is: " + n2);
	
	line = br.readLine();
	line = br.readLine();
	System.out.println("The third line read: " + line);
	br.close();
	
	
	}
	catch(FileNotFoundException e){
		System.out.println("File not found, or cannot be opened.");
	}
	catch(IOException e){
		System.out.println("Error reading from football.txt");
		
	}
	
	
	
}

}