import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class De_serialization {

	public static void main(String[] args) {
		
		Car car1 = null;
		Car car2 = null;
		
	
		
		String file_name = "cars.btn";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		
		try {
			
			fis = new FileInputStream(file_name);
			ois = new ObjectInputStream(fis);
			
			
			car1 = (Car) ois.readObject();
			car2 = (Car) ois.readObject();
			
			
			ois.close();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Car 1: " + car1);
		System.out.println("Car 2: " + car2);
		
		

	}

}
