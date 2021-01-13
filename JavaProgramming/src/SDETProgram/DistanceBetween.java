package SDETProgram;

import java.util.Scanner;

public class DistanceBetween {

	public static void main(String[] args) {		
		
		int x1,y1,x2,y2;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of two points ");
		x1=sc.nextInt();
		y1=sc.nextInt();
		x2=sc.nextInt();
		y2=sc.nextInt();
		
		double dis= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
		System.out.println("("+x1+","+x2+")"+","+"("+y1+","+y2+")"+" --> "+ dis);
		sc.close();

	}

}
