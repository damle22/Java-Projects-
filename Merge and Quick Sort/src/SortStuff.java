import java.util.Arrays;
import java.util.Random;

public class SortStuff {

	//1
	static void mergesort (int[] input, int start, int end) {
		int[] buffer = new int[input.length];
		mergesort(input, buffer, start, end);
	}

	//End is exclusive!
	static void mergesort (int[] input, int[] buffer, int start, int end) {
		if(end-start <= 1) return;
		int mid = (start + end)/2;
		mergesort(input, buffer, start, mid);
		mergesort(input, buffer, mid, end);
		merge(input, buffer, start, mid, end);
	}
	
	
	private static void merge(int[] input, int[] buffer, int start, int mid, int end) {
		int start1 = start;
		int start2 = mid;
		int end1 = mid;
		int end2 = end;
		int i = start;
		
		while(start1 != end1 && start2 != end2) {
			if(input[start1] <= input[start2]) {
				buffer[i] = input[start1];
				start1++;
			} else {
				buffer[i] = input[start2];
				start2++;
			}
			i++;
		}
		if(start1 != end1) {
			for(;start1 < end1; start1++, i++)buffer[i]=input[start1];
		} else {
			for(;start2 < end2; start2++, i++)buffer[i]=input[start2];
		}
		
		for(int j = start; j < end; j++) {
			input[j] = buffer[j];
		}
		
	}

	static void quicksort (int[] input, int start, int end) {
		if(end <= start) return;
		//1. Pick a pivot
		int pivot = input[end];
		//System.out.println("\t" + start + " " + end + " " + Arrays.toString(input));		
		
		//2. Partition
		int left = start;
		int right = end-1;
		while(left <= right) {
			while(input[left] < pivot) left++;
			while(left <= right && 
				  input[right] >= pivot) right--;
			if(left <= right) {
				swap(input, left, right);
				left++;
				right--;
			}
		}
		
		//2.b. Put pivot back in place
		//System.out.println("\t Swapping pivot back into place");
		//System.out.println("\t" + start + " " + end + " " + Arrays.toString(input));
		swap(input, left, end);
		//System.out.println("\t" + start + " " + end + " " + Arrays.toString(input));
		
		//3. recursively run quicksort on either side
		quicksort(input, start, right);//left
		quicksort(input, left + 1, end);//right
		
		
	}
	
	
	private static void swap(int[] input, int left, int right) {
		int temp = input[left];
		input[left] = input[right];
		input[right] = temp;
	}


	public static void main (String[] args) {
		
		int[] inputs = {7, 6, 12, 21, 739, 125, 42};
		
		System.out.println(Arrays.toString(inputs));
		
		//Arrays.sort(inputs);
		//quicksort(inputs,0, inputs.length-1);
		mergesort(inputs,0, inputs.length);
		
		int[] newInput = new int[100];
		Random r = new Random();
		for(int i = 0; i < 100; i++) newInput[i] = r.nextInt();
		
		
		int[] clonedNewInput = newInput.clone();
		
		quicksort(newInput,0, newInput.length-1);
		//mergesort(newInput,0, newInput.length);
		
		Arrays.sort(clonedNewInput);
		
		for(int i = 0; i < 100; i++) {
			if(newInput[i] != clonedNewInput[i]){
				System.out.println("EXPLODE!");
			}
		}
		
		System.out.println(Arrays.toString(clonedNewInput));
		
		System.out.println(Arrays.toString(newInput));
		
		
		
		
		
	}
	
}
