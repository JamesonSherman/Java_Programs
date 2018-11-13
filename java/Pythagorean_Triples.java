//James.SHerman 900114 Pytha Triples program 
package Package_Charlie;

public class Pythagorean_Triples 
{

	public static void main(String[] args) 
	{
		
	      int side1;
	      int side2;
	      int Hypotenuse;
System.out.println("Side1     || Side2     || Hypotenuse");
	      for ( side1 = 1; side1 <= 500; side1++ )
	      {
	         for ( side2 = 1; side2 <= 500; side2++ )
	         {
	            for ( Hypotenuse = 1; Hypotenuse <= 500; Hypotenuse++ )
	            {
	               if ( ( side1 * side1 ) + ( side2 * side2 ) ==
	                  ( Hypotenuse * Hypotenuse ) )
	                  System.out.printf( "side1: %d, || side2: %d, || Hypotenuse: %d\n",
	                     side1, side2, Hypotenuse );   
	               
	            	   
	            }
	         }
	      }
	   
	}
}
