import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WritingDataToBynaryFile {

	public static void main(String[] args){
		
		try {
			
			FileOutputStream fos = new FileOutputStream("stuff_more.tx");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			oos.writeChar('A');
			oos.writeDouble(123.25);
			oos.writeInt(5);
			oos.writeBoolean(false);
			oos.writeUTF("UTF stands for Unicode Text Format");
			oos.flush();
			oos.close();
			
			System.out.println("Output written to the file stuff_more.txt");
			
			}
		catch(IOException e) {
			System.out.println("Problem with file output.");
		}
		
		

	}

}
