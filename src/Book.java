
public class Book {

	private String title;
	private Author author;
	private int year;
	private Publisher publisher;
	private int numOfcopies;
	private Book previous;
	private Book next;
	
	
	public Book(String title, Author author, int year, Publisher publisher, int numOfCopies) 
	{
		this.title = title;
		this.numOfcopies = numOfCopies;
		this.author = author;
		this.year = year;
		this.publisher = publisher;
		this.previous = null;
		this.next = null;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumOfcopies() {
		return numOfcopies;
	}

	public void setNumOfcopies(int numOfcopies) {
		this.numOfcopies = numOfcopies;
	}
	
	public Book getPrevious() {
		return previous;
	}

	public void setPrevious(Book previous) {
		this.previous = previous;
	}

	public Book getNext() {
		return next;
	}
	
	public void setNext(Book next) {
		this.next = next;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Publisher getPublisher() {
		return publisher;
	}

	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
}
