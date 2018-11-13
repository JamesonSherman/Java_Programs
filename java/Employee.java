
public abstract class Employee 
{
	protected String firstName;
	protected String lastName;
	protected int SSN;
	
	
	protected String returnFirstName() { return firstName; }
	protected String returnLastName() { return lastName; }
	protected int returnSSN() { return SSN; }
	
	public abstract String toString();
}
