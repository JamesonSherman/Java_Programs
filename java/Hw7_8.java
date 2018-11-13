package hw_7_8;

public class Hw7_8 {

	public static void main(String[] args)
	
	{
		int output;
	int[] f = {1,2,3,4,5,6}; // (0,1,2,3,4,5) initalized at 0
	int[] g = {1,2,3,4,5};
	int[] a = {11,22,33,44,55,66,77,88,99,110,111};
	int[] b = new int[33];
	
	double[] c = new double[99];
	double [] w = new double[98];
	double smallest = w[0];
    double largest = w[0];
	double total = 0.00;
	output = f[5];
	System.out.println("part A: \n" + output);
	System.out.print("------------------------------------\n");
	System.out.print("Part B \n");
	for (int i = 0; i < g.length; i++)
	{
		g[i] = 8;
		System.out.println(g[i]);
	}
	System.out.print("------------------------------------\n");
	System.out.print("Part C \n");
	
	c[0] = 1;
	
	for (int i = 1; i < c.length; i++)
	{
		c[i] = ++i;
	}
	
	for (int i = 0; i < c.length; i++)
	{
	total += c[i];
	
	}
	System.out.printf(total + "\n");
	System.out.print("-----------------------------------\n");
	System.out.print("Part D \n");
	for (int i = 0; i < b.length; i++)
	{
		b[i] = i;
	}
	
	for (int i = 0; i < a.length;i++)
	{
		b[i] = a[i];
	}
	
	for (int i =0; i < b.length; i++)
	{
		System.out.println(b[i]);
	}
	
	System.out.print("-----------------------------------\n");
	System.out.print("Part E \n");
	for (int i = 0; i < w.length ; i++)
	{
	w[i] = i+1;
	}
	
	
	for (int i = 0; i < w.length; i++)
	{
		
            if (w[i] < smallest) {
                smallest = w[i];
            } // end finding smallest
            else if (w[i] > largest) {
                largest = w[i];
            } // end finding largest number 
        
		 
	}
	 System.out.println("Largest Number is : " + largest);
     System.out.println("Smallest Number is : " + smallest);
	}
	
}
