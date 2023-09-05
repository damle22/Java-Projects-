
/**
 * Ryan Mazari (40241379)
 * COMP 249 
 * Assignment #0
 * Due February 3
 */


/**
 * This class creates the players, and set their turn.
 */
    public class Player {
    	
    private String name;
	private int turn;    
	
	
	/**
	 * This methods sets the name of the player. 
	 * @param name sets the name of the player.
	 */
	public void setName (String name) {
	 this.name = name;
		
	}
	/**
	 * This method set the name of the player.
	 * @return returns the name of the player.
	 */
	
	public String getName () { 
	 
	 return name; 
	}
	/**
	 * This method set the turn of the player, either to 0 or 1.
	 * @param turn set the turn of the player.
	 */
	
	public void setTurn (int turn) { 
	 this.turn = turn; 	
		
	}
	/**
	 * This method returns the turn of the player.
	 * @return returns the turn of the player.
	 */
	
	public int getTurn () { 
		
		return turn;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
