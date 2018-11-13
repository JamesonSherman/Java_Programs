package quadilaterals;
import java.awt.geom.*;
public abstract class Quadilatreral
{
  protected Point2D TL = new Point2D.Double (0.0,0.0);  // top left
  protected Point2D TR = new Point2D.Double (0.0,0.0);   // top right
  protected Point2D BL = new Point2D.Double (0.0,0.0);    // bottom left
  protected Point2D BR = new Point2D.Double (0.0,0.0);     // bottom right
  
  
 public abstract double calculateArea();
}
