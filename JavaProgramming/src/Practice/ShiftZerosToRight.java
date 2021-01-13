package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ShiftZerosToRight {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		char arr[]=str.toCharArray();
		char arr1[]= new char[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!='0')
			{
				arr1[count]=arr[i];
				count++;
			}
		}
		
		while(count<arr.length)
		{
			arr1[count]='0';
			count++;
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]);
		}
		
		
		
		

	}

}
