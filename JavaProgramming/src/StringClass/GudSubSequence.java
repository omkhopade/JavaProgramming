package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GudSubSequence {

	public static void main(String[] args) throws NumberFormatException, IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num= Integer.parseInt(br.readLine());

		for(int i=0;i<num;i++)
		{

			

			String str=br.readLine();
			int arr[]= new int[150];

			for(int j=0;j<str.length();j++)
			{
				char ch= str.charAt(j);
				arr[(int)ch]++;

			}
			long sum=1;
			for(int j=95;j<150;j++)
			{
				
				if(arr[j]!=0)
				{
					sum=((sum%1000000007)*(arr[j]%1000000007))%1000000007;
				}
			
			}
			System.out.println(sum);
		}
		
		
		

	}

}
