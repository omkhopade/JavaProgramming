package SDETProgram;

import java.util.Scanner;

public class AdditionOfnNumbers {

	public static void main(String[] args) {

		int n;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the number");
		n= sc.nextInt();
		System.out.println("Enter the value of array");
		
		int arr[]= new int [n];
		int sum=0, avg=0;
		
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
			 sum=sum+arr[i];
			 avg=sum/n;
			 
		}
		
		System.out.println("Addition is total no is --> "+ sum);
		System.out.println("Average of total no is --> "+ avg);
		 
		sc.close();
	}

}
