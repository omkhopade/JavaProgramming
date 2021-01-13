package SDETProgram;

import java.util.Scanner;

public class ToggleString {

	public static void main(String[] args) {


		Scanner sc= new Scanner (System.in);
		String s, uString="", lString="";
		
		System.out.println("Enter the String ");
		s= sc.next();
		char ch[]= new char[s.length()];
		 
		
		
		for(int i=0;i<s.length();i++)
		{
			
			 if(s.charAt(i)>='a' && s.charAt(i)<='z')
			{
			ch[i]=s.charAt(i);
			lString= lString+ch[i];
			lString =lString.toUpperCase();
			}
			 if(s.charAt(i)>='A' && s.charAt(i)<='Z')
				{
					ch[i]=s.charAt(i);
					uString= uString+ch[i];
					uString =uString.toLowerCase();
					
				}
			
		}
		
		
		
		s= uString+lString;
		System.out.println(s);
	
		sc.close();




	}

}
