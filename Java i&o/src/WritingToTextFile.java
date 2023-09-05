import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class WritingToTextFile {

	public static void main(String[] args) {
		
		
		String file_name = "stuffKBB9.txt";
		PrintWriter pw = null;
		
		
		try {
			pw = new PrintWriter (new FileOutputStream(file_name));
			
		}
		catch (FileNotFoundException e){
			
			System.out.println("Error opening the file: " + file_name);
			System.exit(0);	//important		
			
		}
		
		System.out.println("Writing to file");
		
		pw.println("The quick brown fox");
		pw.println("jumped over the lazy dog");
		
		
		pw.close();
		
		System.out.println("End of the program");
		
		
		
	}

}
