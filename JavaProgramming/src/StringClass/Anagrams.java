package StringClass;

import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String str1= sc.next();
		String str2= sc.next();
		String temp1="";
		String temp2="";
		
		for(int i=0;i< str1.length();i++)
		{
			
			for( int j=0; j<str2.length();j++)
			{
				if(str1.charAt(i)==str2.charAt(j))
				{
					temp1=temp1+str1.charAt(i);
					temp2=temp2+str2.charAt(j);
					
				}
				
				
			}
		
		}
		
		int Result1=str1.length()-temp1.length();
		int Result2=str2.length()-temp2.length();
		int result=Result1+Result2;
		System.out.println(result);
				
		sc.close();
		

	}

}
