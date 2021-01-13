package SDETProgram;

import java.util.Arrays;
import java.util.Scanner;

public class DivisibleBy11 {

	public static void main(String[] args) {

		int num;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the size of the array");
		num= sc.nextInt();
		int arr[] = new int[num];

		for(int i=0;i<num;i++)
		{
			arr[i]= sc.nextInt();

		}

		int len= arr.length;
		int first[] = new int [len/2];
		int last[] = new int[len-first.length];

		for(int i=0;i<len;i++)
		{
			if(i<first.length)
			{
				first[i]=arr[i];
			}
			else
			{
				last[i-last.length]=arr[i];
			}
		}


		System.out.println(Arrays.toString(first));
		System.out.println(Arrays.toString(last));
		int firstvalue[] = new int[len/2];
		int lastvalue[] = new int [len/2];
		for(int i=0;i<first.length;i++)
		{
			while(first[i]>=10)
			{
				first[i]=first[i]/10;
			}
			
			firstvalue[i]= first[i];

		}


		for(int i=0;i<last.length;i++)
		{
			lastvalue[i]=last[i]%10;

		}
		System.out.println(Arrays.toString(firstvalue));
		System.out.println(Arrays.toString(lastvalue));

		
		int flen = firstvalue.length;
		int llen = lastvalue.length;
		int [] array = new int [flen+llen];
		
		System.arraycopy(firstvalue, 0, array, 0, flen);
		System.arraycopy(lastvalue, 0, array, flen, llen);

		System.out.println(Arrays.toString(array));

		int result=0;
		for(int i=0 ;i<array.length;i++)
		{
			result=result*10;
			result= result+array[i];
			
		}
		System.out.println("Intger value is --> "+result);
		if(result%11==0)
		{
			System.out.println("OUI");
			
		}
		else
		{
			System.out.println("NO");
		}
		
		sc.close();
	}

}
