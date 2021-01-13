package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReversString {

	public static void main(String[] args)throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		String temp="";
		String str1[]= str.split(" ");
		
		for( int i=str1.length-1;i>=0;i--)
		{
			
			temp=temp+str1[i]+" ";
		}
		
		System.out.println(temp);
		

	}

}
