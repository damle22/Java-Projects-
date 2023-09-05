package Comparator;

public class Auto {

	private String brand;
	private int year;
	private double price;
	
	public Auto(String brand, int year, double price) {
		this.brand = brand;
		this.year = year;
		this.price = price;
		} 
	
	@Override
		public String toString() {
		
		return String.format("%4d %-15s $%.2f", year, brand, price);
		}
	
		public String getBrand() { return brand;}
	
		public int getYear() { return year;}
		
		public double getPrice() {return price;}
	
}
