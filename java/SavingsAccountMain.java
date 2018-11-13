package hw8_6;

import java.util.*;
public class SavingsAccountMain 
{// public class Savings Main brace

	public static void main(String[] args) 
{
		
		int Looper = -1;
		int choices;
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		  
		try (Scanner Scanner =  new Scanner(System.in))
{
			
			System.out.println("Saver1 or Saver2 (input numerical value)");
			choices = Scanner.nextInt();
			
			
			if (choices == 1) {
			do
			{
				System.out.println("1 Hanldes Annual Interesst Update");
				System.out.println("2 Updates Current Savings Amount");
				System.out.println("3 Calculates Monthly Interest");
		choices = Scanner.nextInt();		
		switch (choices)
		
		{
		case 1: // update annual value
		{
			System.out.println("update annual value");
		 saver1.UpdateAnnualIntValue = Scanner.nextDouble();
		 SavingsAccount.AIR = saver1.UpdateAnnualIntValue;
		 saver1.callAnnual();
		 
		}
		break;
		case 2: // update savings value;
		{
			System.out.println("Update savings ");
			saver1.UpdatedSavings = Scanner.nextDouble();
			saver1.updatesavingsBalance(saver1.UpdatedSavings);
		}
		break;
		case 3:  // updates the Monthly Interest based on current values of AIR and savaingsBalance
		{
			System.out.println("Updates Monthly interest and adds to savings");
			saver1.calculateMonthyInterest();
		}
		break;
			}
		System.out.println("Input 1 to break. 2 to continue.");
		 Looper = Scanner.nextInt();
		 
			}
			while( Looper != 1);
		}
					
			else // sets for saver2;
			{
				do
				{
					System.out.println("1,2,3");
			choices = Scanner.nextInt();		
			switch (choices)
			
			{
			case 1: // update annual value
			{
				System.out.println("update annual value");
			 saver2.UpdateAnnualIntValue = Scanner.nextDouble();
			 SavingsAccount.AIR = saver2.UpdateAnnualIntValue;
			 saver2.callAnnual();
			 
			}
			break;
			case 2: // update savings value;
			{
				System.out.println("Update savings ");
				saver2.UpdatedSavings = Scanner.nextDouble();
				saver2.updatesavingsBalance(saver2.UpdatedSavings);
			}
			break;
			case 3:  // updates the Monthly Interest based on current values of AIR and savaingsBalance
			{
				System.out.println("Updates Monthly interest and adds to savings");
				saver2.calculateMonthyInterest();
			}
			break;
				}
			System.out.println("Input 1 to break. 2 to continue.");
			 Looper = Scanner.nextInt();
			 
				}
				while( Looper != 1);
			}
			
			

}
}
}// public class Savings Main brace
