package Variable_ength_Argument_LIst;

public class hwmain7_14_Main 
{

	public static void main(String[] args) 
	{
int num1 = 1;
int num2 = 2;
int num3 = 3;
int num4 = 4;
int num5 = 5;
System.out.println("Your total is: " + varying(num1));
System.out.println("Your total is: " + varying(num1,num2));
System.out.println("Your total is: " + varying(num1,num2,num3));
System.out.println("Your total is: " + varying(num1,num2,num3,num4));
System.out.println("Your total is: " + varying(num1,num2,num3,num4,num5));

	}

	public static int varying(int... numbers) 
	{
		int total = 0;
		
		for (int I : numbers)
		{
			total += I;
		}	
		return total;
	}
	
	
	
	
	
	
	
}