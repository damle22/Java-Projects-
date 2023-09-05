package compare;

public class Price implements Comparable{

	private double price;
	
	
	public Price (double price) {
		
		this.price = price;
	}
	
	
	@Override
	public int compareTo(Object obj) {
		
		Price that = (Price) obj;
		return  Double.compare(this.price, that.price);
	}
	
}
