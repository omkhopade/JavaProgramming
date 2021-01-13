package SDETProgram;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {

		int num, fno=3,sno=5;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the range from 1 to ");
		num= sc.nextInt();
		//int var[] = new int [num];
		for(int i=1;i<=num;i++)
		{
			System.out.println(i);
		}
		
		for(int i=1;i<=num;i++)
		{
			if (i%fno==0&&i%sno==0)
			{
				System.out.println("Fizz buzz");
				
			}
			else if(i%fno==0)
			{
				System.out.println("fizz");
				
			}
			else if (i%sno==0)
			{
				System.out.println("buzz");
			}
			 
			
			else
			{
				System.out.println(i);
			}
			
		}
		 sc.close();
	}

}
