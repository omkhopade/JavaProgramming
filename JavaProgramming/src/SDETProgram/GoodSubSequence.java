package SDETProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoodSubSequence {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++)
		{
			String str[]= new String[num];
			str[i]= br.readLine();
			int info[]=new int[2];
			int len=str[i].length();
			int ar[]=new int[150];
			for(int b=0;b<len;b++)
			{
				char ch=str[i].charAt(b);
				ar[(int)ch]++;
				if(b==len-1 && ar[(int)ch]>1 && str[i].charAt(b)!=str[i].charAt(b-1))
				{
					info[0]=1;
				}
			}
			for(int b=95;b<150;b++)
			{
				if(ar[b]!=0)
				{
					info[1]++;
				}
			}
			
			System.out.println(info[i]);
			
		}

	}
}