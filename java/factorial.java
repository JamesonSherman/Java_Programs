import java.util.Scanner;
public class factorial {
	public static Scanner input;
	public static void main(String[] args) 
	{
		input = new Scanner( System.in );
		int count = 1;
		int product = 1;
		int factor = 1;
		int nonneg = 0;
		
		System.out.println("input a non negative number");
		nonneg = input.nextInt();
		
		while (count <= nonneg)
		{
			 product = product * factor++;
			 count++;
			 
		}
		
		System.out.println(nonneg + "! = " + product);

	}

}
