package SDETProgram;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SevenSegmentDisplay {

	public static void main(String[] args) throws Exception {

		int arr[]= {6,2,5,5,4,5,6,3,7,6};
		int num;
		Scanner sc= new Scanner (System.in);
		StringBuilder str= new StringBuilder("");
		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		num=sc.nextInt();
		
		while(num--!=0)
		{
			int count=0;
			String string = br.readLine();
			 for(int i=0;i<string.length();i++)
			 {
				 count = count+arr[string.charAt(i)-'0'];
				 
				 
			 }
			 
			 if( count%2==1)
			 {
				 str.append("7");
				 
				 count = count-3;
				 for( int i=0;i< count;i=i+2)
				 {
					 str.append("1");
					 
				 }
			 }
			 
			 else
			 {
				 for(int i=0;i< count ;i=i+2)
				 {
					 str.append("1");
				 }
			 }
			
			 str.append("\n");
		}
		
		
		System.out.println(str);
		sc.close();
	}

}
