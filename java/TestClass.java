
public class TestClass {

	public static void main(String[] args)
	{
		SubClassException Beta = new SubClassException();
		SuperClassException Alpha = new SuperClassException();			
		 try {
				Alpha.Test();
				Beta.Test();
			} catch (Exception exception) {
				// TODO Auto-generated catch block
				exception.printStackTrace();
			}
	}

}
