package Lecture2;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		
		Queue <String>bbqLine = new LinkedList<String>();
		
		bbqLine.add("Jackson");
		bbqLine.add("Thierry");
		bbqLine.add("Susan");
		
		
		System.out.println(bbqLine.peek()); // Here, it is Jackson
		
		bbqLine.poll(); // Returns the first element but discard it from the queue
		System.out.println(bbqLine);
		bbqLine.poll();
		System.out.println(bbqLine);
		System.out.println(bbqLine.size());
		System.out.println(bbqLine.contains("Susan"));
		System.out.println(bbqLine.toArray()[0]);
		
		

	}

}
