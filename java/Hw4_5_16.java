//James.SHerman 900114 Graphing Program
package Package_Alpha;
import java.util.Scanner;
public class Hw4_5_16 
{
public static Scanner input;
	public static void main(String[] args)
	
{
		input = new Scanner (System.in);
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		System.out.println("Input five numbers for graphing");

	one  =input.nextInt();
	two   =input.nextInt();
	three  =input.nextInt();
	four    =input.nextInt();
	five     =input.nextInt();
	for (int i = 0; i < 1; i++)
	{
		for (int A = 0; A < one; A++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		for (int A = 0; A < two; A++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		for (int A = 0; A < three; A++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		for (int A = 0; A < four; A++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
		for (int A = 0; A < five; A++)
		{
			System.out.print("*");
		}
		
	}
	
	
}
	
}
