package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ModifyString {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		
		String temp="";
		char ch[]= str.toCharArray() ;
		
		for( int i=0;i<ch.length;i++)
		{
			
			if(ch[i]>='a' && ch[i]<'z' || ch[i]>'A' && ch[i]<'Z')
			{
				temp=temp+ch[i];
				
			}
			
		}
		
		System.out.println(temp);
		

	}

}
