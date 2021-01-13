package ExceptionHandling;

public class Demo1 
{

	 protected static int a=80;
	
	 
	 	public static void main(String[] args) 
	{

		int x = 0,y = 2;

		try
		{
			
		
		 x=y/2;
		System.out.println(x);
		 y=x/0;
		 System.out.println("This line will not going to print ");   // the line after  the exception point will not get executed 
		}
		
		
		catch (ArithmeticException e)
		{
			System.out.println(e.getClass()+"  Exception occured");
		}
		catch (Exception e )
		{
			System.out.println("This is generic exception");
		}
		
		finally
		{
			System.out.println("This is finally block gets executed");
		}
		System.out.println("This is executed after catch clause");
	
	
	
	
	}
	
}
