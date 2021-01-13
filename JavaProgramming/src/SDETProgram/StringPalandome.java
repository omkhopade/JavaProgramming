package SDETProgram;

import java.util.Scanner;

public class StringPalandome {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		for( int i=0;i<num;i++)
		{
			String rev="";
			String str[] = new String [num];
			str[i]=sc.next();
			for(int j=str[i].length()-1;j>=0;j--)
			{
				rev= rev+str[i].charAt(j);
			}
				
			
			
			 if(rev.equals(str[i]))
			{
				System.out.println("Given String is palindrome");
			}
			 
			 else 
			 {
				 System.out.println("Given String is not palindrome");
			 }
			
		}
		
		
		 
		 
		 
		 
		 
		 
	}

}
