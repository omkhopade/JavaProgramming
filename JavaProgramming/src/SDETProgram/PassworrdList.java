package SDETProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class PassworrdList {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		List<String> list= new ArrayList<String>();
		
		int num= br.read();
		String str;
			
		
		for( int i=0;i<num;i++)
		{
			str= br.readLine();
			StringBuilder sb= new StringBuilder(str);
			sb.reverse();
			if(list.contains(sb.toString()))
			{
				System.out.println(str.length() +" "+ str.charAt((str.length()/2)) );
			}
			else
			{
				list.add(str);
			}
			
		}
	}

}
