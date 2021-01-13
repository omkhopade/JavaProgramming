package SDETProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		
		int num, fact=1;
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the number to find factorial");
		
		num= sc.nextInt();
		
		
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial of given number is --> "+ fact );
		
		
		System.out.println("\nFactorial using while loop");
		
		
		 int n=1, num1, fact1=1;
		 
		 
		 System.out.println("\nEnter the value of num 1");
		 num1= sc.nextInt();
		 
		 while( n<=num1)
		 {
			 fact1= fact1*n;
			 n++;
			 
		 }
		 
		  System.out.println("factorial of given number is --> "+ fact1);
	}
	

}
