
public class main_1 {

	
	public static int divide (int x, int y) {
		
		
		try {
			
			if (y == 0)
				throw new ArithmeticException("Cannot divide by zero!");
			System.out.println("This will never be displayed");
				
			
		}
		catch (ArithmeticException e) {
			
			System.out.println(e.getMessage());
			System.exit(0);
			
		}
			
		return x/y;
		
	}
	
	public static void main(String[] args) {
		
		int i = divide (5,0);
		
		System.out.println(i);
		
		
		

	}

}
