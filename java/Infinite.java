import java.util.Scanner;
public class Infinite {
	public static Scanner input;
	public static void main(String[] args)
	{
		 input = new Scanner( System.in );
		 int looper = 1;
do {
	int mega = 0;
    mega  = input.nextInt();
    
    System.out.println("Input 1 for infinite loop. Input 2 for explination");
    if(mega == 1)
    	
    {
    	int number = 2;
    	while (true)
    	{
    	
    	number = number + 2;
    	System.out.println(number);
    	}
    
    }
    else
    {
    	System.out.println(" the loop continues eventually to the point that the computer runs out of avalible memory. Its bad practice to leave infinite loops");
    }
   }
while (looper != 3);
	}

}
