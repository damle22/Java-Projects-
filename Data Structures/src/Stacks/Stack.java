package Stacks;

public class Stack {
	
	int stack[];
	int size;
	int top;
	
	
	public Stack(int size) {
		
		this.stack = new int [size];
		this.size = size;
		this.top = 0;
		
	}
	
	public void push(int data) {
		
		stack[top] = data;
		top++;
		
	}
	
	public int pop() {
		
		int data;
		top--;    //  Important step *** 
		data = stack[top];
		stack[top] = 0;
		
		return data;
		
	}
	
	
	public void show() {
		
		for(int n : stack)
			System.out.println(stack[n] + 1);
		
	}
	

}
