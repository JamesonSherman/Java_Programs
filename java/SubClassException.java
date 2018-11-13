
public class SubClassException extends SuperClassException
{
	
	static String ErrorBeta = " Error reaccuring in SubClassException";
	
	public SubClassException()
	{
		super();
	}
	  
	
	public static void Method2() throws Exception
	  {
		  throw new Exception(ErrorBeta);  
	  }
	
	  public void Test() throws Exception
	  {
		  try
		  {
			  Method2();
		  }
		  catch (Exception e)
		  {
			  System.err.println("Exception Thrown in SubClassException");
		  }
	  }
}
