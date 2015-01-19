
public class Person {

	protected String name;
	protected String lastName;
	protected int phoneNumber;
	protected String email;
	
	public Person(String name, String lastName, int phoneNumber, String email) 
	{
		this.name = name;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() == 0)
		{
			throw new IllegalArgumentException("First name cannot be empty field.");
		}
		else
		{
			this.name = name;
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if(lastName.length() == 0)
		{
			throw new IllegalArgumentException("Last name cannot be empty field.");
		}
		else
		{
			this.lastName = lastName;
		}
	}
	
}
