package Lecture2;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		
		
		Stack <String> games = new Stack <String>();
		
		games.add("Call of Duty");
		games.add("Fifa");
		games.add("Mario");
		
		
		System.out.println(games);
		System.out.println(games.pop());
		System.out.println(games);
		System.out.println(games.peek());
		System.out.println(games.get(0));
		System.out.println(games.push("Mario"));
		System.out.println(games);
		System.out.println(games.peek());
		
		
	}

}
