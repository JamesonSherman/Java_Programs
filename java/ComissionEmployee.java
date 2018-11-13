
public class ComissionEmployee extends Employee
{

	protected Double grissSales = 0.0;
	protected Double comissionRate = 0.0;
	protected Double baseSalary = 0.0;
	
	protected Double returnGrossSales() {return grissSales;}
	protected Double returnComissionRate() { return comissionRate;}
	protected Double returnBaseSalary() { return baseSalary;}
	
	ComissionEmployee()
	{
		super();
	}
	
	ComissionEmployee (Double GrossSales, Double comissionRate, Double baseSalary, String firstname, String lastname, int ssn )
	{
		super();
		this.grissSales = GrossSales;
		this.comissionRate = comissionRate;
		this.baseSalary = baseSalary;
		firstName = firstname;
		lastName = lastname;
		SSN = ssn;
	}
	
	public String toString() 
	{
		return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "base-salaried comissionemployee", returnFirstName(), returnLastName(),
				"social security number", returnSSN(),
				"gross sales", returnGrossSales(), "Comission Rate", returnComissionRate(), "base Salary", returnBaseSalary());
	}

}
