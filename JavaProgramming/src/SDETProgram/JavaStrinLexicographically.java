package SDETProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaStrinLexicographically {

	public static void main(String[] args) throws IOException  {
		Scanner sc= new Scanner(System.in);
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		int n;String con="";
		n=sc.nextInt();
		String [] str= new String[n];
		 
		for( int i=0;i<n;i++)
		{
			str[i]=br.readLine();
			con=  con+str[i];
			
		}
		
		System.out.println(con.length());
		
		for( int i=0;i<n-1;i++)
		{
			for( int j=i+1;j<n;j++)
			{
				if(str[i].compareTo(str[j])>0)
				{
					System.out.println("Yes");
					break;
				}
				else
				{
					System.out.println("No");
				}
			}
				
		}
		
		for(int i=0;i<str.length;i++)
		{
			String s= str[i].substring(0, 1);
			s=s.toUpperCase();
			str[i]= str[i].substring(1);
			str[i]=s.concat(str[i]);
			System.out.print(str[i]+" ");
			
		}
		
		sc.close();
	}

}
