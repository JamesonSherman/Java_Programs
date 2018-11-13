/* James Sherman Programming Assignment 1. 8/28/17 */
import java.util.Scanner;

public class Multiple 
{
// static scanners for each of the major input values and scanns for user input
	private static Scanner radChoice;
	private static Scanner input;
	private static Scanner choicevalue;
	private static Scanner numberinput;
	private static Scanner negativenumbs;

	public static void main(String[] args) 
	// choice scanner for menu selection
  {
		int choice = -1;
		System.out.println("Please enter a value 1 - 4 (please don't break my menu by hitting something different) \n");
		System.out.println("I was a bit lazy and didn't want to make a full loop system since I learned java doesnt have a GOTO ability"
				+ "on labels and such. It's honestly a very weird thing to adapt to doing things in Java at times. # struggles.");
		
			choicevalue = new Scanner (System.in);	
			choice = choicevalue.nextInt();
			
		switch (choice)
		{
  
	case 1:
	{
		// input then % to determine the multiplicity of one another
		input = new Scanner(System.in);
		System.out.print("Input your first number\n");
		int Multiple1 = input.nextInt();
		System.out.print("Input your second number\n");
		int Multiple2 = input.nextInt();
		
		int remainder = Multiple2 %  Multiple1;
		System.out.println("Your First number is: " + Multiple1 + "\n");
		System.out.println("Your Second number is: " + Multiple2 + "\n");
		
		System.out.println("Your Remainder is: " + remainder + "\n");
		// if
		if (remainder > 0)
		{
			System.out.println("The numbers: " + Multiple1 + "," + Multiple2 +" Are not multiples of one another" + "\n");
		}
		// else bracket system
		else
		{
			System.out.println("The numbers: " + Multiple1 + "," + Multiple2 +" Are multiples of one another." + "\n");
		}
		// finish of else brackets
		
	 }
	break;
	case 2:
	{
		//standard float using the formula of float = numberf. then standard diameter circumference and area size
		radChoice = new Scanner (System.in);
		System.out.println("Input your radius \n");
		int radius = radChoice.nextInt();
		float pi = 3.14159f;
		double diameter = 2 * radius;
		double circumference = 2 * pi * radius;
		double area = pi * Math.pow(radius, 2);
		System.out.println("The Diameter is: " + diameter + "\n");
		System.out.println("The circumference is: " + circumference + "\n");
		System.out.println("The area is: " + area + "\n");
	}
    break;
	case 3:
	{
		// decleration of five numbers and println for spacing
		 numberinput = new Scanner (System.in);
	int num1;
	int num2;
	int num3;
	int num4;	
	int num5;
	
	
		 System.out.println("Please input your five numbers for spacing arrangement");
		 System.out.println("Number 1 : ");
	 num1 =  numberinput.nextInt();
	 System.out.println("\n");
	 System.out.println("Number 2 : ");
	 num2 =  numberinput.nextInt();
	 System.out.println("\n");
		System.out.println("Number 3 : ");
	 num3 =  numberinput.nextInt();
	 System.out.println("\n");
		System.out.println("Number 4 : ");
	 num4 =  numberinput.nextInt();
	 System.out.println("\n");
		System.out.println("Number 5 : ");
	 num5 =  numberinput.nextInt();
	 System.out.println("\n");
	 
	 System.out.println("Your numbers are: " + num1 + " " + num2 + " " + num3 + " " + num4 + " " + num5);
	}
	break;
	case 4:
	{
		// sample of using if else statements for positive numbers and determmining wether something is positive or not.could be made easier.
		negativenumbs = new Scanner (System.in);
		int numb1;
		int numb2;
		int numb3;
		int numb4;
		int numb5;
		int positive = 0;
		int negative = 0;
		
		System.out.println("Please input your five numbers for negative arrangement");
		 System.out.println("Number 1 : ");
	 numb1 =  negativenumbs.nextInt();
	 System.out.println("\n");
	 System.out.println("Number 2 : ");
	 numb2 =  negativenumbs.nextInt();
	 System.out.println("\n");
		System.out.println("Number 3 : ");
	 numb3 =  negativenumbs.nextInt();
	 System.out.println("\n");
		System.out.println("Number 4 : ");
	 numb4 =  negativenumbs.nextInt();
	 System.out.println("\n");
		System.out.println("Number 5 : ");
	 numb5 =  negativenumbs.nextInt();
	 System.out.println("\n");
		
	 if ( numb1 >= 0)
	 {
	 positive++;
	 }
	 else 
	 {
	 negative++;
	 }
	 
	 if (numb2 >= 0)
	 {
	  positive++;
	 }
	 else
	 {
     negative++;
	 }
	 
	 if (numb3 >= 0)
	 {
		 positive++;
	 }
	 else
	 {
		 negative++;
	 }
	 
	 if (numb4 >= 0)
	 {
		 positive++;
	 }
	 else 
	 {
		 negative++;
	 }
	 
	 if(numb5 >= 0)
	 {
		 positive++;
	 }
	 else
	 {
		 negative++;
	 }
	 
	System.out.println("The number of positive numbers are: " +positive + "\n");
	
	System.out.println("The number of negative numbers are: " +negative + "\n");
	
	 
    }
   }
  }
 }