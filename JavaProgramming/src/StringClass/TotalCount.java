package StringClass;

import java.util.Scanner;

public class TotalCount {

	public static void main(String[] args) {

		String s;
		
		int count=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter String to find the char ");
		
		s= sc.next();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='m')
			{
				count++;
				
			}
		}
		
		System.out.println("Total count of given char in the string is --> "+count);

		sc.close();
	}

}
