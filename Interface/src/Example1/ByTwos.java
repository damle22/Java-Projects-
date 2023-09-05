package Example1;

public class ByTwos implements Series {

	int val;
	
	
	public ByTwos() {
		
		val = 0;
	}


	@Override
	public int getNext() {
		
		val+=2;
		return val;
	}
	
	
}
