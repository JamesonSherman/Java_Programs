// James.Sherman 900114 Twelve Days of Christmas program.
package Package_Delta;
import java.util.Scanner;
public class Twelve_days 
{
	private static Scanner scanner = new Scanner( System.in );
	public static void main(String[] args) 
	{
			

	      int last = 12; 
	      int holder = 0;

do
{
	      for (int day = 1; day <= last; day++)
	      {
	         System.out.print ("On the " + day);

	         switch (day)
	         {
	            case 1:
	               System.out.print ("st");
	               break;
	            case 2:
	               System.out.print ("nd");
	               break;
	            case 3:
	               System.out.print ("rd");
	               break;
	            default:
	               System.out.print ("th");
	         }

	         System.out.println (" day of Christmas my true love gave to"
	                             + " me");

	         switch (day)
	         {
	            case 12:
	               System.out.println ("Twelve drummers drumming,");
	            case 11:
	               System.out.println ("Eleven pipers piping,");
	            case 10:
	               System.out.println ("Ten lords a leaping,");
	            case 9:
	               System.out.println ("Nine ladies dancing,");
	            case 8:
	               System.out.println ("Eight maids a milking,");
	            case 7:
	               System.out.println ("Seven swans a swimming,");
	            case 6:
	               System.out.println ("Six geese a laying,");
	            case 5:
	               System.out.println ("Five golden rings,");
	            case 4:
	               System.out.println ("Four calling birds,");
	            case 3:
	               System.out.println ("Three French hens,");
	            case 2:
	               System.out.println ("Two turtle doves, and");
	            default:
	               System.out.println ("A partridge in a pear tree.");
	         }

	         System.out.println();
	         }
	      System.out.println("would you like to print again? YES||NO?");
	      String inner = scanner.nextLine();
	      if ( inner.equals("YES") )
			{
			    holder = 0;
			}
			else
			{
				holder = 1;
			}
}
while (holder != 1);
System.exit(0);
}
}
