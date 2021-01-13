package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class DNAPride {

	public static void main(String[] args) throws IOException {

		
		Scanner sc= new Scanner(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
			
		int num= sc.nextInt();
		for(int i=0;i<num;i++)
		{
			int pair=sc.nextInt();
			
			char arr[]= new char[pair];
			
			for(int j=0;j<arr.length;j++)
			{
				char c=(char) br.read();
				arr[j]=c;
				
			}

			for(int k=0;k<arr.length;k++)
			{
				System.out.print(arr[k]);
			}
		}
	}
}
