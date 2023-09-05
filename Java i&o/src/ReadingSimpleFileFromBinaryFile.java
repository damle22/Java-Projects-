import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadingSimpleFileFromBinaryFile {

	public static void main(String[] args) {
		
		try {
			
			FileInputStream fis = new FileInputStream("stuff_more.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			System.out.println("Reading input values from the file stuff_more.txt");
			
			
			char ch = ois.readChar();
			double d = ois.readDouble();
			int i = ois.readInt();
			boolean b = ois.readBoolean();
			String s = ois.readUTF();
			
			ois.close();
			
			System.out.println("ch: " + ch);
			System.out.println("d: " + d);
			System.out.println("i: " + i);
			System.out.println("b: " + b);
			System.out.println("s: " + s);			
		}
		catch(IOException e) {
			System.out.println("Problem with the file output.");
		}
		
		
	}

}
