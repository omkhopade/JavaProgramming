package SDETProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountTheString {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		for( int i=0;i<num;i++)
		{
			String str[]= new String[num];
			str[i]=br.readLine();
			str[i]=str[i].toLowerCase();
			int count=0;
			for(int j=0;j<str[i].length();j++)
			{
				if(str[i].charAt(j)=='$')
				{
					count =4;
				}
				if(str[i].charAt(j)=='&')
				{
					count=7;
				}
			}
			
			System.out.println(count);
		}
		
	}

}
