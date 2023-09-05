package copyToRawArray;

import java.util.ArrayList;

public class driver {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<>();
		
		cars.add("Mercedes");
		cars.add("Audi");
		cars.add("BMW");
		cars.add(1, "Kia");;
		
		for(String a : cars)
		System.out.print(a + " ");
		
		String [] cars_new = new String [cars.size()] ;
		
		System.out.println();
		cars.toArray(cars_new);
		
		for(String a : cars_new)
		System.out.print(a + " ");

	}

}
