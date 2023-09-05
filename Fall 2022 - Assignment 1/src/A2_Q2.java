
//---------------------------------------------------
// Assignment 2
// 
// For COMP 248 Section ECDX - Fall 2022
//---------------------------------------------------

import java.util.Scanner;     // I just imported my Scanner (what will allow me to get input from the keyboard)

public class A2_Q2 {

	public static void main(String[] args) {
		
		Scanner myKeyboard = new Scanner(System.in);  // I initialized and created my Scanner (myKeyboard)
        String month_market;      // I created a string called "month_market", which will store the sentence from the user.
		
        
        final double W;
        double p;
        double i;
    // I just created the variables for what will be the price index equation (I).
        
        
		System.out.println("Wecome to Farms Distribution Center Price Index Program:");
	// This is the welcoming message to the user.
		
		System.out.println("========================================================\n");
		System.out.print("Please enter a Month and Market, respectively: ");
	// I am prompting the user to input a month and a market, respectively.
		
		month_market = myKeyboard.nextLine();
	// In order to store this small sentence ( month + market), I need a string where the input comes from the user. 
	// Hence, a string of the from myKeyboard.nextLine is required.
		
		String month_market2 = month_market.toLowerCase();
	// Here, if I want my input to be case-insensitive, I need to modify the previous string.
	// Hence, the new string equals the previous string, all in lowercase. 
		
	switch(month_market2)
	// Here, whatever the input in lowercase will be, if the input all in lower case matches the sentence inside the brackets,
	// the statement inside this specific case will be executed.
	
	{
	case "january domestic" :
	    p = 75.25; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
	    break;
	// Here, if the input all in lower case matches (so equals) "january domestic", the value of p is 75.25, the constant W = 1.4672, 
	// and the value of "i" is calculated by the given equation.
	// Afterwards, the value of "i", the price index, is displayed and rounded off to 2 decimal places by using Math.round. 
	// Note that a break statement is used after the case, telling the computer to jump out of the switch statement.
	// *** The process is indentical for all the following cases. ***
	    
	case "january international" : 
	    p = 24.75; W = 1.4672; i = (1.0 / 20) * (p * W);
	    System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
	    break; 
	  
	case "february domestic" : 
		p = 62.86; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
	
	case "february international" : 
		p = 37.14; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
	
	case "march domestic" : 
		p = 54.78; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
	
	case "march international" : 
		p = 45.22; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;	
		
	case "april domestic" : 
		p = 68.46; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "april international" : 
		p = 31.54; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "may domestic" : 
		p = 35.89; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "may international" : 
		p = 64.11; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "june domestic" : 
		p = 28.94; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "june international" : 
		p = 71.06; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "july domestic" : 
		p = 42.50; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "july international" : 
		p = 57.5; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "august domestic" : 
		p = 86.10; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "august international" : 
		p = 13.9; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "september domestic" : 
		p = 69.7; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "september international" : 
		p = 30.3; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "october domestic" : 
		p = 85.4; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "october international" : 
		p = 14.6; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "november domestic" : 
		p = 75.9; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "november international" : 
		p = 24.1; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "december domestic" : 
		p = 76.8; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is: " + Math.round(i * 100.0) / 100.0);
		break;
		
	case "december international" : 
		p = 23.2; W = 1.4672; i = (1.0 / 20) * (p * W);
		System.out.println("\nThe value of the Price Index, \'I\', is:" + Math.round(i * 100.0)/ 100.0);
		break;
	
		
		default :
		System.out.println("Error: An invalid value has been entered for the \'Market\' variable. Please retry again!");
		System.out.println("\nThe value of the Price Index is, \'I\', is : 0.00");
		
	// Here, if no user input, all in lowercase, does not match (so equals) any cases, an error message is displayed 
	// to the user, telling him that an invalid value has been entered and to try again.
	// The value of the price index turns out to be automatically zero.
	// This is done by the use of a default statement.
		
	}	
		
		
	System.out.println("Thank you for using Farms Distribution Center Price Index Program!");
		
		// This is a complementary-close message to the user. 
		
		myKeyboard.close();
		
// I just closed the Scanner. 

		
	}   // End of the main.

	
	
		
	}    // End of the class. 

