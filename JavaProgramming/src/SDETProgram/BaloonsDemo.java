package SDETProgram;

import java.util.Scanner;

public class BaloonsDemo {

	public static void main(String[] args) {

		int num,b1,b2;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the turn of the game ");
		num= sc.nextInt();
		
		for(int i=0;i<num;i++)
		{
			
			int f1=0,f2=0;
			b1=sc.nextInt();
			b2=sc.nextInt();
			int sum=0;
			int sum1=0;
			
			System.out.println("Enter the participant number ");
			int t= sc .nextInt();
			for(int j=0;j<t;j++)
			{
				
				int n1=sc.nextInt();
				int n2=sc.nextInt();
				
				if(n1==1)
				{
					f1++;
				}
				
				if(n2==1)
				{
					f2++;
				}
				
			}
			
			sum=(b1*f1)+(b2*f2);
			sum1=(b2*f1)+(b1*f2);
			
			if(sum>sum1)
			{
				System.out.println("Lowest price is --> "+ sum1);
			}
			else
				System.out.println("Lowest price is --> "+sum1);
			
	
			
		
			
			
			
			
		}
		
		sc.close();
	}
	
}
