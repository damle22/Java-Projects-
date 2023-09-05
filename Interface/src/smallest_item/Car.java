package smallest_item;

public class Car implements Comparable{

	private String brand;
	private int year;
	private double price;
	
	public Car(String brand, int year, double price) {
		
		this.brand = brand;
		this.year = year;
		this.price = price;
	}
	
	
	
	public String toString() {
		
		return String.format("%4d %-15s $%.2f", year, brand, price);
	}
	
	public int compareTo(Object obj) {
		
		Car that = (Car) obj;
		return Double.compare(this.price, that.price);
	}
	
}
