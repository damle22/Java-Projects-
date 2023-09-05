//----------------------------------------------------
//Assigment 4
//
//
//----------------------------------------------------

/**
 * This is the class Book
 * @author ryanmazari
 *
 */
public class Book {
	
	private String title;
	private String author;
	private double price;
	private long isbn;
	private String genre;
	private int year;
	
	/**
	 * This is an array of book records 
	 * @param record is the array of book records itself.
	 */
	
	public Book(String[] record){
		
    	double price = Double.parseDouble(record[2].trim());
    	int year = Integer.parseInt(record[5].trim());
    	
    this.title = record[0];
    this.author = record[1];
    this.price = price;
    this.isbn =  Long.parseLong(record[3]);
    this.genre = record[4];
    this.year = year;
    }

/**
 * This is the get title method.
 * @return is the title.
 */
	public String getTitle() {
		return title;
	}

/**
 * This is the set title method.
 * @param title is the title.
 */
	public void setTitle(String title) {
		this.title = title;
	}

/**
 * This is the get author method.
 * @return is the author. 
 */
	public String getAuthor() {
		return author;
	}

/**
 * This is the set author method.
 * @param author is the author.
 */
	public void setAuthor(String author) {
		this.author = author;
	}

/**
 * This is the get price method.
 * @return is the price.
 */
	public double getPrice() {
		return price;
	}

/**
 * This is the set price method.
 * @param price is the price.
 */
	public void setPrice(double price) {
		this.price = price;
	}

/**
 * This is the get isbn method.
 * @return is the isbn.
 */
	public long getIsbn() {
		return isbn;
	}

/**
 * This is the set isbn method.
 * @param isbn is the isbn.
 */
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}

/**
 * This is the get genre method.
 * @return is the genre.
 */
	public String getGenre() {
		return genre;
	}

/**
 * This is the set genre method.
 * @param genre is the genre.
 */
	public void setGenre(String genre) {
		this.genre = genre;
	}

/**
 * This is the get year method.
 * @return is the year.
 */
	public int getYear() {
		return year;
	}

/**
 * This is the set year method.
 * @param year is the year.
 */
	public void setYear(int year) {
		this.year = year;
	}
/**
 * This is the toString method.
 */
	public String toString() {
		return "Title: " + this.title + ", Author: " + this.author + ", Price: " + this.price + 
			", Year: " +  this.year + ", ISBN: " + this.isbn + ", Genre: " + this.genre;
	}
	
/**
 * This is the equals method.
 */
	@Override
	 public boolean equals(Object obj){
		
		if(this == obj)
			return true;
		if(obj == null)
			return false;
		if(obj.getClass() != getClass())
			return false;
		
		Book b = (Book) obj;
		
		    return(this.title.equals(b.title) && this.author.equals(b.author) && this.price==b.price && this.isbn == b.isbn && this.genre.equals(b.genre) && this.year == b.year);
	 }
	
}
