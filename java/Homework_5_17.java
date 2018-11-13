// James.SHerman 9000114 quantity and item pricing program.
package Package_Bravo;
import java.util.Scanner;
public class Homework_5_17 
{
	public static Scanner input;
	  private static Scanner scanner = new Scanner( System.in );
	public static void main(String[] args)
	{
		int holder = 0;
		double grandtotal = 0.00;
		do
		{
			
		int product_num = 0;
		int qt_sold = 0;
		double total = 0.00;
		input = new Scanner (System.in);
		
		
		System.out.println(" Please input your Product number 1 - 5 \n");
		product_num = input.nextInt();
		System.out.println("Please input quantity sold \n");
		qt_sold = input.nextInt();
		
		
		
			
			
			
		switch (product_num)
		{
		
		case 1:
		{
		double price1 = 2.98;
		total = (price1 * qt_sold);
		grandtotal += total;
			System.out.printf("Your total is: %.2f%n" , grandtotal);
		}
		break;
		
		case 2:
		{
			double price2 = 4.50;
			total = (price2 * qt_sold);
			grandtotal += total;
			System.out.printf("Your total is: %.2f%n "  , grandtotal);
		}
		break;
		case 3:
		{
			double price3 = 9.98;
			total = (price3 * qt_sold);
			grandtotal += total;
			System.out.printf("Your total is: %.2f%n" , grandtotal);	
		}
		break;
		case 4:
		{
			double price4 = 4.49;
			total = (price4 * qt_sold);
			grandtotal += total;
			System.out.printf("Your total is: %.2f%n" ,grandtotal);
		}
		break;
		case 5:
		{
			double price5 = 6.87;
			total = (price5 * qt_sold);
			grandtotal += total;
			System.out.printf("Your total is: %.2f%n " , grandtotal);
		}
		}
		
		System.out.println("would you like to restart the program to add another item?");
		System.out.println("Input Yes or No");
		
		String inner = scanner.nextLine();
		if ( inner.equals("Yes") )
		{
		 holder = 0;
		}
		else
		{
			holder = 1;
		}
		
		}
		while (holder != 1);
		
		
		
		
		
		
		System.exit(0);
		}

	}


