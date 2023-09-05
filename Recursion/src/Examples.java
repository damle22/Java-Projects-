
public class Examples {	
	
	public static int sum_recursive(int n) {
		
		if(n == 1)
			return 1;
		else
			return n+ sum_recursive(n-1);
		
		
	}
	
	public static int factorial_recursive(int n) {
		
		if(n == 0)
			return 1;
		else
			return n * factorial_recursive(n-1);
		
	}
	
	public static int length(String str) {
		
		if(str.isEmpty())
			return 0;
		else
			return 1 + length(str.substring(1)); // 1 + "ello World; // 1 + 1 + "llo World" , ...
		
	}
	
	
	public static void main(String[] args) {

		
		int sum = sum_recursive(5);
		
		System.out.println(sum);
		
		int factorial = factorial_recursive(5);
		
		System.out.println(factorial);
		
		int length = length("Hello World");
		
		
		System.out.println(length);
		
	
		
	}

}
