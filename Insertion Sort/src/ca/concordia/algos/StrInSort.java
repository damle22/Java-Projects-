package ca.concordia.algos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StrInSort {

    public static int comparesDuringStructure = 0;
    public static int comparesOverall = 0;
    public static int swapsOverall = 0;
    public static int ascRuns = 0;
    public static int descReversals = 0;
    public static int lengthASC = 0;

    public static void structuring(int[] arr) {

        int index = 0;
        int start = 0;
        int end = 0;

        while (index < arr.length - 1) {
        	comparesDuringStructure++;
            if (arr[index] > arr[index + 1]) {
                while (index < arr.length - 1 && arr[index] > arr[index + 1]) {
                    end++;
                    comparesDuringStructure++;
                    index++;
                }
                lengthASC = end - start + 1;
                reverse(arr, start, end);
                start = end + 1;
            } else if (arr[index] < arr[index + 1]) {
                while (index < arr.length - 1 && arr[index] < arr[index + 1]) {
                    end++;
                    comparesDuringStructure++;
                    index++;
                }
                ascRuns++;
                start = end + 1;
            }
            index++;
            end++;
        }
  

    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end){
        	comparesOverall++;
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            swapsOverall++;
        }
        comparesOverall++;
        descReversals++;
    }

    static void insertionSort(int array[]) {
        int size = array.length;

        for (int step = 1; step < size; step++) {
            int key = array[step];
            int j = step - 1;
            //comparesOverall++;
            while (j >= 0 && key > array[j]) {
                array[j + 1] = array[j];
                --j;
                comparesOverall++;
                swapsOverall++;
            }
           // comparesOverall++;
            array[j + 1] = key;
            
        }
    }

    public static void main(String[] args) {

        Scanner reader = null;
        String fileName = null;

        try {
            fileName = args[0];
            reader = new Scanner(new FileInputStream(fileName));

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        int length = 0;
        while (reader.hasNext()) {
            length++;
            reader.next();
        }
        int[] arr = new int[length];

        Scanner reader2 = null;
        String fileName2 = null;

        try {
            fileName2 = args[0];
            reader2 = new Scanner(new FileInputStream(fileName2));

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        int number = reader2.nextInt();
        int index = 0;

        while (reader2.hasNext()) {
            arr[index] = number;
            number = reader2.nextInt();
            index++;
        }

        arr[index] = number;

       
        for (int k = 0; k < length; k++)
            System.out.print(arr[k] + " ");
       
        System.out.println();
        
        structuring(arr);
        
        insertionSort(arr);

        
        System.out.println("We counted " + ascRuns + " ASC runs of length " + lengthASC);
        System.out.println("We performed " + descReversals + " reversals of runs in DECR order");
        System.out.println("We performed " + comparesDuringStructure + " compares during structuring");
        System.out.println("We performed " + (comparesOverall + comparesDuringStructure) + " compares overall");
        System.out.println("We performed " + swapsOverall + " swaps overall");
        for (int k = 0; k < length; k++)
            System.out.print(arr[k] + " ");
        
    }
}



	
