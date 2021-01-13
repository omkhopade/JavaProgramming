package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) throws IOException {

		Scanner sc= new Scanner(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int num=sc.nextInt();

		for(int k=0;k<num;k++)
		{
			
			String str[]= new String[num];
			str[k]= br.readLine();
			str[k]=str[k].toLowerCase();
			
			char ch[]= str[k].toCharArray();



			for(int i=0;i<ch.length;i++)
			{
				int sum=0;

				if(ch[i]==' ')
				{
					System.out.print("$");
				}
				else
				{
					for(char j='a';j<='z';j++)
					{
						sum=sum+1;

						if(ch[i]==j)
						{
							System.out.print(sum);
						}

					}
				}

			}
					System.out.println();
		}
		sc.close();
	}

}
