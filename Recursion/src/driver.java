


/* Recursion = recursive call
Recursion is used to solve problems of a given size "N".
 

*/

public class driver {

	private static void  sayHi(int count) {
		
		    System.out.println("hi!");
		
		    if  (count <= 1)
		     return;
		
		    sayHi(count - 1);
		    
		
	}
	
	public static void main(String[] args) {
		
		
	
		sayHi(3);
		
		
		
		
	}

}
