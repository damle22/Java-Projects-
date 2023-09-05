
//------------------------------------------
// Assignment 3
// Written by: Ryan Mazari (40241379)			
// For COMP 248 Section EC - Fall 2022
//------------------------------------------

import java.util.Scanner;    // I just imported my Scanner (I will get input from the keyboard).


public class A3_Q1 {

	public static void main(String[] args) {
		
		Scanner myKeyboard = new Scanner (System.in);  // I just initialized my Scanner.
		String plain_text;                             // Just created a string that will carry the plain text.
		
		
		System.out.println("Welcome to the 3D-Space Encryption-Decryption Program:");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
		System.out.println("Please enter your plain text below:");
		// Here, I just displayed the salutation message and asked for an input from the user.
		// The input is a sentence for the encryption-decryption algorithm.
		
		plain_text = myKeyboard.nextLine().trim();  
		// Here, the sentence will be stored in this string. Note that "trim" is used to erase any spaces before the first character 
		// and after the last character of the string.
		char []letter = new char [plain_text.length()];
		// Here, I am using an array to store each character of the string. 
		// By doing so, it is much easier to swap each character of the string. 
		
		for (int even = plain_text.length(),letterAt = 0; even % 2 == 0 && letterAt <= plain_text.length() - 1; letterAt++)
			// *** for loop EXPLICATION *****
			// int even will check if the lenght of the string is even. If it is even, the for loop MIGHT unfold (condition 1). 
			// int letterAt is a specific index on the string. It is set at zero initially, since the first index I want to look at is zero.
			// This value will incremented by +1, until it is equal to the length of the string - 1 (condition 2).	
			
		{
			if (letterAt == 0 || letterAt % 2 == 0)
            //Here, if the index on the string is zero or even, the character in this position is now replaced with the character just above it (+1). 

			{	letter[letterAt]= plain_text.charAt(letterAt + 1);
				      
			}
			else
            // Here, if the index on the string is odd and not equal to zero, the character in this position is now replaced with the character just below it (-1).
				
			{	letter[letterAt] = plain_text.charAt(letterAt - 1);
		              
			}  
		}
		    // If you noticed, I am swapping even-index character with the nearest odd-index character until the end character.        
		
	   for (int odd = plain_text.length(), letterAt = 0; odd % 2 != 0 && letterAt <= plain_text.length() - 1; letterAt++)
		    // *** for loop EXPLICATION *****
	        // int odd will check if the lenght of the string is odd. If it is odd, the for loop MIGHT unfold (condition 1). 
			// int letterAt is a specific index on the string. It is set at zero initially, since the first index I want to look at is zero.
			// This value will incremented by +1, until it is equal to the length of the string - 1 (condition 2).
		   
	   {      
		   
		   if (letterAt == 0)
			// Here, if the index of the srtring is zero, the character in this position is still the same character, no change.
			   
		    {   letter[0]= plain_text.charAt(0);	
		       
		    }
		   else if (letterAt % 2 != 0)
		    // Here, if the index of the string is odd, the character in this position is now replaced with the character just above it (+1). 
		               
			{   letter[letterAt]= plain_text.charAt(letterAt + 1);		
		             
			}
			else
		    // Here, if the index of the strinfg is even, the character in this position is now replaced with the character just below it (-1).
					
			{	letter[letterAt] = plain_text.charAt(letterAt - 1);
		              
			}  
		
	   }
		     // If you noticed, the first character is isolated while each succeeding odd-index character is switched with the nearest even-index character until the end index.
	   
	    System.out.println("");
		System.out.println("Kindly find below your encrypted text output:");
		System.out.println(letter);
		// Here, I am displaying the new string as an array of characters. 
		
		System.out.println("\n");
		System.out.println("Thank you for your contribution to this Space Project.");
		// Here, I am displaying a complimentary-close message. 

		myKeyboard.close();   // Here, I am closing my Scanner.
		
		
		
	}

	// end of the main
	
	
} 

   // end of the class

