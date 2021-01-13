package SDETProgram;

import java.util.Scanner;

public class NumbersPalandrome {

	public static void main(String[] args) {

	int num, temp , re, digit=0;
		
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter the number for palndrome");
	
	num= sc.nextInt();
	
	System.out.println("The number is--> "+ num);
	
	temp=num;
	
	while(num!=0)
	{
		
	re = num%10;
	digit=digit*10+re;
	num=num/10;
	
	}
	
	System.out.println("After reverse the number is --> "+ digit);
	 if( temp==digit)
	 {
		 System.out.println("Given number is palandrome"); 
	 }
	 else
	 {
		 System.out.println("Given number is not palandrome");
	 }
	
		
	}

}
