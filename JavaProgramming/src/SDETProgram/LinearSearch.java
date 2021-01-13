package SDETProgram;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		int num, key, count=0;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the range of the array");
		num= sc.nextInt();
		int arr[]= new int [num];
		
		System.out.println("Enter the array values");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]= sc.nextInt();
		}
		
		System.out.println("Enter the key to be  search");
		key= sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
			if(arr[i]==key)
			{
				System.out.println("Found the key at "+(i+1)+" "+" location");
				count++;
				
			}
			
			else if(arr[i]== arr.length)
			{
				System.out.println("Key is not found in the given array");
			
			}
		
		System.out.println("Given number occured in a array "+count +" times ");
		
		sc.close();
		}
		
		
	}


