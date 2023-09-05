package compare;

public class driver {

	public static void main(String[] args) {
		
		String a = "abc";
		String b = "abc";
		
		System.out.println(a.compareTo(b)); 
		//Only available for strings, not integers nor doubles. We have to fix this. 
		
		
		Price p1 = new Price(10.0);
		Price p2 = new Price(15.00);
		
		System.out.println(p1.compareTo(p2));  
		
		
		
	}

}
