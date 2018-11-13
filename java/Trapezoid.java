package quadilaterals;
import java.awt.geom.*;
public class Trapezoid extends Quadilatreral
{
	protected double base_Trap = 0.0;
	protected double height_Trap = 0.0;
	protected double base2_Trap = 0.0;
	protected double width_Trap = 0.0;
	
	public Trapezoid()
	{
		super();
	}
	
	public Trapezoid(double x_cord,double y_cord, double base1,double base2, double height, double width)
	{
		
		this.base_Trap = base1;
		this.base2_Trap = base2;
		this.height_Trap = height;
		this.width_Trap = width;
		double basedistance = 0.0;
		if (base1 > base2)
		{
			basedistance = base1 - base2;
		}
		else
		{
			basedistance = base2 - base1;
		}
		
		TL = new Point2D.Double(x_cord,y_cord);
		TR = new Point2D.Double(x_cord+width, y_cord);
		BL = new Point2D.Double(x_cord-basedistance,y_cord+height);
		BR = new Point2D.Double((x_cord-basedistance)+width , y_cord+height);
	}
	
public double calculateArea()
	
	{
		double area = ((base_Trap + base2_Trap)/2)*height_Trap;
		return area;
	}

public String toString()
{
	System.out.println("Name of class : " + getClass());
	System.out.println("Top-Left          : (" +  TL.getX() + ", " + TL.getY() + ")");
	System.out.println("Top-Right        : (" +  TR.getX() + ", " + TR.getY() + ")");
	System.out.println("Bottom-Left     : (" +  BL.getX() + ", " + BL.getY() + ")");
	System.out.println("Bottom-Right   : (" +  BR.getX() + ", " + BR.getY() + ")");
	System.out.println("Base               : " + base_Trap);
	System.out.println("Base               : " + base2_Trap);
	System.out.println("Height             : " + height_Trap);
	System.out.println("Area               : " + calculateArea());


	System.out.println("=====================================================");
	return "";
}

}
