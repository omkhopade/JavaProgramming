package FileHandling;

public class MultilevelInheritance {

	
	int y=100;
	public static void BaseClass(String x)
	{
		System.out.println("This is the ");
		System.out.println(x);
	}

	static
	{
		System.out.println("This will excutes before the main method");
	}
	public static void main(String[] args) {
		
		Demo1 d = new Demo1();
		
		BaseClass("Hello World");
		BaseClass("Welcome to java");
		MultilevelInheritance.BaseClass("I love Programming");
		
		
	}
	
	
}


class Demo1   {
	 static int  x=10;
	
	 public  void Demomethod1()

	 {
		 System.out.println("This is th method of the demo class");
		 System.out.println("Value of x is "+ x);

	 }
	 
	 
	 
	 
}


class Demo2 extends Demo1
{
	public static void methodDemo(int x)
	{
		System.out.println("This is the Demo 2 Method");
		
	}
	
	public static void methodDemo(String y)
	{
		
	}

	
}
