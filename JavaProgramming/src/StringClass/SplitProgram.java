package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SplitProgram {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		String string ="let's ";
		String stringA="Hel";
		String stringB="java";
		
		int result=stringB.compareTo(stringA);
		System.out.println(result);
		
		String str=sc.next();
		String str1[]= str.split("k");
		
		for(int i=0;i<str1.length;i++)
		{
			System.out.println(str1[i]);
		}
		sc.close();
	}

}
