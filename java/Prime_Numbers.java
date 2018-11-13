import java.io.*;
import java.lang.Math;
import java.util.Scanner;
public class Prime_Numbers {

	public static void main(String[] args) 
	{

		 Scanner s = new Scanner(System.in);
		 int number = s.nextInt();
		checkifprime(number);
		 primefactorization(number);
	}

	
	public static void primefactorization(int n)


	{
		System.out.println("factors are: ");
		while (n%2 == 0)
		{
			System.out.print(2 + " ");
			n /= 2;
		}
		
		
		for (int i = 3; i <= Math.sqrt(n); i+=2)
		{
			while (n%i == 0)
			{
				System.out.print(i + " ");
				n /= i;
			}
		}
		if ( n > 2)
		{
			System.out.print(n);
		}
	}
public static void checkifprime(int n )
	{
	boolean prime = true;
	for (int p = 2; p < n; p++)
	{
		prime = false;
	}
	
	if (prime)
		System.out.println("the number is prime");
	else
		System.out.println("the number is not prime");
	}


	
}
