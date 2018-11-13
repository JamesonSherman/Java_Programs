package quadilaterals;
import java.awt.*;
import java.awt.geom.Point2D;
public class Square extends Rectangle 
{
  protected double side = 0.0;
  
  
  
  public Square()
  {
	  super();
  }
  
  
  
  public Square(double x_cord, double y_cord, double side)
  {
	  super();
	  this.side = side;
	  TL = new Point2D.Double(x_cord,y_cord);
		TR = new Point2D.Double(x_cord+side, y_cord);
		BL = new Point2D.Double(x_cord,y_cord+side);
		BR = new Point2D.Double(x_cord + side, y_cord + side);
	  
  }
  
  public double calculateArea()
	
	{
		double area = side * side;
		return area;
	}

	public String toString()
	{
		System.out.println("Name of class : " + getClass());
		System.out.println("Top-Left          : (" +  TL.getX() + ", " + TL.getY() + ")");
		System.out.println("Top-Right        : (" +  TR.getX() + ", " + TR.getY() + ")");
		System.out.println("Bottom-Left     : (" +  BL.getX() + ", " + BL.getY() + ")");
		System.out.println("Bottom-Right   : (" +  BR.getX() + ", " + BR.getY() + ")");
		System.out.println("Side              : " + side);
		System.out.println("Area               : " + calculateArea());
		System.out.println("=====================================================");
		return "";
	}
}
