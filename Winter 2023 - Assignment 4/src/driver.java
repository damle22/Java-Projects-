//----------------------------------------------------
//Assigment 4
//
//
//----------------------------------------------------

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
/**
 * This is the driver class.
 * @author ryanmazari
 *
 */
public class driver {

	public static void main(String[] args) {
		
		ArrayList <Book> arrLst = new ArrayList<>();
		LinkedList<Book> rightBooks = new LinkedList<>();
		Scanner reader = null;
		 
         try {
         
             reader = new Scanner(new FileInputStream("Books.txt"));
        
             while(reader.hasNextLine()) {
             
             	String record = reader.nextLine();
             	
             	String[] splitTheLine = record.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1); 
             	Book temp = new Book(splitTheLine);
             	 
             	int year = Integer.parseInt(splitTheLine[5].trim());
             	if(year >= 2024) 
             		arrLst.add(temp);
             	else
             		rightBooks.add(temp);
             		
             }
             			
             
         }
         catch(FileNotFoundException e) {
        	 System.out.println("File not found.");
         }
       
         PrintWriter wrongFile = null;
         
         try {
        	 wrongFile = new PrintWriter(new FileOutputStream("YearErr.txt"));
        	 
        	 wrongFile.println("Here are all the wrong incorrect records");
        	 wrongFile.println("==============================================================");
        	 
        	 for(int i = 0; i <= arrLst.size() - 1; i++)
        		 wrongFile.println(arrLst.get(i));
        	 
        	 System.out.println("YearError File Created");
        	 
        	 wrongFile.close();
         }
         catch(FileNotFoundException e) {
        	 System.out.println("Error opening the file.");
        	 
         }
         
         
         int length = rightBooks.size();
              
         BookList bkLst = new BookList();
         
         for(int i = length -1; i >= 0; i--)
             bkLst.addToStart(rightBooks.get(i));
         
         bkLst.storeRecordsByYear(1905);
         
         System.out.println("Here are the contents of the list\n" +
                            "=================================");
         bkLst.displayContent();
         System.out.println("\n");
         
         Scanner myKeyboard = new Scanner(System.in);
         int selector;
         boolean result = true;
         
