
//-----------------------------------------------------------------
//Assignment 1
//Written by: Ryan Mazari (40241379)
//For COMP 248 Section ECDX - Fall 2022
//-----------------------------------------------------------------


import java.util.Scanner; 
//I imported this class "Scanner" in order to get input from the keyboard.

public class A1_Q1 {

	public static void main(String[] args) {
		
System.out.println("Welcome to the Simple 3D-Space Program:");
// I just displayed a welcome message to the user of the program.
System.out.println("+++++++++++++++++++++++++++++++++++++++");

final double PI = 22.0/7, E = 2.718281828;
//I just defined the two constants in this problem. 

Scanner myKeyboard = new Scanner(System.in);
// I just created what will be my input from the keyboard.
System.out.print("Please, enter the values for \'p\' and \'q\',");
                            System.out.print(" simultaneously: ");    
// This is the prompt message for the user to enter values for p and q.
                            
byte p = myKeyboard.nextByte();
byte q = myKeyboard.nextByte();
//The two variables "p" and "q" are created via input from the keyboard.
// The numerical type "byte" is used, so any value above 127 will result in an exception in thread.

double x = p * PI / E + 50, y = p * PI / E + 50 * 12, z = q + y;
//I just created the formulas for the location of each point x, y, and z.

		System.out.println("\nThe Cartesian coordinates of the first object is:");
	System.out.println("(" + x + ", " + y + ", " + z + ")");
	// I just displayed the first Cartesian coordinate. 
	
	y = x * 12;       // Equation for the new value of y.
	z = q + y * 6;    // Equation for the new value of z.

	System.out.print("The Cartesian coordinates of the nearest object");
	                        System.out.println(" is:");
	 System.out.println("(" + x + ", " + y + ", " + z + ")");
	 // I just displayed the second Cartesian coordinate with new values of y and z.
	 
	 System.out.println("\nThank you for your contribution to this Space Project.");
	 // I just displayed a complimentary-close message to the user. 
	// the "/n" is used here to skip a line

myKeyboard.close();    // I just closed the Scanner myKeyboard (to get input 
                       // from the keyboard).
 

	}
// end of the main
}
// end of class A1_Q1













