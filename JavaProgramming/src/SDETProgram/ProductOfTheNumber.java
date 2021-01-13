package SDETProgram;

import java.util.Scanner;

public class ProductOfTheNumber {

	public static void main(String[] args) {

		
		int num,sum=1;
		 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		num=sc.nextInt();
		int arr[] = new int [num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
			
		for(int i=0;i<num;i++)
		{
			
			sum=sum*arr[i] ;
			
		}
		
		System.out.println("Product of the given array is -->  "+ sum);
		sc.close();
	}

}
