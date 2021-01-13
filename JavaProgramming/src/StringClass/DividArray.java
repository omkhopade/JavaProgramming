package StringClass;

import java.util.Arrays;
import java.util.Scanner;

public class DividArray {

	public static void main(String[] args) {

		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size of array");
		num=sc.nextInt();
		
		int arr[] = new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		int len= arr.length ;
		int first []=new  int[len/2];
		int last [] =new int [len-first.length];
		
 		for(int i=0;i< len;i++)
 		{
 			if(i<first.length)
 			{
 				first[i]=arr[i];
 				
 			}
 			else
 			{
 				last[i-first.length]= arr[i];
 				
 			}
 		}
 		
 		System.out.println(Arrays.toString(first));
 		System.out.println(Arrays.toString(last));
		
		
		
	}

}
