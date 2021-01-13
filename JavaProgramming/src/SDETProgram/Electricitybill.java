package SDETProgram;

import java.util.Scanner;

public class Electricitybill {

	public static void main(String[] args) {

		int dusage, musage, unit, sum=0;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the daily usage of the Consumer");
		dusage= sc.nextInt();
		musage=dusage*30;
		System.out.println("monthly usage of the consumer is --> "+ musage);
		System.out.println("Enter the unit rate of the electricity ");
		unit =sc.nextInt();
		
		sum=unit*musage;
		
		System.out.println("Electicity bill for this month is --> "+ sum);
	
		sc.close();
	}

}
