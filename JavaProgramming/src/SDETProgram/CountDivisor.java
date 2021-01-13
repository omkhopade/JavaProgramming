package SDETProgram;

import java.util.Scanner;

public class CountDivisor {

	public static void main(String[] args) {

		
		int l,r,k,x,count=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of L,R,K");
		l=sc.nextInt();
		r=sc.nextInt();
		k=sc.nextInt();
		if(l<r)
		{
			for(int i=l;i<=r;i++)
			{
				x=i%k;
				if(x==0)
				{
					count ++;
				}
			}
		}
		else
		{
			System.out.println("l value must be equal ot greater than r");
		}
		
		System.out.println(count);
		sc.close();
	}

}
