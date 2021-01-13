package SDETProgram;

import java.util.Scanner;

public class LiftQueries {

	public static void main(String[] args) {

		int  num, A=0,B=7, Adiff, Bdiff;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of floor");
		num= sc.nextInt();
		
		while(num>0)
		{
			int floor=sc.nextInt();
			Adiff=floor-A;
			Bdiff=B-floor;
			if((Adiff-Bdiff)==0)
			{
				System.out.println("A");
			}
			else if(Adiff<Bdiff)
			{
				A=floor;
				System.out.println("A");
				
			}
			else 
			{
				System.out.println("B");
			}
			num--;
		}
		sc.close();
	}

}
