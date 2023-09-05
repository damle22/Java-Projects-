
public class TailRecursion {

	public static void recursiveWhile(int x) {
		
		if(x<10) {
			x = x + 1;
			System.out.println(x);
			recursiveWhile(x);
		}
		
	}
	
	
	
	public static void main(String[] args) {
	
		int x = 5;
		recursiveWhile(x);
		

	}

}
