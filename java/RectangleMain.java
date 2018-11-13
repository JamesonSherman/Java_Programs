package hw_8_4;
import java.util.*;
public class RectangleMain 
{

	public  static Scanner input;
	public static void main(String[] args)
	{
		Scanner input =  new Scanner(System.in);
	rectangle Rectangle =  new rectangle();
	
	System.out.println("Input length");
	
	
	Rectangle.length = input.nextInt();
	if (Rectangle.length > 99999 || Rectangle.length < 0)
	{
		Rectangle.length = 1;
	}
	
	
	
	System.out.println("Input width");
	Rectangle.width = input.nextInt();
	
	if (Rectangle.width > 99999 || Rectangle.width < 0)
	{
		Rectangle.width = 1;
	}
	
	
	System.out.println("The Perimiter is: " + Rectangle.perimiter(Rectangle.length, Rectangle.width));
	System.out.println("The Area is: " + Rectangle.area(Rectangle.length, Rectangle.width));
	input.close();
	}
	
}
