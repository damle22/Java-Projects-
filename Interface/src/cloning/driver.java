package cloning;

public class driver {

	public static void main(String[] args) {
		
		Dog d1 = new Dog("Dog", 11, "Golden");
	
		Dog d2 = d1.clone();
		
		d2.setAge(12);
		
		System.out.println(d1.getAge());
		System.out.println(d2.getAge());
		
		
	}

}
