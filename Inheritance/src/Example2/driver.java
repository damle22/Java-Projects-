package Example2;

public class driver {

	public static void main(String[] args) {
	
		Sedan s1 = new Sedan();
		
		Car c1 = new Sedan(125,35,"BMW");
		
		Sedan s2 = (Sedan) c1;
		
		s2.setMaxSpeed(100000);
		
		Car c2 = s1; // good
		s2 = (Sedan) c2;
		
		s2.vroum();
		

		System.out.println(s2.getMaxSpeed());
		System.out.println(c1.getMaxSpeed());

	}

}
