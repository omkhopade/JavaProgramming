package SDETProgram;

import java.util.Scanner;

public class CharSum {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int result=0;;


		String string;

		string= sc.next();


		for(int j=0;j<string.length();j++)
		{
			int sum=0;

			for(char i='a';i<='z';i++)
			{

				sum=sum+1;
				if( string.charAt(j)==i)
				{
					result= result+sum;


				}
			}
		}
		System.out.println(result);
		sc.close();
	}

}
