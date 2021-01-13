package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DiffrenceofCharacter {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str1= br.readLine();
		String str2= br.readLine();
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.equals(str2))
		{
			System.out.println("YES");
		}
		else if( str1.length()!=str2.length())
		{
			System.out.println("NO");
		}
		
		else
		{
			char ch1[]= str1.toCharArray();
			char ch2[]= str2.toCharArray();
			
			boolean flag=false;
			
			for(int i=0;i<ch1.length;i++)
			{
				if(Math.abs(ch1[i]-ch2[i])%2==0)
				{
					flag=true;
					break;
				}
			}
			
			
			if(flag==true)
			{
				System.out.println("YES");
			}
			
			else
			{
				System.out.println("NO");
			}
		}
		
	
		
	}

}
