
public class main_2 {

	public static void validateAge(int age) throws AgeLessThanZeroException {
		
		if (age < 0)
			 throw new AgeLessThanZeroException(); 
		
		
	}
	
	
	public static void main(String[] args) {
		
		try {
		validateAge(-111);
		}
		catch(AgeLessThanZeroException e) {
			System.out.println(e.getMessage());
			
		}

	}

}
