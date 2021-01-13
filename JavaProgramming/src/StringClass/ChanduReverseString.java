package StringClass;

import java.util.Scanner;

public class ChanduReverseString {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		
		int num= sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			String rev="";
			String str[]= new String [num];
			str[i]=sc.next();
			
			for(int j= str[i].length()-1;j>=0;j--)
			{
				rev= rev+str[i].charAt(j);
			}
			
			System.out.println(rev);
			
		}
	}

}
