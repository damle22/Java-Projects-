 package AnonymousInnerClasses;

public class driver {

	public static void main(String[] args) {
		
		Greetings english = new Greetings() {
			
			public void sayHello() {
				
				System.out.println("hello");
			}
		};
		
        Greetings french = new Greetings() {
			
			public void sayHello() {
				
				System.out.println("bonjour");
			}
		};

        Greetings spanish = new Greetings() {
	
	         public void sayHello() {
		
		       System.out.println("hola");
	        }
        };

        english.sayHello();
        french.sayHello();
        spanish.sayHello();
		

	}

}
