package SDETProgram;

import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {

		 Scanner sc = new Scanner (System.in);
		 int num ;
		 long fact=1;
		 
		 System.out.println("Enter the number to find the factorial");
		 num= sc.nextInt();
		 int temp=num;
		 
		 if(num<0)
		 {
			 System.out.println("Can't find the factorial of negative number");
			 
			 
		 }
		 if(num==1)
		 {
			 System.out.println("factorial of 1 is 1");
		 }
		 else
		 {
		 while(num!=0)
		 {
			 fact= fact*num;
			 num--;
		 }
		 
		 System.out.println("Factorial of " +temp+ " is "+ fact);
		 }
		 
		 sc.close();
	}

}
