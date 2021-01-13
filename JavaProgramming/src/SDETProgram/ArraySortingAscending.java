package SDETProgram;

import java.util.Scanner;

public class ArraySortingAscending {

	public static void main(String[] args) {

		
		int n , temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");;
		n= sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the value of array");
		
		for(int i=0;i<n;i++)
		{
			arr[i]= sc.nextInt();
			
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[j];
					arr[j]= arr[i];
					arr[i]= temp;
				}
			}

		}
		
		System.out.println("Sorted array will be ");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}

}
