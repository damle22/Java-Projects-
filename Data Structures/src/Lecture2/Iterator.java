package Lecture2;

import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("ice cream");
		food.add("chicken");
		
		java.util.Iterator<String> it = food.iterator();
		
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		
		
	}

}
