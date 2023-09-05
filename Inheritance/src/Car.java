
public class Car extends Vehicule {
	
	
	private int speed;
	private String brand;
	
	public Car (int maxSpeed, int minSpeed, int speed, String brand) {
		
		super(minSpeed,maxSpeed);
		this.speed = speed;
		this.brand = brand;
		
	}
	
	public void display () {
		super.display();
		System.out.println("Current speed: " + speed + "\nThe brand of the Car: " + brand + ".");
		
	}
	
	public String toString () {
		
		return super.toString() + "The brand name is " + brand + " and the speed is " + speed + ".";
		
	}
	
		
	
	}
	
	
	

