package Example1;

public class driver {

	public static void main(String[] args) {
		
		
		OuterClass outer = new OuterClass();
		outer.heyThere();

		
		OuterClass.InnerClass inner = outer.new InnerClass();
		inner.whatsup();
		
		
	}

}
