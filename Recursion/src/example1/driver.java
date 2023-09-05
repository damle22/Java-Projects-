package example1;

public class driver {

	public static void Q3(int n){
	     if ( n > 1 ){
	         Q3(n-1);
	          System.out.print(n + ""); }
	       }
	
	public static void main(String[] args) {

		
		 Q3(4);
				

	}

}
