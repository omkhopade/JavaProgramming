package StringClass;

import java.util.Scanner;

public class SeparateAlphabateNumbers {

	public static void main(String[] args) {

		String s;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the the String ");
		
		s= sc.next();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)<'A' || s.charAt(i)> 'Z' && s.charAt(i) < 'a'  || s.charAt(i) >'z' )
			{
				s=s.substring(0, i)+s.substring(i+1);
				i--;
			}

		}
		System.out.println("Divide String will be "+s);
	}

}
