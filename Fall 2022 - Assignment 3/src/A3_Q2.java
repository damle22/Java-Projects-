
//------------------------------------------
// Assignment 3
// Written by: Ryan Mazari (40241379)			
// For COMP 248 Section EC - Fall 2022
//------------------------------------------


import java.util.Scanner;




public class A3_Q2 {

	public static void main(String[] args) {
		
		Scanner myKeyboard = new Scanner (System.in); // Initialized my Scanner.
		String candidates;    // Created what will store the full candidates's ID and name's.
		
		System.out.println("Welcome to the Simple Electronic Voting System (SEVS):"); // Welcoming message.
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++\n"); 
		System.out.println("Please enter a String collection of electoral candidates below:"); // Prompting ther user for a string collection.
		candidates = myKeyboard.nextLine().trim(); // Trim is used to remove any spaces before the first and after the last character. 
		candidates = candidates.toUpperCase();     // Bringing everything to Uppper Case, as requested. 
		String[] collection = candidates.split(",|;"); // Using split in order to divide my array. 
		// Indeed, index "0" will be the ID number, whereas index "1" will be the name of the candidate.
		int[]vote = new int [collection.length - 1]; //Created the array that will store the number of votes for each candidates.
		int[] position = new int[collection.length]; // Created the array that will store the position of each candidate.
		int condition = 1;  // This is the condition for the "do while" loop to be true.
		String question = "Enter a code, from the aformentioned, that corresponds to your task: "; // This is the first message displyed to the user.
		
		System.out.println("*********************************************");
		System.out.println("| Code >> Description                       |");
		System.out.println("*********************************************");
		System.out.println("| 1 >> Display candidates                   |");
		System.out.println("| 2 >> Vote a candidate                     |");
		System.out.println("| 3 >> Add new candidates (s)               |");
		System.out.println("| 4 >> Display results                      |");
		System.out.println("| 0 >> End SEVS                             |");
		System.out.println("*********************************************");
		System.out.println("");
		
		//This the code description that is displayed to the user. 
		
		do {
			
		System.out.print(question);
		String code = myKeyboard.nextLine().trim();
		// code is a string that takes on the "code" that the user inputs. Trim is used to remove any spaces before and after the first and last characters. 
	  
		
		switch (code) {
		
		
		case "1": // If the user enters code "1", the complete list of eligible candidates will be printed for the user.
			System.out.println("*****************************************");
			System.out.println("| ID >> Candidate's Name                |");
			System.out.println("*****************************************");
			
			for (int index = 0; index <= collection.length - 2; index = index + 2) // Using a for loop to print all the eligible candidates.
			
			System.out.println("| " + collection[index] + " >> " + collection[index + 1] + "\t\t\t\t|");
			System.out.println("*****************************************");
			System.out.println("");
			question = "Kindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ";  
			// This is the message that will be displayed to the user once out of the switch, back to "do".
		    break; // Once done with case 1, I break out of the switch statement.
		
		case "2": // If the user enters code "2", the user will vote his desired candidate.
			
			Scanner MYkeyboard = new Scanner (System.in); // Using a new Scanner in order to get the ID of the candidate the user wants to vote.
			System.out.print("\nPlease enter the ID of the candidate you wish to vote for: "); // This is the prompt message to enter an candidate's ID.
			int number = MYkeyboard.nextInt(); // The ID is stored in a variable called "number".
			String number1 = Integer.toString(number); // It is converted to a string, in order to compare it with each element of the array of candidates' ID.
		    
		
			for (int index1 = 0; index1 <= collection.length - 2; index1 = index1 + 2)
			
				if (number1.equals(collection[index1]))	// If the ID from the input is the same as the ID at index x, we add +1 vote to the index of x.
			{vote[index1] = vote[index1] + 1;
			
			System.out.println("Your ballot has been successfully casted for: " + collection[index1 + 1] + " bearing Candidate ID: " + collection[index1] + "\n" );
			// Displaying to the user that the ballot has successfully be casted for the candidate voted.
			}
				
			question = "Kindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ";
			//This is the message that will be displayed to the user once out of the switch, back to "do".				  
	      	break; // Once done with case 2, I break out of the switch statement.
			
		case "3": // If the user enters code "3", the user will be prompted to add new candidates to the already existing collection.
			Scanner MyKeyboard = new Scanner (System.in); // New scanner in order to add new candiddates.
			String new_candidates; // the string that will store the new candidates (ID  + NAME).
			System.out.println("\nPlease enter a String collection of NEW electoral candidates below:"); // Prompting the user to enter a string of NEW candidates.
			new_candidates = MyKeyboard.nextLine().trim(); // Getting input from the keyboard. Trim is used for the same purpose as previously.  
			String[] list = (candidates + ";" + new_candidates.toUpperCase()).split(",|;");	// Editing the collection array. It is now composed of the existing candidates + the new candidates.	
			System.out.println("Successfully added a NEW set of electoral candidates to the Simple Electronic System (SEVS).\n"); 
			//Telling the user that it has been successfully added. 
			question = "Kindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ";
			// This is the message that will be displayed to the user once out of the switch, back to "do".
			break; // Once done with case 3, I break out of the switch statement.
			
		case "4": // If the user enters code "4",a list of the electroral results will be displayed. 
		int floor = 0; // The variable that will play the intermediate when editing the elements of each array.
		String floor1; // Will store the intial element of collection[i].
		String floor2; // Will store the initial element of collection [i + 1].
			for (int i = 0, count = 1; i <= vote.length; i = i + 2, count++)
			
				for (int j = i + 2; j <= vote.length; j = j + 2)
					if (vote[i] < vote[j]) 
				{
					floor = vote[i]; // In order to swap, vote[i] intially must be stored somewhere. It will be in "floor".
					floor1 = collection[i]; // In order to swap, collection[i] initially must be stored somewhere. It will be in "floor1".
					floor2 = collection[i + 1]; // In order to swap, collection [i + 1] initially must be stored somewhere. It will be in "floor2".
					
					vote[i] = vote [j];   // vote at index i is now vote at index j; swapping vote
					collection[i] = collection[j]; // collection at index i is now collection at index j; swapping ID
                    collection[i + 1] = collection[j + 1]; // collection at index i + 1 is now collection at index j + 1; swapping name
					position[i] = count; // position at index i is now 1.
                    
					vote[j] = floor; // vote at index j is now vote at index j initially. 
					collection[j] = floor1; // collection at index j is now collection at index i initially.
					collection[j + 1] = floor2; // collection at index j + 1 is now collection at index i + 1 initially.
					position[j] = count + 1; // position at index j is now 2.
				}
					else if (vote[i] == vote[j]) // If two candidate have the same number of votes, it will have the same position.
			{
					position[i]= count;
			        position[j]= position[i];
			}	
			
			
	
			  // What will follow are the electoral results expressed as a small table.
			  System.out.println("*********************************************************************"); 
			  System.out.println("| Position | Votes/Ballots | ID | Candidate's Name                  |"); 
			  System.out.println("*********************************************************************");
			   
			  for (int i = 0; i <= vote.length - 1 ; i = i + 2)
				  System.out.println( "|\t " + position[i] + " |\t\t " + vote [i] + " |" + "  " + collection[i] + " | " + collection[i+1] + "\t\t\t\t    |");
			  
			  System.out.println("*********************************************************************");
			  
			  question = "\nKindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ";
			// This is the message that will be displayed to the user once out of the switch, back to "do".
			break; // Once done with case 4, I break out of the switch statement.
		
		
		
        case "0": // If the user enters the code "0", the execution of the SEVS is finsihed.
		
		System.out.println("\nThank you for using our Simple Electronic Voting System (SEVS).");
		condition = 0; // By setting condition to 0, the "do while" loop is no longer true. It will break from it.
		
		question = "Kindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ";
		
		break; 
		
		default: // If the user enters a code other than what followed, the user is now prompted to enter a new code until it matches on of the cases.
			System.out.println("");
			
			question = "Kindly continue by entering a valid code, from the aforementioned, which corresponds to your task: ";
			
		break;
		
		}
		
		}while (condition == 1);
		
		
		
		
		myKeyboard.close(); // closing my Scanner.

		}  // end of main.
	
} // end of class.
