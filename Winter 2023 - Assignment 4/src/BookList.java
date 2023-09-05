
//----------------------------------------------------
//Assigment 4
//
//
//----------------------------------------------------

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
/**
 * This is the Booklist class
 * @author ryanmazari
 *
 */
public class BookList {

	//------------------------------------------------------------
	/**
	 * This is the inner class called Node
	 * @author ryanmazari
	 *
	 */
	public class Node{
		
		private Book b;
		private Node next;
		
/**
 * This is the get book method
 * @return book object
 */
		public Book getB() {
			return b;
		}
/**
 * This is the set book method.
 * @param gets the book.
 */
		public void setB(Book b) {
			this.b = b;
		}
/**
 * This is the get next node method.
 * @return gets the next node.
 */
		public Node getNext() {
			return next;
		}
/**
 * This is the set next node method.
 * @param next sets the next node.
 */
		public void setNext(Node next) {
			this.next = next;
		}
		
	
	//-------------------------------------------------------------
		
	}
	
	private Node head;
	
/**
* This is thee default constructor
*/
	public BookList() {
		
		this.head = null;
	}
/**
 * This is the get head method.
 * @return gets head.
 */
	
	public Node getHead() {
		return head;
	}

/**
 * This is the set head method.
 * @param head sets the head.
 */
	public void setHead(Node head) {
		this.head = head;
	}


//=================================================================================================================

/**
 * This method displays the content of the object Booklist.
 */
	public void displayContent() {
		
		 if (head == null) {
	            System.out.println("List is empty");
	            return;
	        }
	        Node current = head;
	        do {
	            System.out.println(current.getB() + "  ==>");
	            current = current.getNext();
	        } while (current != head);
	        if(current == head)
	        	System.out.println("===> head");
	}
/**
 * This method adds a book and a new node at the beginning of the existing one.
 * @param b is the book.
 */
	public void addToStart(Book b) {
		
		Node newNode = new Node();
		newNode.setB(b);
        if (head == null) {
            head = newNode;
            head.setNext(head);
           }
            else {
              newNode.setNext(head);
              Node current = head;
              while (current.getNext() != head) {
                     current = current.getNext();
                       }
                      current.setNext(newNode);
                      head = newNode;
        }
  
	}
/**
 * This method store the year of all book objects that have this year.
 * @param yr is the year.
 */
	public void storeRecordsByYear(int yr) {
		
		String year =  String.valueOf(yr);
		PrintWriter sameYearFile = null;
		Node current = head;
		try {
		sameYearFile = new PrintWriter(new FileOutputStream( year + ".txt"));
		
		do {
			if(current.getB().getYear() == yr)
				sameYearFile.println(current.getB());
			current = current.getNext();
			
		}while(current != head);
		sameYearFile.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File cannot be loaded.");
		}
	}
/**
 * This method returns a boolean if it can or cannot insert before.
 * @param isbn is the isbn.
 * @param b is the book.
 * @return if it can insert just before the isbn(if it exists).
 */
	public boolean insertBefore(long isbn, Book b) {
		
		Node current = head;
		Node previous = null;
		Node newNode = new Node();
		newNode.setB(b);

		while(current != null && current.getB().getIsbn() != isbn) {
			previous = current;
		    current = current.getNext();
		}
		if(current == null)
			return false;
		else {
			previous.setNext(newNode);
			newNode.setNext(current);
		}
		return true;
		
	}
/**
 * This method returns if it can be inserted between two longs isbns.
 * @param isbn1 is isbn1.
 * @param isbn2 is isbn2.
 * @param b is the book.
 * @return if there is two isbns like the ones in the parameters.
 */
	public boolean insertBetween(long isbn1, long isbn2, Book b) {
		
		Node current = head;
		Node newNode = new Node();
		newNode.setB(b);
			
		while(current.getNext() != null){
			
			if(current.getB().getIsbn() == isbn1 && current.getNext().getB().getIsbn() == isbn2) {
				newNode.setNext(current.getNext());
				current.setNext(newNode);
				return true;
			}
			else
			current = current.getNext();
		}
		return false;
	}
/**
 * This method looks for consecutive repeated records and discard them
 * @return if there are any consecutive records or not.
 */
	public boolean delConsecutiveRepeatedRecords() {
		
		Node previous = null;
		Node current = head;
		boolean count = false;
		
		 while (current != null) {
			 
		        previous = current;
		        current = current.getNext();
		        
		        while (current != null && current.getB().equals(previous.getB())) {
		           
		        	previous.setNext(current.getNext());
		            current = current.getNext();
		            count = true;
		        }
		    }
				
		return count;
	}
/**
 * This method returns a new Booklist regarding the author that has been passed.
 * @param aut is the authot.
 * @return the new booklist.
 */
	public BookList extractAuthorList(String aut) {
		
		String author = aut;
		Node current = head;
		BookList extractedBookList = new BookList();
		
		do {
	        if (current.getB().getAuthor().equals(author)) {
	        	Node newNode = new Node();
	            newNode.setB(current.getB());
	            
	            if (extractedBookList.head == null) {
	                extractedBookList.head = newNode;
	                newNode.setNext(newNode); 
	            } 
	            else 
	            {
	                newNode.setNext(extractedBookList.head.getNext());
	                extractedBookList.head.setNext(newNode);
	            }
	        }
	        current = current.getNext();
	        
	    } while (current != head); 
		
	    return extractedBookList;
		
	}
/**
 * This method swaps two books that have the following isbns.
 * @param isbn1 is the first long.
 * @param isbn2 is the second long.
 * @return
 */
	public boolean swap(long isbn1, long isbn2) {
		
		Node n1 = null;
		Node n2 = null;
		Node current = head;
		
		Node previous1 = null;
		Node previous2 = null;
		Node next1 = null;
		Node next2 = null;
		boolean swap = false;
		
		do {
	        if (current.getNext().getB().getIsbn() == isbn1) {
	            previous1 = current;
	        	n1 = current.getNext();
	        	next1 = current.getNext().getNext();
	        } 
	        else if (current.getNext().getB().getIsbn() == isbn2) {
	            previous2= current;
	        	n2 = current.getNext();
	        	next2 = current.getNext().getNext();
	        }
	        current = current.getNext();
	        
	    } while (current != head && (n1 == null || n2 == null));
		
		if(previous1 != null && previous2 != null)
	        swap = true; 
			
	    
		previous1.setNext(n2);
        previous2.setNext(n1);
        
        n1.setNext(next2);
        n2.setNext(next1);
		
		
		return swap;
		
	}
/**
 * This method writes to a file that is always updated the current booklist.
 */
	public void commit() {
		
		PrintWriter updatedFile = null;
		Node current = head;
		try {
		
		updatedFile = new PrintWriter(new FileOutputStream("updated_Books.txt", true));
		do {
		updatedFile.println(current.getB());
		current = current.getNext();
		}
		while(current != head);
			 
		updatedFile.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File cannot be loaded.");
		}
		
	}
	
	
	
	
}

