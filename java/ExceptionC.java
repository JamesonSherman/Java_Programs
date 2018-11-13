package catching_Exceptions_with_Superclass;

public class ExceptionC extends ExceptionB

{
	public ExceptionC ()
	{
		super();
	}
	
	public static void Method3() throws Exception
	{
		 Method2();
	}
	
	public void Test() throws Exception
	{
		
		try
		{
			Method3();
		}
		catch (Exception exception0)
		{
			throw new Exception("Exception thrown in C", exception0);
		}
	}
	
}
