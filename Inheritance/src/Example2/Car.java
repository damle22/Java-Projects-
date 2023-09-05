package Example2;

public class Car {

	private int maxSpeed = 100;
	private int minSpeed = 30;
	
	
	public Car() {
		
		
	}
	
	public Car(int max, int min) {
		
		this.maxSpeed = max;
		this.minSpeed = min;
	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getMinSpeed() {
		return minSpeed;
	}
	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}
	
    public void display() {
		
		System.out.println("This is the display method of the car");
	}
	
    public void vroum() {
		System.out.println("Vroumm!!!CAR");
	}
	
	
}
