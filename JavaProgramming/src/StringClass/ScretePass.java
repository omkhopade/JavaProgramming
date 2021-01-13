package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScretePass {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());

		for(int i=0;i< num;i++)
		{
			String str[]= new String [num];
			int length= Integer.parseInt(br.readLine());
			int key= Integer.parseInt(br.readLine());
			str[i]=br.readLine();

			if( str[i].length()==length)
			{

				for(int j=0;j<str[i].length();j++)
				{
					if(str[i].charAt(j)>'A'||str[i].charAt(j)<'Z'||str[i].charAt(j)>'a'||str[i].charAt(j)<'z')

					{
						for(char k='a';k<='z';k++)
						{
							if(str[i].charAt(j)==k)
							{
								k=(char) (k+key);
								System.out.print(k);
							}

						}
						for(char p='A';p<='Z';p++ )
						{
							if(str[i].charAt(j)==p)
							{
								p=(char) (p+key);
								System.out.print(p);
							}
						}
					}
					else
						System.out.print(str[i].charAt(j));
				}

			}
			else
			System.out.println("Enter the string with correct length");

		}

	}

}
