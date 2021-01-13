package SDETProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MannysPassword {


	public static void main(String[] args) throws IOException {


		BufferedReader br= new BufferedReader( new InputStreamReader(System.in));
		Scanner sc= new Scanner(System.in);

		int num= sc.nextInt();
		String str[]= new String [num];
		boolean flag=false;

		for(int i=0;i<num;i++)
		{
			str[i]=br.readLine();
		}

		for(int i=0;i<str.length;i++)
		{
			String rev="";

			for(int j=str[i].length()-1;j>=0;j--)
			{
				rev= rev+str[i].charAt(j);
			}

			for(int p=0;p<str.length;p++)	
			{
				if(rev.equals(str[p]))
				{
					char ch[]= str[p].toCharArray();

					for( int k=0;k<ch.length;k++)
					{
						if(k==(ch.length/2))
						{
							System.out.print(ch.length);
							System.out.print (" "+ch[k]);
							flag=true;
							break;
						}
					}
					break;
				}

			}

			if(flag==true)
			{
				break;
			}

		}





		sc.close();
	}
}