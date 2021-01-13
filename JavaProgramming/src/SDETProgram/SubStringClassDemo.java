package SDETProgram;

import java.util.Scanner;

public class SubStringClassDemo {

	public static void main(String[] args) {

		
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		s= sc.next();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)<'0' || s.charAt(i)>'9' && s.charAt(i)<'a' || s.charAt(i)>'z')
			{
				s=s.substring(0,i)+s.substring(i+1);
				i--;
				
				
			}
			
			
		}
		
		System.out.println("Substring will be "+ s);
		
	}

}
