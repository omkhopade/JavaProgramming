package SDETProgram;

import java.util.Scanner;

public class ReplaceWithVowel {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		for(int k=0;k<num;k++)
		{
			
		String str[]= new String[num];
		 str[k]= sc.next();
		int count=1;
		for( int i=0;i<str[k].length();i++)
		{

			for(int j=1;j<str[k].length();j++)
			{
				if(str[k].charAt(i)=='a'||str[k].charAt(i)=='i'||str[k].charAt(i)=='o'||str[k].charAt(i)=='o'||str[k].charAt(i)=='e')
				{
					if(str[k].charAt(j)=='_')
					{
						str[k]=str[k].replace(str[k].charAt(j), str[k].charAt(i));
						count ++;
					}
				}
			}
			

		}
		System.out.println(count);
		}
		
		sc.close();
	}
}