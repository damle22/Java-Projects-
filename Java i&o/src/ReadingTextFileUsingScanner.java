import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingTextFileUsingScanner {

	public static void main(String[] args) {
	
	
		System.out.println("I will read three numbers and a line");
		System.out.println("of text from the file football.txt");
		
		Scanner fileScanner = null;
		
		try {
			
			fileScanner = new Scanner (new FileInputStream("football.txt"));
			
			
		}
		catch (FileNotFoundException e)
		{System.out.println("File football.txt was not found");
		System.out.println("or could not be opened");
		System.exit(0);
		
		}
		String hello = fileScanner.next();	
		
		int n1 = fileScanner.nextInt();
		int n2 = fileScanner.nextInt();
		int n3 = fileScanner.nextInt();
		
		fileScanner.nextLine();
		String line = fileScanner.nextLine();
		
		System.out.println("The hello message is: " + hello);
		System.out.println("The three numbers read from the file are:");
		System.out.println(n1 + ", " + n2 + ", " + n3);

		System.out.println("The line read from the file is: ");
		System.out.println(line);
		
		fileScanner.close();

	}

}
