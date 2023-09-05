

import java.util.Scanner; // I imported this class "Scanner" in order to get input from the keyboard.

public class A1_Q2 {

	public static void main(String[] args) {
		
Scanner myKeyboard = new Scanner (System.in);
// I just created what will be my input from the keyboard.

System.out.println("Welcome to the Simple Meteorological Program:");
//I just displayed a welcome message to the user of the program.
System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
//I just displayed the line of +'s as requested.

System.out.print("Please enter the values for the \'Fahrenheit\' and ");
          System.out.print("\'Celsius\' scale, simultaneously: ");
// This is the prompt message for the user to enter values for Fahrenheit and Celsius.  
          
double fahrenheit = myKeyboard.nextInt();
double celsius = myKeyboard.nextInt();
// I just created the two variables that will be assigned via input from the keyboard. 

double convertion_fahrenheit_to_celsius = (10.0 / 18) * (fahrenheit - 32);
double convertion_celsius_to_fahrenheit = (18.0 / 10) * celsius + 32;
//I just created my two equations that will help me convert to its equivalent.

System.out.print("\nThe corresponding temperature in Celsius unit is: ");
    System.out.println(convertion_fahrenheit_to_celsius);
   //Message displaying the convertion from fahrenheit to celsius.
    
    System.out.print("The corresponding temperature in Fahrenheit unit is: ");
    System.out.println(convertion_celsius_to_fahrenheit);
  // Message displaying the convertion from celsius to fahrenheit.   
    
    double x = Math.round(convertion_celsius_to_fahrenheit) % Math.round(convertion_fahrenheit_to_celsius);
  // This is the equation created for value "x". The "%" refers to remainder and "Math.round"
  // is used to round off the temperatures, so I can get the value of the remainder.  
   
  
   System.out.println("The corresponding value for x is: " + x);
// I jsut displayed the corresponding value for x.
   
  double y = Math.pow(convertion_celsius_to_fahrenheit, convertion_fahrenheit_to_celsius);
// This is the equation created for value "y". The "Math.pow" is used to get an exponent. 
 
  System.out.println("The corresponding value for y is: "+ y + "\n");
// I just displayed the corresponding value for y.
  
  System.out.println("Thank you for using my bespoke Meteorological program!");
// I just displayed a complimentary-close message.
  
  
  
   myKeyboard.close();
   // I just closed the Scanner myKeyboard.
		
	}
// End of the main.
}
// End of the class.






