
public class AgeLessThanZeroException extends Exception{

	
	public AgeLessThanZeroException () {
		
		super("Your age is less than zero, do something!");
	
	}
	
	
	public AgeLessThanZeroException (String message){
		
		super(message);
		
		
	}
	
	
}
