import java.util.ArrayList;
import java.util.LinkedList;


public class Buyer extends Person {
	
	private String name;
	private String lastName;
	private String password;
	private int phoneNumber;
	private String email;
	private ArrayList<Book> books;
	
	public Buyer(String name, String lastName, String password, int phoneNumber, String email) 
	{
		super(name, lastName, phoneNumber, email);
		this.name = name;
		this.lastName = lastName;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getPassword() {
			return password;
	}

	public void setPassword(String password) {
		if(password.length() == 0)
		{
			throw new IllegalArgumentException("Password cannot be empty field.");
		}
		else
		{
			this.password = password;
		}
	}

	public void buyBook(Book book)
	{
		books.add(book);
	}
	
	public ArrayList<Book> Books()
	{
		return books;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if(email.length() == 0)
		{
			throw new IllegalArgumentException("Email cannot be empty field.");
		}
		else
		{
			this.email = email;
		}
	}


}
