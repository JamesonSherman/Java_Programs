import java.util.Scanner;
public class Four_Eighteen
{
	public static Scanner CreditInput;
	public static void main(String[] args) 
	{
		CreditInput = new Scanner (System.in);
		
		String Customer_Name;
		String account_Number;
		double month_balance = 0.0;
		double total_charge = 0.0;
		double applied_credit = 0.0;
		double allowed_credit = 0.0;
		double total;
		boolean output;
		 System.out.println( "input customer name\n");
		 Customer_Name = CreditInput.nextLine();
		 System.out.println(" INput account number\n");
		 account_Number = CreditInput.nextLine();
		 System.out.println("input beginning balance\n");
		 month_balance = CreditInput.nextDouble();
		 System.out.println("input total monthly charges\n");
		 total_charge = CreditInput.nextDouble();
		 System.out.println("input total applied credit for customer\n");
		 applied_credit = CreditInput.nextDouble();
		 System.out.println("Input Credit allowance \n");
		 allowed_credit = CreditInput.nextDouble();
		 total = (month_balance + total_charge) - applied_credit;
		 
		 if (applied_credit > allowed_credit)
		 {
			 output = true;
		 }
		 
		 else
		 {
			 output = false;
		 }
		 
		 
		 
		 if (output == false)
		 {
		 System.out.println( "customer name is: " + Customer_Name + "\n");
		 
		 System.out.println(" Account number for Customer: " + Customer_Name + " is: " + account_Number + "\n");
			 
		 System.out.println("Your Total is: " + total);
		 System.out.println("Credit Limit has not been reached" );
		 }
		 
		 else if (output == true)
		 {
		 
			 System.out.println( "customer name is: " + Customer_Name + "\n");
			 
			 System.out.println(" Account number for Customer: " + Customer_Name + " is: " + account_Number + "\n");
				 
			 System.out.println("Your Total is: " + total);
			 System.out.println("Credit Limit Exceeded");
			 
		 }
		 
		 
	}

}
