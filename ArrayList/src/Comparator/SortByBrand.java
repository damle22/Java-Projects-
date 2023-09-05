package Comparator;

import java.util.Comparator;

public class SortByBrand implements Comparator<Auto> {

	public int compare(Auto a1, Auto a2) {
	return a1.getBrand().compareTo(a2.getBrand());
	}
	
}
