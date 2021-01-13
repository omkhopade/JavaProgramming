package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SumitString {

	public static void main(String[] args) throws IOException {

		Scanner sc= new Scanner(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num= sc.nextInt();
		for(int i=0;i< num;i++)
		{
			boolean flag=false;
			String str[]= new String[num];
			
			str[i]= br.readLine();
			
			for(int j=0;j<str[i].length();j++)
				
			{
				for(int k=1;k<str[i].length()-1;k++)
				{
					
				
				if((Math.abs((int)str[i].charAt(j)-(int)str[i].charAt(k)))==1||(Math.abs((int)str[i].charAt(j)-(int)str[i].charAt(k)))==25)
				{
					flag=true;
				}
					
				else if(str[i].charAt(j)==str[i].charAt(k))
				{
					flag = false;
				}
				
				}
			}
			
			if( flag==true)
			{
				System.out.println("YES");
			}
			else 
			{
				System.out.println("NO");
			}
		}
		sc.close();
		br.close();
		
	}

}
