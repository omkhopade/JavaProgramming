package StringClass;

import java.util.Scanner;

public class ReplaceStringDemo {

	public static void main(String[] args) {

		
		String s ;
		String x = null;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the String ");
		
		s= sc.next();
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='s')
			{
				s=s.replace("s", "$");
				
			}
		}
		 
		System.out.println("Updated String will be --> "+s);
	
		
		
		
	
	
	
	}
	
	
	

}
