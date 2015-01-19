import java.util.HashMap;

public class Employee extends Person{

	private String name;
	private String lastName;
	private String password;
	private int phoneNumber;
	private String email;
	private HashMap approvals;
	private int counter;
	
	public Employee(String name, String lastName, String password, int phoneNumber, String email) 
	{
		super(name, lastName, phoneNumber, email);
		this.approvals = new HashMap<Integer, String>();
		this.counter = 1;
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
	
	public void addApproval(String approval)
	{
		counter++;
		approvals.put(counter, approval);
	}
	
	public void removeApproval(int key)
	{
		approvals.remove(key);
	}
	
	public void changeApproval(int key, String newApproval)
	{
		approvals.replace(key, newApproval);
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

