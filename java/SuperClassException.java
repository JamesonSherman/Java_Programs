
public class SuperClassException 
{
  static String ErrorMessage = "Error Detected From SCE";
  
  
  public static void Method1() throws Exception
  {
	  int num = 10;
	  int div = 0;
	  int total = num / div;
	  if ( div > 0)
	  {
	  System.out.print(total);
	  }
	  else
	  {
		  
	  throw new ArithmeticException(ErrorMessage);
	  }
	  
  }
  
  public void Test() throws Exception
  {
	  try
	  {
		  Method1();
	  }
	  catch (Exception e)
	  {
		  System.err.println("Exception Thrown in SuperClassException");
	  }
  }
}
