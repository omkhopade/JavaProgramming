package SDETProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MobileNumber {

	public static void main(String[] args) throws IOException {

		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0;i<num;i++)
		{
			
			String a=br.readLine();
			if(a.length()!=10 ||a.charAt(0)=='0')
			{
				System.out.println("NO");
			}
			else if(a.charAt(i)>=48 && a.charAt(i)<=57)
			{
				System.out.println("Yes");
			}
			
			else
			{
				System.out.println("NO");
			}
		}
		
			
		sc.close();


	}

}
