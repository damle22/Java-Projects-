package printElements;

public class driver_new {

	public static <T> void printElements(T [] array, String delimiter) {
		
		for(T elements : array)
			System.out.println(elements + delimiter);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		
		Integer[] intArray = {11,22,33,44};
		printElements(intArray, " ");
		
		Double[] doubleArray = {11.11,22.22,33.33,44.44};		
		printElements(doubleArray, " ");
		
		

	}

}
