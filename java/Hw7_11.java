package Hw7_11;

public class Hw7_11 {

	public static void main(String[] args) 
	{
		int[] counts = new int[9];
		int[] bonus = new int[15];
		int[] bestscores = {1000,2345,123124,1244};

		
		
		
		for (int i = 0 ; i < counts.length; i++)
		{
			counts[i] = 0;
		}
		for (int i = 0 ; i < counts.length; i++)
		{
			System.out.print(counts[i] + " ");
		}
		
		
		
		
		System.out.println("\n");
		
		for (int i = 0 ; i < bonus.length; i++)
		{
			bonus[i] = i + 1;
		}
		for (int i = 0 ; i < bonus.length; i++)
		{
			System.out.print(bonus[i] + " ");
		}
		
		
		System.out.println("\n");
		for (int i = 0 ; i < bestscores.length; i++)
		{
			System.out.print(bestscores[i] + " ");
		}
	}

}
