
/**
 * Ryan Mazari (40241379)
 * COMP 249 
 * Assignment #0
 * Due February 3
 */


import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class stores the breadboard, the position of each player, and the number of players playing.
 */
    public class LadderAndSnake {
 
	    private int [][] board ={ 
	    		{100,99,98,97,96,95,94,93,92,91},
	    		{81,82,83,84,85,86,87,88,89,90},
	    		{80,79,78,77,76,75,74,73,72,71},
	    		{61,62,63,64,65,66,67,68,69,70},
	    		{60,59,58,57,56,55,54,53,52,51},
	    		{41,42,43,44,45,46,47,48,49,50},
	    		{40,39,38,37,36,35,34,33,32,31},
	    		{21,22,23,24,25,26,27,28,29,30},
	    		{20,19,18,17,16,15,14,13,12,11},
	    		{1,2,3,4,5,6,7,8,9,10},
		              };		   
	    
	    private int NumOfPlayers; 
	    private int position1;     
	    private int position2;     

	    /**
	     * This method is the constructor.
	     * @param NumOfPlayers stores the number of players playing.
	     * @param pos1 stores the position of player 1.
	     * @param pos2 stores the position of player 2.
	     */
	    

    public LadderAndSnake (int NumOfPlayers, int pos1, int pos2) {  
	    this.NumOfPlayers = NumOfPlayers; 
	    this.position1 = pos1; 
	    this.position2 = pos2; 
		
    }
       /**
       * This method will set the number of players to 2.
       * @param n stores the number of player the user inputs. 
       */
    
    public void setNumOfPlayers(int n) { 
	   if (n > 2) {
		 this.NumOfPlayers = 2;
	System.out.println("*** Warning, the number of players is greater than 2. ***\nIt is now set to 2 by default.");
	}
	   if (n < 2)
		   System.out.println("*** Warning, the number of players is smaller than 2. ***\nIt is now set to 2 by default. ");
		this.NumOfPlayers = 0;
	  if (n == 2)
		  this.NumOfPlayers = 2;
		 
    }
    /**
     * This method displays the board as an ouput. 
     */

    public void displayBoardLaddersSnakes() {  
    	System.out.print("           \t\t");
    	System.out.print(" | " + board[0][0] + "|    | " + board[0][1] + " |" +  "    | " + board[0][2] + " |" + "    | " + board[0][3] + " |" + "    | " + board[0][4] + " |" +
    			"    | " + board[0][5] + " |" + "    | " + board[0][6] + " |" + "    | " + board[0][7] + " |" + "    | " + board[0][8] + " |" + "    | " + board[0][9] + " |");
    	System.out.println("\n\n");
       // 100 to 91.
    	
    	for (int i = 1; i < 9; i++) {
    		System.out.print("           \t\t");
    	    for (int j = 0; j < 10; j++) {
    	        System.out.print(" | " + board[i][j] + " |");
    	        System.out.print("   ");
    	    }
    	    System.out.println("\n\n");
    	    
    	    }
    	// 90 to 11.
    	
    	System.out.print("           \t\t");
    	System.out.print(" | " + board[9][0] + "  |    | " + board[9][1] + "  |" +  "    | " + board[9][2] + "  |" + "    | " + board[9][3] + "  |" + "    | " + board[9][4] + "  |" +
    			"    | " + board[9][5] + "  |" + "    | " + board[9][6] + "  |" + "    | " + board[9][7] + "  |" + "    | " + board[9][8] + "  |" + "    | " + board[9][9] + " |");
    	System.out.println("\n\n");
    	// 10 to 1.
    	
     }
    /**
     * This method sets the position of player 1 on the board.
     * @param pos1 stores the position of player 1.
     */
    
    public void setPosition1 (int pos1) { 
    
    	             this.position1 = pos1;
    	
    }
    /**
     * This method stores the position of player 2 on the board.
     * @param pos2 stores the position of player 2.
     */
    
    public void setPosition2 (int pos2) { 
    	
    	             this.position2 = pos2;
    	
    }
    /**
     * This method returns the position of player 1.
     * @return the position of player 1.
     */
    
    public int getPosition1 () { 
    
                     return position1;	
    	
    }
    /**
     * This method returns the position of player 2.
     * @return returns the position of player 2.
     */
    
    public int getPosition2 () { 
    	
    	             return position2;
    	
    }
    /**
     * This method flips the dice of the board game.
     * @return returns a random value of 1 to 6. 
     */
   
    
    public int flipDice () { 
    
    	int min = 1, max = 6;
    	
    	return ThreadLocalRandom.current().nextInt(min,max);
    	
	}
    /**
     * This method makes player 1 play the game:
     * 1. Rolling the dice.
     * 2. Set position before looking for snakes and ladders.
     * 3. Set position after looking for snakes and ladders.
     * @param name stores the name of player 1.
     */
    
    public void play1(String name) { 
    	                  
    	int roll = 0;
    	Scanner rollthedice1 = new Scanner(System.in);
    	
    	while (roll == 0) {
    	System.out.print("\nType \"roll\", if you want to roll the dice: ");
    	String answer = rollthedice1.next().toLowerCase();
    	if (answer.equals("roll"))
    	{
    		roll = 1;
    	int index1 = flipDice();
    	System.out.println("The dice value is " + index1 + ".");
    	position1 += index1; 
    	
    	   //   Snakes
   	        if (position1 == 16)   
   	        	{System.out.println(name + " just hit a snake at position 16. Sorry but you have to go down to a lower position: 6!");
               	this.position1 = 6;}
   	        
   	        else if (position1 == 48)
   	        	{System.out.println(name + " just hit a snake at position 48. Sorry but you have to go down to a lower position: 30!");
   	            this.position1 = 30;}
   	        
   	        else if (position1 == 64)
   	            {System.out.println(name + " just hit a snake at position 64. Sorry but you have to go down to a lower position: 60!");
   	        	this.position1 = 60;}
   	        
   	        else if (position1 == 79)
   	            {System.out.println(name + " just hit a snake at position 79. Sorry but you have to go down to a lower position: 19!");
   	        	this.position1 = 19;}
   	        
   	        else if (position1 == 93)
   	            {System.out.println(name + " just hit a snake at position 93. Sorry but you have to go down to a lower position: 68!");
   	        	this.position1 = 68;}
   	        
   	        else if (position1 == 95)
   	            {System.out.println(name + " just hit a snake at position 95. Sorry but you have to go down to a lower position: 24!");
   	        	this.position1 = 24;}
   	        
   	        else if (position1 == 97)
   	            {System.out.println(name + " just hit a snake at position 97. Sorry but you have to go down to a lower position: 76!");
   	        	this.position1 = 76;}
   	        
   	        else if (position1 == 98)
   	            {System.out.println(name + " just hit a snake at position 98. Sorry but you have to go down to a lower position: 78!");
   	        	this.position1 = 78;}
   	        
   	        //   Ladders
   	        
   	        else if (position1 == 1)
   	     {System.out.println(name + " just hit a ladder at position 1. Happy for you, you go up to a higher position: 38!");
   	        	this.position1 = 38;}
   	        
   	        else if (position1 == 4)
   	     {System.out.println(name + " just hit a ladder at position 4. Happy for you, you go up to a higher position: 14!");
   	        	this.position1 = 14;}
   	        
   	        else if (position1 == 9)
   	     {System.out.println(name + " just hit a ladder at position 9. Happy for you, you go up to a higher position: 31!");
   	        	this.position1 = 31;}
   	        
   	        else if (position1 == 21)
   	     {System.out.println(name + " just hit a ladder at position 21. Happy for you, you go up to a higher position: 42!");
   	        	this.position1 = 42;}
   	        
   	        else if (position1 == 28)
   	     {System.out.println(name + " just hit a ladder at position 28. Happy for you, you go up to a higher position: 84!");
   	        	this.position1 = 84;}
   	        
   	        else if (position1 == 36)
   	     {System.out.println(name + " just hit a ladder at position 36. Happy for you, you go up to a higher position: 44!");
   	        	this.position1 = 44;}
   	        
   	        else if (position1 == 51)
   	     {System.out.println(name + " just hit a ladder at position 51. Happy for you, you go up to a higher position: 67!");
   	        	this.position1 = 67;}
   	        
   	        else if (position1 == 71)
   	     {System.out.println(name + " just hit a ladder at position 71. Happy for you, you go up to a higher position: 91!");
   	        	this.position1 = 91;}
   	        
   	        else if (position1 == 80)
   	     {System.out.println(name + " just hit a ladder at position 80. Happy for you, you go up to a higher position: 100!");
   	        	this.position1 = 100;}
    	}
    	else 
    		{System.out.println("Invalid answer, try again.");
    		roll = 0;}
   	        	 	  	
    	}
    	
    }

    /**
     * This method makes player 2 play the game:
     * 1. Rolling the dice.
     * 2. Set position before looking for snakes and ladders.
     * 3. Set position after looking for snakes and ladders.
     * @param name stores the name of player 2.
     */
    
    public void play2 (String name) { 
    	                  
    	int roll = 0;
    	Scanner rollthedice2 = new Scanner(System.in);
    	
    	while (roll == 0) {
    	System.out.print("\nType \"roll\", if you want to roll the dice: ");
    	String answer = rollthedice2.next().toLowerCase();
    	if (answer.equals("roll"))
    	{
    	roll = 1;
    	int index2 = flipDice();
    	System.out.println("The dice value is " + index2+ ".");
    	position2 += index2;
    	
           //   Snakes
	        if (position2 == 16)   
	        {System.out.println(name + " just hit a snake at position 16. Sorry but you have to go down to a lower position: 6!");
           	this.position2 = 6;}
	        
	        else if (position2 == 48)
	        {System.out.println(name + " just hit a snake at position 48. Sorry but you have to go down to a lower position: 30!");
	            this.position2 = 30;}
	        
	        else if (position2 == 64)
	        {System.out.println(name + " just hit a snake at position 64. Sorry but you have to go down to a lower position: 60!");
	        	this.position2 = 60;}
	        
	        else if (position2 == 79)
	        {System.out.println(name + " just hit a snake at position 79. Sorry but you have to go down to a lower position: 19!");
	        	this.position2 = 19;}
	        
	        else if (position2 == 93)
	        {System.out.println(name + " just hit a snake at position 93. Sorry but you have to go down to a lower position: 68!");
	        	this.position2 = 68;}
	        
	        else if (position2 == 95)
	        {System.out.println(name + " just hit a snake at position 95. Sorry but you have to go down to a lower position: 24!");
	        	this.position2 = 24;}
	        
	        else if (position2 == 97)
	        {System.out.println(name + " just hit a snake at position 97. Sorry but you have to go down to a lower position: 76!");
	        	this.position2 = 76;}
	        
	        else if (position2 == 98)
	        {System.out.println(name + " just hit a snake at position 98. Sorry but you have to go down to a lower position: 78!");
	        	this.position2 = 78;}
	        
	        //   Ladders
	        
	        else if (position2 == 1)
	        {System.out.println(name + " just hit a ladder at position 1. Happy for you, you go up to a higher position: 38!");
	        	this.position2 = 38;}
	        
	        else if (position2 == 4)
	        {System.out.println(name + " just hit a ladder at position 4. Happy for you, you go up to a higher position: 14!");
	        	this.position2 = 14;}
	        
	        else if (position2 == 9)
	        {System.out.println(name + " just hit a ladder at position 9. Happy for you, you go up to a higher position: 31!");
	        	this.position2 = 31;}
	        
	        else if (position2 == 21)
	        {System.out.println(name + " just hit a ladder at position 21. Happy for you, you go up to a higher position: 42!");
	        	this.position2 = 42;}
	        
	        else if (position2 == 28)
	        {System.out.println(name + " just hit a ladder at position 28. Happy for you, you go up to a higher position: 84!");
	        	this.position2 = 84;}
	        
	        else if (position2 == 36)
	        {System.out.println(name + " just hit a ladder at position 36. Happy for you, you go up to a higher position: 44!");
	        	this.position2 = 44;}
	        
	        else if (position2 == 51)
	        {System.out.println(name + " just hit a ladder at position 51. Happy for you, you go up to a higher position: 67!");
	        	this.position2 = 67;}
	        
	        else if (position2 == 71)
	        {System.out.println(name + " just hit a ladder at position 71. Happy for you, you go up to a higher position: 91!");
	        	this.position2 = 91;}
	        
	        else if (position2 == 80)
	        {System.out.println(name + " just hit a ladder at position 80. Happy for you, you go up to a higher position: 100!");
	        	this.position2 = 100;}
	        }
    	else 
    		{roll = 0;
    	System.out.println("Invalid answer, try again.");}
    	
    	}
   
   
        }

    
    
    
    
    }
      
      
    

