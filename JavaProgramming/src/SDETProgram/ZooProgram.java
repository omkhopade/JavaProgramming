package SDETProgram;

import java.util.Scanner;

public class ZooProgram {

	public static void main(String[] args) {

		
		String string;
		int zcount=0,ocount=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		string = sc.next();
		for(int i=0;i<string.length();i++)
		{
			if (string.charAt(i)=='z')
			{
				zcount++;
				
			}
			
			else
			{
				ocount++;
			}
			
		}
			if((2*zcount)==ocount)
			{
				System.out.println("YES");
			}
			
			else
			{
				System.out.println("NO");
			}
		
		
			sc.close();	
	}

}
