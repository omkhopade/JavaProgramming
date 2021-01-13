package StringClass;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstOccurance {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		for( int i=0;i<num;i++)
		{
			
			String str[]= new String[num];
			
			str[i]= sc.next();
			
			Set<Character> set= new LinkedHashSet<Character>();
			
			
			for(int j=0;j<str[i].length();j++)
			{
				set.add(str[i].charAt(j));
			}
			
			for( char ch :set)
			{
				System.out.print(ch);
			}
		}
	
		
		
		
		
	
		

		
	}

}	
