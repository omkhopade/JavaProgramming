package StringClass;

import java.util.Scanner;

public class AdditionOfRandomNumbers {

	public static void main(String[] args) {

		int n;
		int sum=0;
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the count of number to be entered");
		n= sc.nextInt();
		System.out.println("Enter the numbers");
		
		int x[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			x[i]= sc.nextInt();
		}
		
		for(int j=0;j<n;j++)
		{
			sum=sum+x[j];
		}
		
		System.out.println("Sum of given number is --> "+ sum);
		 sc.close();
	}

}
