package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForLoopWorking {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//int num=Integer.parseInt(br.readLine());
		int arr[] = {1,2,3,5,0,0,0,8,0,0,0,9,9,9,9,9};
		
		
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[count++]=arr[i];
			}
		}
		
		while(count<arr.length)
		{
			arr[count++]=0;
		}
		
		
		for(int i: arr)
		{
			System.out.print(" "+i);
		}
	}

}
