import java.io.*;

public class Car implements Serializable {

	String brand;
	 int year;
	
	
	public Car(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}
	
	
	
}
