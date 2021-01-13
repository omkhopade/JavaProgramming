package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {

	public static void main(String[] args) throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb= new StringBuilder();
		System.out.println("enter String ");
		String str= br.readLine();
		sb=sb.append(str);
		String str1[]= str.split(" ");
		
		for( int i=str1.length-1;i>=0;i--)
		{
			System.out.print(str1[i]+" ");
		}
		System.out.println();
		StringBuilder rev=sb.reverse();
		
		
		System.out.println(rev);
		
		String reve="";
		
		for(int i=str1.length-1;i>=0;i--)
		{
			reve=reve+str1[i];
		}
		
		System.out.println("reve       " +reve);
		
		
	}

	
	
}
