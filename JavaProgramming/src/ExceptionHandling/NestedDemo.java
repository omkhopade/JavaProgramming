package ExceptionHandling;

public class NestedDemo extends Throwable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static int x=0,y=5,z; 
	
	public static void main(String[] args)  {

		
		try
		{
			z=x/y;
			 
			 
			 
			 
			 
			
		}catch(ArithmeticException e)
		{
			System.out.println("Divede by zero excepion 2");
		}
		
		
		
	}

}
