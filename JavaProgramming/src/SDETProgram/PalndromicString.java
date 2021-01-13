package SDETProgram;

import java.util.Scanner;

public class PalndromicString {

	public static void main(String[] args) {

	
		String string, temp, reverse="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Ente the String to validate ");
		string = sc.next();
		temp=string;
		System.out.println("Given String is -- > "+ string);
		
		for(int i=string.length()-1;i>=0;i--)
		{
			reverse= reverse+string.charAt(i);
			
		}
		System.out.println("revrse String is --> "+ reverse);
		
		if(temp.equals(reverse))
		{
			System.out.println("Given String is Palindrome");
		}
		else
			System.out.println("Given String is not Palindrome");
		
		
		sc.close();
	}
}
