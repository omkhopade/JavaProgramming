package SDETProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayAnagrams {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());
		String str[]= new String[num];
		int count=0;
		for(int i =0;i<num;i++)
		{
			str[i]=br.readLine();
		
		}
		
		for( int i=0;i<num;i++)
		{
			for( int j=i+1;j<num;j++)
			{
				if(str[i].length()==str[j].length())
				{
					if(str[i].charAt(str[i].length()-1)==str[j].charAt(str[j].length()-1)&&str[i].charAt(0)==str[j].charAt(0))
						{
						
							str[i]=str[i].toLowerCase();
							str[j]=str[j].toLowerCase();
							
							char ch1[]= str[i].toCharArray();
							char ch2[]= str[j].toCharArray();
							
							Arrays.sort(ch1);
							Arrays.sort(ch2);
							
							if(Arrays.equals(ch1, ch2))
							{
								count++;
							}
						
							
						}
				}
			}
		}
		System.out.println(count);
	}

}
