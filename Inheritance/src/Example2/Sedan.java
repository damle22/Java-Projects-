package Example2;

public class Sedan extends Car {

	private String brand;

	
	public Sedan() {
		
		this.brand = "Mercedes";
		
	}
	
	public Sedan(int max, int min, String brand) {
		
		super(max,min);
		this.brand = brand;
		
	}
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void display() {
		
		System.out.println("This is the display method of the sedan " + brand);
	}
	
	public void vroum() {
		
		System.out.println("Vroumm!!!SEDAN");
	}
	
}
