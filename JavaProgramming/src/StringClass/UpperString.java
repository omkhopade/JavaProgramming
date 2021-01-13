package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpperString {

	public static void main(String[] args) throws IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		
		String str1[]=str.split(" ");
		
		for(int i=0;i<str1.length;i++)
		{
			String str2=str1[i].substring(0, 1);
			String str3=str1[i].substring(1);
			 str2=str2.toUpperCase();
			 String str4=str2+str3;
			System.out.print(str4+" ");
		}
	}

}
