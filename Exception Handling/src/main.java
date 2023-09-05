
public class main {
	
	
	public static int divide (int x, int y) {
		
		if (y==0)
			throw new ArithmeticException("Cannot divide by zero!");
		
		return x/y;
		
	}
	
	

	public static void main(String[] args) {
		
	
		try {
			System.out.println("Before");
			int i = divide(5,0);
			System.out.println("Division equals to: " + i);
			
		}
		
		catch (ArithmeticException e){
			System.out.println("Exception caught");
			System.out.println("The message is: " + e.getMessage());
			
		}
		
		
		

	}

}
