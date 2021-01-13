package SDETProgram;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {

		
		 int n;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the value of an array");	 
		 n= sc.nextInt();
		 System.out.println("Enter the array ");
		 int arr[]= new int[n];
		 for(int i=0;i<n;i++)
		 {
			 arr[i]= sc.nextInt();
			 
			 
		 }
	
		 for(int i=n-1;i>=0;i--)
		 {
			 
			 System.out.println(arr[i]);
		 }
		 
		 sc.close();
		
	}

}
