import java.util.ArrayList;
import java.util.LinkedList;


public class BookStore {
	
	private int counter;
	private String name;
	private ArrayList<Employee> employees;
	private ArrayList<Buyer> buyers;
	private ArrayList<Book> books;
	private LinkedList<Book> requestedBooks;
	
	public BookStore(String name) {
		this.name = name;
		this.employees = null;
		this.buyers = null;
		this.books = null;
		this.counter = 0;
	}
	
	public void addEmployee(Employee employee)
	{
		employees.add(employee);
	}
	
	public void addBuyers(Buyer buyer)
	{
		buyers.add(buyer);
	}
	
	public void fireEmployee(Employee employee)
	{
		employees.remove(employee);
	}
	
	public void removeBuyer(Buyer buyer)
	{
		buyers.remove(buyer);
	}
	
	public void addBook(Book book)
	{
		books.add(counter, book);
		counter++;
	}
	
	private boolean isThereBook(Author author)
	{
		for (int i=0; i<books.size(); i++)
		{
			if (books.get(i).getAuthor().equals(author))
			{
				return true;
			}
		}
		return false;
	}
	
	private boolean isThereBook(String title)
	{
		for (int i=0; i<books.size(); i++)
		{
			if (books.get(i).getTitle().equals(title))
			{
				return true;
			}
		}
		return false;
	}
	
	private boolean isThereBook(Publisher publisher)
	{
		for (int i=0; i<books.size(); i++)
		{
			if (books.get(i).getPublisher().equals(publisher))
			{
				return true;
			}
		}
		return false;
	}
	
	private boolean isThereBook(int year)
	{
		for (int i=0; i<books.size(); i++)
		{
			if (books.get(i).getYear()==year)
			{
				return true;
			}
		}
		return false;
	}
	
	private boolean isThereBook(Book book)
	{
		for (int i=0; i<books.size(); i++)
		{
			if (books.get(i).equals(book))
			{
				return true;
			}
		}
		return false;
	}
	
	private Book getBook(Book book)
	{
		int i=0;
		while(!books.get(i).equals(book))
		{
			i++;
		}
		return books.get(i);
	}
	
	private Book getBookByAuthor(Author author)
	{
		int i = 0; 
		while (!books.get(i).getAuthor().equals(author))
		{
			i++;
		}
		return books.get(i);
	}
	
	private Book getBookByTitle(String title)
	{
		int i = 0; 
		while (!books.get(i).getTitle().equals(title))
		{
			i++;
		}
		return books.get(i);
	}
	
	private Book getBookByPublisher(Publisher publisher)
	{
		int i = 0; 
		while (!books.get(i).getPublisher().equals(publisher))
		{
			i++;
		}
		return books.get(i);
	}
	
	private Book getBookByYear(int year)
	{
		int i = 0; 
		while (books.get(i).getYear()!=year)
		{
			i++;
		}
		return books.get(i);
	}
	
	public void buyBook(Buyer buyer, Book book)
	{
		if(isThereBook(book))
		{
			buyer.buyBook(book);
			getBook(book).setNumOfcopies(getBook(book).getNumOfcopies()-1);
		}
		else
		{
			requestedBooks.push(book);
		}
	}
	
	public void recommendation(Buyer buyer, Book book)
	{
		if(book.getPrevious() != null && book.getNext() != null)
		{
			if (buyer.Books().contains(book.getPrevious())==false && buyer.Books().contains(book.getNext())==false)
			{
				System.out.println("Reccomended books are " + book.getPrevious() + ", previous book in series and "
						+ book.getNext() + ", next book in series");
			}
			else if(buyer.Books().contains(book.getPrevious())==false && buyer.Books().contains(book.getNext())==true)
			{
				System.out.println("Recommended book is " + book.getPrevious() + ", previous book in series");
			}
			else if(buyer.Books().contains(book.getPrevious())==true && buyer.Books().contains(book.getNext())==false)
			{
				System.out.println("Recommended book is " + book.getNext() + ", next book in series");
			}
		}
		else if(book.getPrevious() != null && book.getNext() == null)
		{
			if (buyer.Books().contains(book.getPrevious())==false)
			{
				System.out.println("Reccomended book is " + book.getPrevious() + ", previous book in series.");
			}
		}
		else if(book.getPrevious() == null && book.getNext() != null)
		{
			if (buyer.Books().contains(book.getNext())==false)
			{
				System.out.println("Recommended book is " + book.getNext() + ", next book in series.");
			}
		}
		else
		{
			System.out.println("Sorry, we have no recommendations for you.");
		}
	}
	
}
