package SDETProgram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BalancedString {

	public static void main(String[] args) throws NumberFormatException, IOException {

		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int num=Integer.parseInt(br.readLine());
		for( int i=0;i<num;i++)
		{
			String str[]= new String[num];
			str[i]=br.readLine();
			int c=0,d=0,e=0,f=0,g=0,h=0,s=0;
			for( int j=0;j<str[i].length();j++)
			{
				
				char ch=str[i].charAt(j);
				if(ch=='{')
					c++;
				if(ch=='}')
					d++;
				if(ch=='(')
					e++;
				if(ch==')')
					f++;
				if(ch=='[')
					g++;
				if(ch==']')
					h++;
					
			}
			
			if(c!=0 && d!=0)
			{
				if(c<=d)
				{
					s=s+c;
					
				}
			}
			if(e!=0 && f!=0)
			{
				if(e<=f)
				{
					s=s+e;
					
				}
			}
			if(g!=0 && h!=0)
			{
				if(g<=h)
				{
					s=s+g;
					
				}
			}
			
			
			System.out.println(2*s);
			
		}
		
		
		
	}

}
