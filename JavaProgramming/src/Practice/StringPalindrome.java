package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPalindrome {

	public static void main(String[] args) throws IOException {
	
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		String rev="";
		String spl[]= str.split(" ");
		for( int i=spl.length-1;i>=0;i--)
		{
			rev= rev+spl[i];
		}

		if(rev.length()==str.length())
		{
			
				if(str.equals(rev))
				{
					System.out.println("String is palindrome ");
				}
				
				
			
		}
		
		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
