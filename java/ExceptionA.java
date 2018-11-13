package catching_Exceptions_with_Superclass;

public abstract class ExceptionA
{
	
	static String  ExceptionText = " Exception In A ";
	
	
	public static void Method1() throws Exception
	{
				throw new Exception(ExceptionText);
	}
	
	public abstract void Test()throws Exception;
	
}
