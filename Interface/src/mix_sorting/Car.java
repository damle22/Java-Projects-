package mix_sorting;

public class Car implements Comparable {

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
	
	@Override
	public int compareTo(Object obj) {
		
		Car that = (Car) obj;
		int result = Double.compare(this.price, that.price); //compare prices
		if(result != 0)
			return result;
		return this.brand.compareTo(that.brand); //otherwise, compare brands
		
	}
	
	
	
}
