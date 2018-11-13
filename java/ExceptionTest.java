package catching_Exceptions_with_Superclass;

public class ExceptionTest {

	public static void main(String[] args)
	
	{
		ExceptionB b = new ExceptionB();
		ExceptionC c = new ExceptionC();
		
		
		try {
			b.Test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace(System.err);
		}
		
		
			try {
				c.Test();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
