package SDETProgram;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		//int num= sc.nextInt();
		
		String str= sc.next();
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev= rev+str.charAt(i);
		}
		System.out.println("Palindrome is --> "+rev);
		if (rev.equals(str))
		{
			
			char ch[]= str.toCharArray();
			char chs;
			for( int i=0;i<ch.length;i++)
			{
				if(i==(ch.length/2))
				{
					chs=ch[i];
					System.out.println(chs);
					break;
					
				}
			}
			
			
		}
		
	}

}
