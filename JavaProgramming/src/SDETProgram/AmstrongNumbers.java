package SDETProgram;

import java.util.Scanner;

public class AmstrongNumbers {

	public static void main(String[] args) {

		
		 int rem,temp,digit=0,num;
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the number to check");
		 num= sc.nextInt();
		 System.out.println("Given Number is --> "+ num);
		 temp=num;
		 while(num!=0)
		 {
			 rem = num%10;
			 digit=digit+(rem*rem*rem);
			 num=num/10;
			 
		 }
		 
		 
		 if( digit==temp)
		 {
			 System.out.println("Given Number is Amstrong ");
		 }
		  
		 else
		 {
			 System.out.println("Given number is is not Amstrong ");
		 }
		 
		 
		 sc.close();
	}

}
