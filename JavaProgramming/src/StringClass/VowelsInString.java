package StringClass;

import java.util.Scanner;

public class VowelsInString {

	
	Scanner sc= new Scanner(System.in);
	
	static int count =0;
	public static String Vowels(String string, int k)
	
	{
		string= string.substring(0, k);
		System.out.println("Substring is --> "+ string);
		
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)=='a'||string.charAt(i)=='e'||string.charAt(i)=='i'|| string.charAt(i)=='o'||string.charAt(i)=='u')
			{
				count++;
			}
		}
		
		
		
		return string;
		
	}
	
	public static void main(String[] args) {
		
		
	String demo=Vowels("ayhgudginh", 5);
	System.out.println(demo);
	System.out.println(count);
	
		
		
	}
	
}
