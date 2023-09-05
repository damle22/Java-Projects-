
//---------------------------------------------------
// Assignment 2
//
// For COMP 248 Section ECDX - Fall 2022
//---------------------------------------------------


import java.util.Scanner;      
// I just imported the class Scanner in order to get input from the keyboard later on.


public class A2_Q1 {

	public static void main(String[] args) {
		
System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
System.out.println("Welcome to My City Recycling Program:");
//This is the Welcoming message displayed to the user.

System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");
System.out.println("Item Recyling Code. |--> Item samples");
System.out.println("------------------------------------");
System.out.println("1. |-->[Soft drink bottles/Trash cans]");
System.out.println("2. |-->[Shampoo bottles/Yogurt containers]");
System.out.println("3. |-->[Plastic bags]");
System.out.println("4. |-->[Storage bins/Brooms/Brushes]");		
System.out.println("5. |-->[Garden hoses/Piping]");
System.out.println("6. |-->[Carry-out food containers]");
System.out.println("7. |-->[Plastic straws/Chip bags/Coffee pods]");
System.out.println("8. |-->[Cell phone/Computer/Camera/Batteries]");
System.out.println("9. |-->[TV remote/Flashlight batteries]");
System.out.println("10.|-->[Car batteries]");
System.out.println("11.|-->[Cereral/Snack Cardboard boxes]");
System.out.println("12.|-->[Newspaper/Books/Wallpaper]");
System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n");

// I just displayed the recycling code for the user, so he can later on enter a recycling code.


Scanner myKeyboard = new Scanner(System.in);
// I just initialized my Scanner since I will be getting input from the keyboard soon. 
System.out.print("Please enter the Recycling code, from the above, that corresponds to the");
System.out.print(" item you want to recycle: ");
// Here, I am displating a message for the user to enter a recycling code. 
int number = myKeyboard.nextInt();
// The recycling code is stored in the variable called "number", which is an integer.
// This variable is obtained through input from the keyboard (from where the necessity of a class Scanner)



// Here, I am using if-else statements to display the correct message linked to the user's previous input.

if ((number <= 5 && number >= 1) || (number <= 12 && number >= 11))
{  System.out.println("This is a Recycled Plastics/Paper item.");
   System.out.println("Item required to be put in the blue household recycling bin.");
   System.out.println("\nThank you for saving the planet!");
}
// Here, if the user entered a value between 5 and 1 inclusively OR  a value between 12 and 11 inclusively, this means it is 
// a recycled Plastics/Paper items. A message is displayed, telling the user the type of the item and some instructions on how to dispose of it.
//Another message is displayed, saying thank you to the use for saving the planet.

else if (number <= 7 && number >= 6)
{  System.out.println("This is a Non-Recycled Plastics item.");
   System.out.println("Item required to be put in the gray household garbage bin.");
   System.out.println("\nThank you for saving the planet!");
}
// Here, if the user entered a value between 7 and 6 inclusively, the means it is a non-recycled plastic item. 
// A message saying the type of item and some instructions on how to dispose of it is displayed. 
//Another message is displayed, saying thank you to the use for saving the planet.

else if (number <= 10 && number >= 8)
{  System.out.println("This is a battery item.");
   System.out.println("Item required to be taken to your local recycling depot or nearby store for disposal.");
   System.out.println("\nThank you for saving the planet!");
}
//Here, if the user entered a value between 10 and 8 inclusively, this means it is a battery item. A message is displayed,
// saying the type of item and some instructins on how to dispose of it.
//Another message is displayed, saying thank you to the use for saving the planet.

else if (number <= 127 && number >= 13)
{  System.out.println("This item is N/A.");
   System.out.println("Item code not handled by the city recycling system.");
   System.out.println("Kindly check the nearby city(ies) for possible recycling availability");
   System.out.println("\nThank you for saving the planet!");
}
// Here, if the user entered a value between 127 and 13 inclusively, a message saying that the item code is not handle by the city 
// is displayed. Another message is displayed, saying to look for other cities for possible recycling availabilities.
//Another message is displayed, saying thank you to the use for saving the planet.

else if (number <= 0 && number >= -128)
{  System.out.println("This is Hazardous material.");
   System.out.println("Material required to be put in a hazardous dumpster diving.");
   System.out.println("Kindly check your area for nearby one.");
   System.out.println("\nThank you for saving the planet!");
}
// Here, if the user entered a value between 0 and -128 inclusively, this means it is a hazardous material. 
// A message saying the type of item and some instructions on how to dispose of it is displayed.
// Another message is displayed, saying thank you to the use for saving the planet.

else 
	System.out.println("Error: Your recycling Code is not a valid integer between -128 to 127. Kindly retry again.");

// Here, if the user entered any value OTHER than what has been set previously, an error message is displayed.
// The user is invited to try again, telling him that his recycling code is not a valid integer between -128 to 127.
	
	

myKeyboard.close();

// Here, I just closed my Scanner. 


	} // End of main 

}   // End of class
