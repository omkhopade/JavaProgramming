package SDETProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VCPairs {

	public static void main(String[] args) throws IOException {

		int num, num1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of string ");
		num=sc.nextInt();
		
		
		
		
		for(int i=0; i<num;i++)
		{
			int  count=0;
			 
			num1= sc.nextInt();
			
			
			String string = sc.next();
			for(int j=0;j<num1-1;j++)
			{
				
				if((string.charAt(j+1)=='a'|| string.charAt(j+1)=='e'|| string.charAt(j+1)=='o'|| 
					string.charAt(j+1)=='u'|| string.charAt(j+1)=='i') && (string.charAt(j)!='a'||
					string.charAt(j)!='e'|| string.charAt(j)!='o'||string.charAt(j)!='u'|| string.charAt(j)!='i'))
				{
					count ++;
				}
				
			}
			
			System.out.println(count);
			
		}
		
		
		
		
	}

}
