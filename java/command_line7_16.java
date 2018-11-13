package command_line;

public class command_line7_16 {

	public static void main(String[] args) 
	{
		double total = 0.0;
		for (String per : args)
		{
			total += Double.parseDouble(per);
		}
		System.out.print(total);
	}

}
