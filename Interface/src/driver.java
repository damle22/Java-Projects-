

//Java classes: 1. Concrete (all methods are defined) 2. Abstract (Some are not defined) 3. Interface (none are defined)

public class driver {

	public static void main(String[] args) {
		
		
		Rabbit rab = new Rabbit();

		rab.flee();
		
		Hawk haw = new Hawk();
		
		haw.hunt();
		
		Fish fis = new Fish();
		
		fis.flee();
		fis.hunt();
	
		
		

	}

}
