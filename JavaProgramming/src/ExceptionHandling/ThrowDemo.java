package ExceptionHandling;

public class ThrowDemo {

	
	
	
	static void demothrow()
	{
		try {
			
		
		throw new NullPointerException("Demo");
		
		}
		catch (NullPointerException e)
		{
			System.out.println("caught inside demothrow");
			 throw e;
			 
		}
	}
	public static void main(String[] args) {

		try {
			demothrow();
		}
		catch (NullPointerException e)
		{
			System.out.println("Recaught in " + e);
		}
	}

}
