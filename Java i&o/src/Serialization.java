import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {

	public static void main(String[] args) {
		
		Car her_car = new Car ("BMW", 2021);
		Car his_car = new Car ("Toyota", 2017);
		
		
		
		String file_name = "cars.btn";
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		
		try {
			
			fos = new FileOutputStream(file_name);
			oos = new ObjectOutputStream(fos);
			
			
			oos.writeObject(her_car);
			oos.writeObject(his_car);
			
			
			oos.flush();
			oos.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found.");
		}
		catch(IOException e) {
			System.out.println("IO Exception.");
		}
		
		System.out.println("Serialized two car objects into cars.btn file");
		
		
		
	}

}
