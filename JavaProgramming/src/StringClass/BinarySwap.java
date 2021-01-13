package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySwap {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String a = br.readLine();
		String b= br.readLine();
		
		int ac=0, bc=0;
		
		if(a.length()==b.length())
		{
			for(int i=0;i<a.length();i++)
			{
				
				if(a.charAt(i)=='0')
				{
					ac++;
					
				}
				if(b.charAt(i)=='0')
				{
					bc++;
				}
			
			}
			
			if(ac!=bc)
			{
				System.out.println("-1");
			}
			
			else {
				int count=0;
				for(int j=0;j<a.length();j++)
				{
					
					if(a.charAt(j)!=b.charAt(j))
					{
						count++;
					}
					
				}
				
				System.out.println(count/2);
				
			}
		}

	}

}
