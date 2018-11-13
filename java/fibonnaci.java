package fibbonaci7_29;
import java.util.Scanner;
public class fibonnaci {
	private static Scanner choicevalue;
	public static void main(String[] args) 
	{
		int choice;
		choicevalue = new Scanner (System.in);	
		
		System.out.println("Please input to what number you would like to plan your Fbonacci Series");
		choice = choicevalue.nextInt();
		
		
		long num1 = 0;
		long num2 = 1;
		long num3;

		for (long i =2; i < choice; ++i)
		{
			num3 = num1 + num2;
			System.out.print((" " + num3 + "\n"));
			
			
			num1 = num2;
			num2 = num3;
		}
		
	}

}


// 7.29 B
//  System goes up to : 7540113804746346429 without entering into iffy mathematics territory.