         do {
        	 
        	 System.out.println("Tell me what you want to do. Here are the options:");
        	 System.out.println("\t\t1. Give me a year and I would extract all records of that year and store them in a file for that year;");
        	 System.out.println("\t\t2. Ask me to delete all consecutive repeated records;");
        	 System.out.println("\t\t3. Give me an author name and I will create a new list with the records of this author and display them;");
        	 System.out.println("\t\t4. Give me an ISBN number and and Book object, and I will insert Node with the book before the record with this ISBN;");
        	 System.out.println("\t\t5. Give me 2 ISBN numbers and Book object, and I will insert a Node between them, if I find them!;");
        	 System.out.println("\t\t6. Give me 2 ISBN numbers and I will swap them in the list for rearrangement of records, of course if they exist!;");
        	 System.out.println("\t\t7. Tell me to COMMIT. I will commit your list to a file called Updated_Books;");
        	 System.out.println("\t\t8. Tell me to STOP TALKING;");

        	 System.out.print("Enter the selector: ");
        	 selector = myKeyboard.nextInt();
        	 
        	 switch(selector) {
        	 
        	 
        	 case(1):
        		 Scanner year_input = new Scanner(System.in);
        	     int year;
        	     System.out.println("Give me a year: ");
        	     year = year_input.nextInt();
        	     bkLst.storeRecordsByYear(year);
        	     System.out.println("Records successfully written to " + year + ".txt");
        	     break;
        	     
        	 case(2):
        		 
        		 boolean result1 = bkLst.delConsecutiveRepeatedRecords();
        	     if(result1 == true)
        	    	 System.out.println("Here is the updated version.");
        	     else
        	    	 System.out.println("No change at the previous version.");
        	     
        	     bkLst.displayContent();
        	     break;
        	 
        	 case(3):
        		 Scanner author_input = new Scanner(System.in);
        	     String author; 
        	     BookList new_list = new BookList();
        		 System.out.print("Give me an author's name: ");
        	     author = author_input.nextLine();
        	     new_list = bkLst.extractAuthorList(author);
        	     if(new_list != null)
        	        new_list.displayContent();
        	     else
        	    	 System.out.println("The new list is empty, since there are no books on behalf of this author.");
        		 break;
        	 
        	 case(4):
        		 Scanner isbn_input = new Scanner(System.in);
        	     Book book1;
        	     System.out.print("Give me a ISBN number:");
        	     long isbn = isbn_input.nextLong();
        	  
        	     System.out.print("Give me a book digit: ");
        	     int digit1 = isbn_input.nextInt();
        	     book1 = rightBooks.get(digit1);
        	     
        	     boolean result2 = bkLst.insertBefore(isbn, book1);
        	     if(result2 == true)
        	    	 System.out.println("Here is the updated list after the insertion.");
        	     else
        	    	 System.out.println("There is no change from the previous list.");
        	     
        	     bkLst.displayContent();
        		 break;
        	 
        	 case(5):
        	     Scanner isbn_inputs = new Scanner(System.in);
    	         String line;
    	         Book book2;
    	         
    	         System.out.print("Give me two ISBN numbers:");
    	         line = isbn_inputs.nextLine();
    	         String [] arr = line.trim().split(" ");
    	         long isbn1 = Long.parseLong(arr[0]);
    	         long isbn2 = Long.parseLong(arr[1]);
    	         
    	         System.out.print("Give me a book digit: ");
    	         int digit2 = isbn_inputs.nextInt();
    	         book2 = rightBooks.get(digit2);
    	         
    	         boolean result3 = bkLst.insertBetween(isbn1, isbn2, book2);
    	         if(result3 == true)
    	        	 System.out.println("Here is the updated version after the insertion in between.");
    	         else
    	        	 System.out.println("There is no change, no insertion in between.");
    	         bkLst.displayContent();
    	         break;
        		 
        	 case(6):
        		 Scanner isbn_inputs2 = new Scanner(System.in);
	             String line2;
	         
	             System.out.print("Give me two ISBN numbers:");
	             line2 = isbn_inputs2.nextLine();
	             String [] arr2 = line2.trim().split(" ");
	             long isbn3 = Long.parseLong(arr2[0]);
	             long isbn4 = Long.parseLong(arr2[1]);
	             boolean result4 = bkLst.swap(isbn3, isbn4);
	             if(result4 == true)
	            	 System.out.println("The swapping successfully occured.");
	             else
	            	 System.out.println("The swapping could not take place.");
	             bkLst.displayContent();
	             break;
    	         
        	 case(7):
        		 System.out.println("Your list is commited to a file called Updated_Books");
    	         bkLst.commit();
    	         break;
    	       
        	 case(8):
        		 System.out.println("Termination of the program.");
        		 result = false;
        		 break;
    	         
        	 }
        	 
        	 
        		 
        	 
         }while(result == true);
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         //long l1 = 1887664688L; 
         //boolean insertBefore = list.insertBefore(l1, rightBooks.get(1));
         
        
         //long l2 = 9780899509L;
         //long l3 = 9780786400L;
         //boolean insertBetween = list.insertBetween(l2, l3, rightBooks.get(0));
         //list.displayContent();
         
         //boolean consecutive = list.delConsecutiveRepeatedRecords();
         //System.out.println(consecutive);
         //list.displayContent();
         //list.commit();
         //BookList extracted = new BookList();
         //extracted = list.extractAuthorList("Roy Malan");
         //extracted.displayContent();
         
         //long l4 = 1557835659L;
         //long l5 = 9780899506L;
         
         //boolean swap = list.swap(l4, l5);
         //System.out.println(swap);
         //list.displayContent();
         
         //list.commit();
         
         
         
	}      
}
