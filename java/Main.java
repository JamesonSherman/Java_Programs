package quadilaterals;

public class Main {

	public static void main(String[] args) 
	{
		Quadilatreral shapes[] = 
			{
				new Parallelogram(3.0, 4.0, 7.0, 9.0, 90.0),
				new Trapezoid(3.0,4.0,7.0,5.0,9.0,6.0),
				new Rectangle(6.0,4.0,8.0,5.0,10.0),
				new Square(5.0,6.0,7.0)
			};
		for(int i=0;i<shapes.length;i++)
		{
			shapes[i].toString();
		}

	}

}
