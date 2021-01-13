package SDETProgram;

import java.util.Scanner;

public class SplitHouse {

	public static void main(String[] args) {
		int num;
		
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number of the house and fence");
		num=sc.nextInt();
		String string ;
		string=sc.next();
	
		
		if(string.contains("HH")&&string.contains("H..")&&string.contains("..H"))
		{
			System.out.println("Does not possible");
			
		}
		
		else
		{
			System.out.println("YES");
			
		}
		
		for(int i=0;i<string.length();i++)
		{
			string=string.replace(".", "B");
			
		}
		System.out.println(string);
	}

}
