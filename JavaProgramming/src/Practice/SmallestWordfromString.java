package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SmallestWordfromString {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		
		String str1[]=str.split(" ");
		
		String temp="";
		for( int i=0;i<str1.length-1;i++)
		{
			
			if(str1[i].length()>str1[i+1].length())
			{
				temp=str1[i+1];
			}
			
		}
		
		System.out.println(temp);
		

	}

}
