import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;


public class Publisher {
	
	private String name;
	private int phoneNumber;
	private String email;
	private ArrayList<Book> books;
	
	public Publisher(String name, int phoneNumber, String email) 
	{
		this.books = new ArrayList<Book>();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public int getPhoneNumber(Employee employee)
	{
		return phoneNumber;
	}
	
	public String getEmail(Employee employee)
	{
		return email;
	}
	
	public void addBook(Book book)
	{
		books.add(book);
	}
	
	public Book getBookByAuthor(Author author)
	{
		boolean isThere = false;
		for (int i=0; i<books.size(); i++)
		{
			if (books.get(i).getAuthor().equals(author))
			{
				isThere = true;
				return books.get(i);
			}
		}
		if (isThere == false)
		{
			throw new IllegalArgumentException("There is no book from thaht author!");
		}
		return books.get(0);
	}

}
