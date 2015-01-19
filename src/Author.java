import java.util.HashMap;


public class Author extends Person{
	
	private String name;
	private String lastName;
	private String password;
	private int phoneNumber;
	private String email;
	private HashMap books;
	
	public Author(String name, String lastName, int phoneNumber, String email, String password) 
	{
		super(name, lastName, phoneNumber, email);
		this.books = new HashMap<Integer, Book>();
		this.name = name;
		this.lastName = lastName;
		this.password = password;
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
	
	public void addBook(Book book, int year)
	{
		books.put(year, book);
	}
	
	public void removeBook(Book book, int year)
	{
		books.remove(year, book);
	}

}
