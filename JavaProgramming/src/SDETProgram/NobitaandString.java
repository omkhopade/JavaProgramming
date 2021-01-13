package SDETProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NobitaandString {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);
		int num =Integer.parseInt(br.readLine());
		List <String> list= new ArrayList<String>();
		String str[]= new String[num];
		for( int i=0;i<num;i++)
		{
			str[i]=br.readLine();
			
			String str1[]= str[i].split(" ");
			for(int j=0;j<str1.length;j++)
			{
				list.add(str1[j]);
			}
		}
		
	
		
		
		for( int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+" ");
		}
		
		
		sc.close();
		
	}

}
