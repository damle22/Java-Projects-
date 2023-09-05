package Lecture2;

import java.util.ArrayList;
import java.util.LinkedList;

public class driver {

	public static void main(String[] args) {
		
		ArrayList <String>fruits = new ArrayList<String>();

		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add(1, "Mango");;
		System.out.println(fruits);
		System.out.println(fruits.get(0));
		
		
		LinkedList <String> autos = new LinkedList<String>();
		
		autos.add("Mercedes");
		autos.add("BMW");
		autos.add("Audi");
		
		System.out.println(autos);
		System.out.println(autos.get(0));
		
		
		LinkedList<Integer> ints = new LinkedList <Integer>();
		
		System.out.println("\n\n\n");
		
		
		// 2 Stacks Tester -----------------------------------------------------
		
		twoStacks ts = new twoStacks(5);
		ts.push1(5);
		ts.push2(10);
		ts.push2(15);
		ts.push1(11);
		ts.push2(7);
		System.out.println("Popped element from stack1 is "
						+ ": " + ts.pop1());
		ts.push2(40);
		System.out.println("Popped element from stack2 is "
						+ ": " + ts.pop2());
		

	}

}
