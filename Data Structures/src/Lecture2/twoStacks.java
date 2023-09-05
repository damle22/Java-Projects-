package Lecture2;
import java.util.*;

  class twoStacks {
	int[] arr;
	int size;
	int top1, top2;

	// Constructor
	twoStacks(int n)
	{
		size = n;
		arr = new int[n];
		top1 = n / 2 + 1;
		top2 = n / 2;
	}

	// Method to push an element x to stack1
	void push1(int x)
	{

		// There is at least one empty
		// space for new element
		if (top1 > 0) {
			top1--;
			arr[top1] = x;
		}
		else {
			System.out.println("Stack Overflow"
							+ " By element : " + x);
			return;
		}
	}

	// Method to push an element
	// x to stack2
	void push2(int x)
	{

		// There is at least one empty
		// space for new element
		if (top2 < size - 1) {
			top2++;
			arr[top2] = x;
		}
		else {
			System.out.println("Stack Overflow"
							+ " By element : " + x);
			return;
		}
	}

	// Method to pop an element from first stack
	int pop1()
	{
		if (top1 <= size / 2) {
			int x = arr[top1];
			top1++;
			return x;
		}
		else {
			System.out.print("Stack UnderFlow");
			System.exit(1);
		}
		return 0;
	}

	// Method to pop an element
	// from second stack
	int pop2()
	{
		if (top2 >= size / 2 + 1) {
			int x = arr[top2];
			top2--;
			return x;
		}
		else {
			System.out.print("Stack UnderFlow");
			System.exit(1);
		}
		return 1;
	}
};



