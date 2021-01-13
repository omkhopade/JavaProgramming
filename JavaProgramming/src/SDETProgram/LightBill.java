package SDETProgram;

import java.util.Scanner;

public class LightBill {

	public static void main(String[] args) {

		int unit, total=0, rate=7;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the unit consume by consumer");
		unit= sc.nextInt();
		if(unit<=100)
		{
			total= unit*rate;
			System.out.println("Total bill of electricity is --> "+ total);
			
		}
		else if(unit>=101) 
		{
			total=((unit-100)*10)+(100*7);
			System.out.println("Total bill of electricity is --> "+ total);
		}
		sc.close();
	}
		
}
