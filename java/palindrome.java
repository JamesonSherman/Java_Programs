import java.util.Scanner;
public class palindrome
{
	public static Scanner value;
	public static void main(String[] args)
	{
		
		value = new Scanner (System.in);
		
		int looper = 1;

		do {
		    int pal = 0;
		    int dig1 = 0;
		    int dig2 = 0;
		    int dig3 = 0;
		    int dig4 = 0;
		    int dig5 = 0;
		    
		    System.out.println( "Enter five digit number: " );
		    pal = value.nextInt();
		       
		       
		             dig1 = pal / 10000;
		      
		             dig2 = pal / 1000 % 10;
		       
		             dig3 = pal % 1000 / 100 % 10;
		       
		             dig4 = pal % 10000 % 1000 % 100 / 10;
		       
		             dig5 = pal % 10000 % 1000 % 100 % 10;
		       
		          
		             if (dig1 == dig5 && dig2 == dig4)
		             {
		       
		                 System.out.printf("%d is a palindrome \n", pal);
		             }
		       
		             else
		             {
		                 System.out.printf("%d is not a palindrome \n", pal);
		             }

		             System.out.printf("input 3 if you wish to discontinue the loop. otherwise input any other number less than one hundered.");
		       looper = value.nextInt();
		   } 
		while (looper != 3);
	}

}
