
public class TowerOfHanoi {

	
	public static void MoveDisk(char from, char to) {
		
		System.out.println(from + "->" + to);
	}
	
	public static void MoveTower(int n, char start, char finish, char spare) {
		
		if(n == 1) 
			MoveDisk(start,finish);
		else {
			MoveTower(n-1, start, spare, finish); 
			MoveDisk(start, finish);              
			MoveTower(n-1, spare, finish, start); 
		}
		
	}
	
	public static void main(String[] args) {
	
		int n = 3;
		
		MoveTower(n, 'A', 'B', 'C');

	}

}
