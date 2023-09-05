// Java program to sort
// an array of size 3
import java.io.*;
import java.util.*;
 
class Sort3Elements
{
static void sort3(int arr[],
                  int temp[])
{
    // Insert arr[1]
    if (arr[1] < arr[0])
        {
            temp[0] = arr[0];
            arr[0] = arr[1];
            arr[1] = temp[0];
        }
 
    // Insert arr[2]
    if (arr[2] < arr[1])
    {
            temp[0] = arr[1];
            arr[1] = arr[2];
            arr[2] = temp[0];
             
    if (arr[1] < arr[0])
        {
            temp[0] = arr[0];
            arr[0] = arr[1];
            arr[1] = temp[0];
        }
    }
}
 
// Driver Code
public static void main(String args[])
{
    int a[] = new int[]{10, 12, 5};
    int temp1[] = new int[10];
    sort3(a, temp1);
 
    for (int i = 0; i < 3; i++)
        System.out.print( a[i] + " ");
}
}
