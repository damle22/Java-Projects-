
public class Vehicule {

	 private int maxSpeed;
	 private int minSpeed;
	
	
	 public Vehicule (int maxSpeed, int minSpeed) {
			
			this.maxSpeed = maxSpeed;
			this.minSpeed = minSpeed;	
	 }
	
	public void display () {
		System.out.println("Max Speed: " + maxSpeed + "\nMin Speed: " + minSpeed);
		
	}
	
	public String toString() {
		
		
		return "Max Speed is " + maxSpeed + " and the Min Speed is " + minSpeed + ". ";
	}

	
}
