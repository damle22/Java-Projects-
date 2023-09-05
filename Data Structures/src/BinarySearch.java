import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int key = 20;
		int[] values = {11, 120, 356, 433, 50, 12, 20};
		Arrays.sort(values);
		
		
		System.out.println("We will search " + Arrays.toString(values) + " for the value " + key + ".");
		System.out.println(search(values, key, 0, values.length-1));
	}

	//Return the index of the value, or -1 if it is not there
	private static int search(int[] values, int key, int start, int end) {
		/*
		while(start <= end) {
			int mid = start + (end-start) / 2;
			if(key < values[mid]) end = mid - 1;
			else if(key > values[mid]) start = mid + 1;
			else return mid;
		}
		return -1;
		*/
		
		if(start > end) return -1;
		int mid = start + (end-start) / 2; // (end - start) / 2 + start 
		if(key < values[mid]) return search(values, key, start, mid - 1);
		else if(key > values[mid]) return search(values, key, mid + 1, end);
		else return mid;
	}

}
	