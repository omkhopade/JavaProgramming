package Practice;

import java.util.Scanner;

public class SwapNumberwithoutThird {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("value of x is --> "+x+ " \nValue of y is --> "+ y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println();
		System.out.println("value of x is --> "+x+ " \nValue of y is --> "+ y);
		
		sc.close();
	}

}
