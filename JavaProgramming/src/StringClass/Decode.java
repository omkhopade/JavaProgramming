package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Decode {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++)
		{
			String str= br.readLine();
			
			char ch[]= str.toCharArray();
			int k=0,count=0;
			char arr[]= new char[ch.length];
			for(int j=(ch.length-2);j>=0;j=j-2)
			{
				arr[count]=ch[j];
				count++;
			}
			
			if((ch.length)%2==0)
			{
				k=1;
			}
			else
			{
				k=0;
			}
			
			for(int p=k;p<ch.length;p=p+2)
			{
				arr[count]=ch[p];
				count++;
			}
			
			for( int j=0;j<arr.length;j++)
			{
				System.out.print(arr[j]);
			}
			System.out.println();
			
		}
		
		

	}

}
