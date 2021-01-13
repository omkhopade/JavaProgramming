package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class VowelPhobia {

	public static void main(String[] args) throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		for(int i=0;i< num;i++)
		{
			int count=0;
			String str[]= new String[num];
			str[i]= br.readLine();
			str[i]= str[i].toLowerCase();
			for( int j=0;j<str[i].length();j++)
			{
				if(str[i].charAt(j)=='a'||str[i].charAt(j)=='e'||str[i].charAt(j)=='i'||str[i].charAt(j)=='o'||str[i].charAt(j)=='u')
				{
				 count++;
				}
			

			}
			
			System.out.println(count);

			
		}
		
		
		sc.close();
		br.close();
	}

}
