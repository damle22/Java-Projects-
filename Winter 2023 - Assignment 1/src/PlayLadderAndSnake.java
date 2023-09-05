
/**
 * Ryan Mazari (40241379)
 * COMP 249 
 * Assignment #0
 * Due February 3
 */

import java.util.Scanner;

   /**
    * The driver welcomes the users to the game. It asks the name of the two players willing to play the game. It decides the order of play between the two
    * players by rolling the dice. It tells the number of attempts it took to find who plays first. Afterwards, it plays the game until one player wins: get
    * to position number 100. Then, it displays a winning and closing message to the user.
    */

public class PlayLadderAndSnake  {

/**
 * 
 * @param args is the main.
 */
 	public static void main(String[] args) {

		
	Scanner myKeyboard= new Scanner (System.in);
		
	
	LadderAndSnake layout = new LadderAndSnake(0,0,0); // Snake and Ladder Object.
	 
	   Player player1 = new Player(); // Player 1.
       Player player2 = new Player();  // Player 2.
       
    System.out.println("Made by Ryan Mazari\n\n");   
   	
   
   	System.out.println("\t\t\t\t\t\t\tWelcome to Ladder and Snake Game\n\t\t\t\t\t   *************************************************************\n\n");
   	    // Welcoming message 
   	    layout.displayBoardLaddersSnakes(); // Displaying the board.
   	
    	System.out.print("How many players are they? ");
    	int num = myKeyboard.nextInt();
   	    layout.setNumOfPlayers(num);
   	    // Just set the number of players.
   	
 	
   	 String z; // will store yes or no.
       
	   
	   do {
	System.out.print("\nWho are the two players? ");	
	      String x = myKeyboard.next();
	      String y = myKeyboard.next();
	     // Asking the name of the two players.
          
       player1.setName(x);   
       player2.setName(y);
       // Setting the name of the two players.
		
     System.out.print("\nThe two players selected are:\t  Player 1 - " + player1.getName() + " AND Player 2 - " + player2.getName() + ". \t\tIs this correct (yes/no)? ");  
     z = myKeyboard.next().toLowerCase();
     
     if (z.equals("yes"))
		System.out.println("Perfect !");
     else 
     { 
    	 z = "no";
    	 System.out.print("Then, try again.");
                                                  }
	   } while (z.equals("no"));
	
	  System.out.println("______________________________________________________________________________________________________________________________________");
	   
	  System.out.println("\nNow, the order of playing turns will be decided."); 
	  int numofattempts = 0;
	  // Playing turns are decided, as well as the number of attemps taken.
	  
	  while (layout.getPosition1() ==layout.getPosition2())   {
		    int r1 = 1, r2 = 1;
	             
	  
	           while (r1 == 1) // Player 1
	            {
		         System.out.print("\nTo roll the dice for player 1, type \"roll\": ");
		          String roll1 = myKeyboard.next().toLowerCase(); 
		  
	              if (roll1.equals("roll"))
	                 {
	                    int dice1 =layout.flipDice();
	                     layout.setPosition1(dice1);
	   
	                      System.out.println("Player 1 rolls the dice, and the number is " + layout.getPosition1() + ".");
	                      r1 = 0;
	                        }
	                         else
	                          System.out.print("Oups, try again!");
	    	  
	                            }
	 System.out.println();
	             
  	 
  	  
  	            while (r2 == 1) // Player 2
	          {
  	       	   System.out.print("To roll the dice for player 2, type \"roll\": ");
    	        String roll2 = myKeyboard.next().toLowerCase();
  		
	               if (roll2.equals("roll"))
	               {
	                    int dice2 = layout.flipDice();
	                     layout.setPosition2(dice2);
	   
	                      System.out.println("Player 2 rolls the dice, and the number is " + layout.getPosition2() + ".\n");
	                      r2 = 0;
	                        }
	                          else
		                    System.out.print("Oups, try again!");
	          }
  	  
	  if (layout.getPosition1() == layout.getPosition2())
	  {System.out.println("\nSince both players are at the same position, you have to roll the dice again in order to know who plays first.\n");
	  numofattempts+= 1; // Recording the number of attemps taken and telling the user to try again.
	  }
	              }
	  
	  // Displaying the number of attemps and the playing order.
	  System.out.print("-------------------------------------------------------------------------------------------");
	  System.out.print("\nIt took " + numofattempts + " attempts to find who will go first: ");
	  if (layout.getPosition1() > layout.getPosition2())  {
		  player1.setTurn(1);  // 1 plays first
		  player2.setTurn(0);  // 0 plays second
	      System.out.println(player1.getName() + " is playing first and " + player2.getName() + " second!");
	  }
	  
	  if (layout.getPosition2() > layout.getPosition1()) {
		  player2.setTurn(1); // 1 plays first
		  player1.setTurn(0); // 0 plays second
	      System.out.println(player2.getName() + " is playing first and " + player1.getName() + " second!");
	  }
	  System.out.print("-------------------------------------------------------------------------------------------");
	  
	  System.out.println("\n\n");
      System.out.print("\t LET'S HAVE FUN !\n\n");	
	  
	
	  // Initially setting the position to zero for both players. 
	  layout.setPosition1(0);
	  layout.setPosition2(0); 
	 
	 
	  while (layout.getPosition1() != 100 && layout.getPosition2() != 100)   { // As long as no player reaches position 100, it will go on.
		
		  if (player1.getTurn() == 1)  {      //  *** PLAYER 1 ***
	   		layout.play1(player1.getName());  // Player 1 plays.
	   	  if (layout.getPosition1() > 100)    // If position is larger than 100.
	   	  {
	   		  int reminder = (100 - layout.getPosition1()) * -1;
	   		  int newposition1 = 100 - reminder;
	   		  layout.setPosition1(newposition1);
	   	  }
	      if (layout.getPosition1() == layout.getPosition2()) // If both players are at the same position.
	   			{layout.setPosition2(0);
	   			System.out.println(player1.getName() + " just ejected " + player2.getName() + " from its position, going to position zero.\n");
	   			}
	   		System.out.println(player1.getName() + " is now at position " + layout.getPosition1() + ".\n~~~~~~~~~~~~~~~~~~~~~~~~~~\nIt is now " + player2.getName() + "'s turn, roll the dice " + player2.getName() + "!");
	   		
	   	  player1.setTurn(0); // Switching turns.
	   	  player2.setTurn(1);
	   	  }
		  
		  
	   	  else if (player2.getTurn() == 1)  {    //  *** PLAYER 2 ***
	   		  layout.play2(player2.getName());   // PLayer 2 plays.
	   		 if (layout.getPosition2() > 100)   // If position is lager than 100.
		   	  {
		   		  int reminder = (100 - layout.getPosition2()) * -1;
		   		  int newposition2 = 100 - reminder;
		   		  layout.setPosition2(newposition2);
		   	  }
	   		   if (layout.getPosition1() == layout.getPosition2()) // If both players are at the same position.
   			   {layout.setPosition2(0);
   			   System.out.println(player1.getName() + " just ejected " + player2.getName() + " from its position, going to position zero.\n");
   			   }
	   		System.out.println(player2.getName() + " is now at position " + layout.getPosition2() + ".\n~~~~~~~~~~~~~~~~~~~~~~~~~~\nIt is now " + player1.getName() + "'s turn, roll the dice " + player1.getName() + "!");
	   		  
	   	  player1.setTurn(1); // Switching turns.
	   	  player2.setTurn(0);	   
		  }
		  
		  
	                                                                         } 
	   if (layout.getPosition1() == 100) // If player 1 reaches 100, a winning message is displayed.
		   System.out.println("\n\n\nOups, sorry " + player2.getName() + " if you cannot roll the dice. Looks like we got a WINNER: Congratulations " + player1.getName() + ", you just won the game!");
	   
	   if (layout.getPosition2() == 100) // If player 2 reaches 100, a winning message is displayed.
		   System.out.println("\n\n\nOups, sorry " + player1.getName() + " if you cannot roll the dice. Looks like we got a WINNER: Congratulations " + player2.getName() + ", you just won the game!");
	   
	   
	   
myKeyboard.close();
	  }
	
	
	}
