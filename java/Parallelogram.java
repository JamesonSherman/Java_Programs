package quadilaterals;
import java.awt.geom.*;
public class Parallelogram extends Trapezoid 
{
	protected double base_pel = 0.0;
	protected double height_pel = 0.0;
	protected double angle_pel = 0.0;
	
	
	
	public double calculateArea()
	
	{
		double area = base_pel *height_pel;
		return area;
	}
	
	
	
	public Parallelogram ()
	{
		super();
	}// construction end
	
	
	public Parallelogram(double x_cord, double y_cord, double width, double height, double angle)
	{
		super();
		this.height_pel = height;
		this.base_pel = width;
		this.angle_pel = angle;
		double tanValue=0.0;
		double baseDistance=0.0;
		if(angle!=90)
		{
		tanValue  = Math.tan(angle);
		baseDistance = tanValue/height;
	    }
		
		TL = new Point2D.Double(x_cord,y_cord);
		TR = new Point2D.Double(x_cord+width, y_cord);
		BL = new Point2D.Double(x_cord-baseDistance,y_cord+height);
		BR = new Point2D.Double((x_cord-baseDistance)+width , y_cord+height);
		
	}
	
public String toString()
{
	System.out.println("Name of class : " + getClass());
	System.out.println("Top-Left          : (" +  TL.getX() + ", " + TL.getY() + ")");
	System.out.println("Top-Right        : (" +  TR.getX() + ", " + TR.getY() + ")");
	System.out.println("Bottom-Left     : (" +  BL.getX() + ", " + BL.getY() + ")");
	System.out.println("Bottom-Right   : (" +  BR.getX() + ", " + BR.getY() + ")");
	System.out.println("Base               : " + base_pel);
	System.out.println("Height             : " + height_pel);
	System.out.println("Area               : " + calculateArea());
	System.out.println("Angle              : " + angle_pel);
	System.out.println("=====================================================");
	return "";
}
}
