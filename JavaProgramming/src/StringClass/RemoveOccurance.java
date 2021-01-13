package StringClass;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RemoveOccurance {

	public static void main(String[] args) throws Exception {

		
		String string;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		string=br.readLine();
		string= string.toUpperCase();
		
		for(int i=0;i< string.length();i++)
		{
			if (string.charAt(i)=='J')
			{
				string= string.replace(String.valueOf('J'),"");
			}
		}
		
		System.out.println(string);
		
		string = string.replaceAll(String.valueOf('J'), "");
		System.out.println(string);
		
		
		
		
	}

}
