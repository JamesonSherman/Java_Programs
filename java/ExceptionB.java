package catching_Exceptions_with_Superclass;

public class ExceptionB extends ExceptionA


{
	
	public ExceptionB ()
	{
		super();
	}
	
	public static void Method2() throws Exception
	{
		 Method1();
	}
	
	public void Test() throws Exception
	{
		try
		{
			Method2();
		}
		catch (Exception exception0)
		{
			throw new Exception("Exception thrown in B", exception0);
		}
	}
}
