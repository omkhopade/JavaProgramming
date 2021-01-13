package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringChallenge {

	public static void main(String[] args) throws IOException {


		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string ");
		String s= br.readLine();
		char ch[]= s.toCharArray();
		boolean flag= false;
		int len = ch.length;
		if(len>4 && len<25 && ch[0]>'a' && ch[0]<'z' && ch[0]>'A' && ch[0]>'Z' && ch[0]!='_')
		{

			if(ch[len-1]!='_')
			{
				for(int i=0;i<len;i++)
				{
					if(ch[i]>1 && ch[i]<9 && ch[i]=='_' && ch[i]>'a' && ch[i]<'z' && ch[i]>'A' && ch[i]>'Z')
					{
						flag =true;

					}

					else
					{
						flag= false;
						break;
					}
				}
			}
			else
			{
				flag=false;
			}

		}

		else
		{
			flag=false;

		}



		if(flag==true)
		{
			System.out.println("true");
		}

		else
		{
			System.out.println("false");
		}




	}

}
