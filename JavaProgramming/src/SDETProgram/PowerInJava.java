package SDETProgram;

import java.util.Scanner;

public class PowerInJava {

	public static void main(String[] args) {
		int sum=1;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter the number ");
		int num=sc.nextInt();
		System.out.println("Enter the power of the number ");
		int power=sc.nextInt();
		for(int i=1;i<=power;i++)
		{
			sum=sum*num;
		}
		
		System.out.println(num+"^"+power+" --> "+sum);
		sc.close();
		
		
		
	}

}
