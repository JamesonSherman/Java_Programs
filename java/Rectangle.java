package quadilaterals;
import java.awt.*;
import java.awt.geom.Point2D;
public class Rectangle extends Trapezoid
{

	protected double length = 0.0;
	protected double width = 0.0;
	protected double height_rec = 0.0;
	
	
	public Rectangle()
	{
		super();
	}
	
	public Rectangle(double x_cord, double y_cord,double L, double W, double height)
	{
		super();
		this.length = L;
		this.width = W;
		this.height_rec = height;
		
		
		TL = new Point2D.Double(x_cord,y_cord);
		TR = new Point2D.Double(x_cord+width, y_cord);
		BL = new Point2D.Double(x_cord, y_cord+ height);
		BR = new Point2D.Double(x_cord+width , y_cord+height);
	}
public double calculateArea()
	
	{
		double area = length * width;
		return area;
	}

	public String toString()
	{
		System.out.println("Name of class : " + getClass());
		System.out.println("Top-Left          : (" +  TL.getX() + ", " + TL.getY() + ")");
		System.out.println("Top-Right        : (" +  TR.getX() + ", " + TR.getY() + ")");
		System.out.println("Bottom-Left     : (" +  BL.getX() + ", " + BL.getY() + ")");
		System.out.println("Bottom-Right   : (" +  BR.getX() + ", " + BR.getY() + ")");
		System.out.println("Length               : " + length);
		System.out.println("Width               : " + width);
		System.out.println("Height             : " + height_rec);
		System.out.println("Area               : " + calculateArea());


		System.out.println("=====================================================");
		return "";
	}
}
