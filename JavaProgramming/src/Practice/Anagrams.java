package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1= br.readLine();
		String str2=br.readLine();
		
		anagramString(str1, str2);
		
		

	}
	
	
	public static void anagramString(String str1, String str2)
	{
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		char arr1[]= str1.toCharArray();
		char arr2[]= str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Given String are Anagramss");
		}
		
		else
			System.out.println("Given Strings Are not Anagrams");
	}
	

}
