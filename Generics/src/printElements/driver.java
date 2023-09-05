package printElements;

public class driver {

    public static void printElements(Integer[] array, String delimiter) {
		
    	for(int i = 0; i < array.length; i++) 
    		System.out.println(array[i] + delimiter);

    	System.out.println();
		
		
	}

 public static void printElements(Double[] array, String delimiter) {
		
    	for(int i = 0; i < array.length; i++) 
    		System.out.println(array[i] + delimiter);

    	System.out.println();
		
		
	}
	
	
	public static void main(String[] args) {
		
		Integer[] intArray = {11,22,33,44};
		printElements(intArray, " ");
		
		Double[] doubleArray = {11.11,22.22,33.33,44.44};		
		printElements(doubleArray, " ");
		
	}
	


}
