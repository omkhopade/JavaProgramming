package SDETProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SecretPassword {

	public static void main(String[] args) throws NumberFormatException, IOException {

		Scanner sc= new Scanner(System.in);
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

		int num= sc.nextInt();



		for(int i=0;i<num;i++)
		{
			int length= Integer.parseInt(br.readLine());
			int keys= sc.nextInt();
			String str[]= new String[num];
			str[i]=sc.next();
			char ch[]=str[i].toCharArray();
			if(str[i].length()==length);
			{

				for(int j=0;j<ch.length;j++)
				{
					if(ch[j]>'0'&&ch[j]<'9')
					{
						ch[j]=(char) (ch[j]+keys);
					}

					else if(ch[j]>'a'&& ch[j]<'z')
					{
						int temp= (int)ch[j]+keys;
						if(temp>122)
						{
							temp=temp-26;
						}
						ch[j]=(char)temp;
					}
					else if(ch[j]>'A'&& ch[j]<'Z')
					{
						int temp= (int)ch[j]+keys;
						if(temp>90)
						{
							temp=temp-26;
						}
						ch[j]=(char)temp;
					}

					else
					{
						ch[j]=ch[j];
					}
				}

			}


			for(int j=0;j<ch.length;j++)
			{
				System.out.print(ch[j]);
			}
		}

		
		sc.close();
	}

}
