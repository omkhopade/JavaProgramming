package SDETProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecodeString {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());

		for( int i=0;i< num;i++)
		{
			String str[] = new String [num];
			str[i]= br.readLine();
			String rev="";
			for(int j=0;j<str[i].length();j++)
			{
				int middle= str[i].length()/2;
				char ch= str[i].charAt(middle);
				rev= rev+ch;
				
			}
			System.out.println(rev);
		}

		
	}

}
