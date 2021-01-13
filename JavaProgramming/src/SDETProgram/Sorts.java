package SDETProgram;

import java.util.Arrays;


public class Sorts {

	public static void main(String[] args) {

		
		char [] string= {'L','I','S','T','E','N'};
		System.out.println("Given String is --> ");
		for(int i=0;i<string.length;i++)
		{
		System.out.print(string[i]);
		}
		
		System.out.println();
		Arrays.sort(string);
		System.out.println(string);
		
	}

}
