package Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class driver {

	public static void main(String[] args) {
		
	
		ArrayList<Auto> autos = new ArrayList<>();
		
		autos.add(new Auto("Honda",        2016, 39000.0));
		autos.add(new Auto("Mazda",        2014, 25000.0));
		autos.add(new Auto("BMW M3 Sedan", 2017, 40000.0));
		autos.add(new Auto("Toyota Lexus", 2020, 25000.0));
		autos.add(new Auto("Ford",         2019, 32000.0));
		autos.add(new Auto("Lincoln",      2017, 25000.0));

		Collections.sort(autos, new SortByBrand());
		
		for(Auto a : autos)
			System.out.println(a);
		
	}

}
