package RawArrayToArrayList;
import java.util.ArrayList;
import java.util.Arrays;

public class driver {

	public static void main(String[] args) {
	
		
		String [] names = new String [4];
		names[0] = "Ryan";
		names[1] = "Lyly";
		names[2] = "Momy";
		names[3] = "Popi";
		
		ArrayList <String> names_new = new ArrayList<>(Arrays.asList(names));
		
		for(String a : names_new)
			System.out.print(a + " ");

		
	}

}
