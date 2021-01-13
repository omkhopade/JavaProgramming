package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountEnemies {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int num= Integer.parseInt(br.readLine());
		String str[]= new String [num];
		
		for(int i=0;i<num;i++)
		{
			int Ocounter=0;
			int Xcounter=0;
			int ECounter=0;
			str[i]= br.readLine();
			str[i]=str[i].toUpperCase();
			char chs[]= str[i].toCharArray();
			
			for(int j=0;j<chs.length-1;j++)
			{
				if(chs[j]=='O' && Xcounter==0)
				{
					
					Ocounter++;
					
				}
				else if(chs[j]=='*')
				{
					ECounter=ECounter+Ocounter;
					Xcounter=0;
					
				}
				
				else if(chs[j]=='X')
				{
					Ocounter=0;
					Xcounter=1;
				}
				
			}
			
			System.out.println(ECounter);
			
			
			
			
		}
		

	}

}
