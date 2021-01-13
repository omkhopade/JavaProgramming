package SDETProgram;

import java.util.Scanner;

public class SwappingNumbers {

	public static void main(String[] args) {

		
		int x, y, temp;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the value of X and Y");
		x= sc.nextInt();
		y= sc.nextInt();
		
		System.out.println("Value of x is --> " +x + "\nvalue of y is --> "+ y );
		
		temp=x;
		x=y;
		y= temp;
		
		System.out.println("After swapping \nvalue of x is --> "+ x+  "\nvalue of y is --> "+ y);
	
		
		System.out.println("Without Using Third variables");
		
		System.out.println("Enter the value of x and y ");
		
		x= sc.nextInt();
		y=sc.nextInt();
		
		System.out.println("value of x is --> "+ x +"\nvalue of y is --> "+ y);
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping " + "\nvalue of x is --> "+x +"\nvalue of y is --> "+y);
		
		
		
	}

}
