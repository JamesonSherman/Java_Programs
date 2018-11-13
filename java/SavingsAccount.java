package hw8_6;
import java.text.DecimalFormat;
import java.text.NumberFormat;
public class SavingsAccount

{
public static double AIR = 1.23; //Annual Interest Rate;
private double savingsBalance; // Savings balance
public double UpdateAnnualIntValue = 0.00;
public double MIR = 0.00;
public double UpdatedSavings;
NumberFormat formatter = new DecimalFormat("#0.00");




public void callAnnual() // calls annual value
{
	System.out.println(AIR);
}






public void updatesavingsBalance(double newsavings)  // update private savings balance for user
{
	savingsBalance = newsavings;
}



public void calculateMonthyInterest()  // calculates monthly interest rate
{
	double monthlyInterest;
	monthlyInterest= (AIR * savingsBalance) / 12;
	MIR = monthlyInterest;
	System.out.println(formatter.format(MIR));
	savingsBalance += MIR;
	System.out.println(formatter.format(savingsBalance));
	
}

}
