package StringClass;

import java.util.Scanner;

public class LexcographicalOrder {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		String string= sc.next();
		int k= sc.nextInt();
		String minsub= string.substring(0, k);
		String maxSub= string.substring(0, k);
		
		
		for( int i=0;i<string.length()-k+1;i++)
		{
			String sub= string.substring(i,i+k);

			if(sub.compareTo(minsub)<0)
			{
				minsub=sub;
			}
					
			if(sub.compareTo(maxSub)>0)
			{
				maxSub= sub;
			}
		}
		
		
		System.out.println(minsub);
		System.out.println(maxSub);
	}

}
