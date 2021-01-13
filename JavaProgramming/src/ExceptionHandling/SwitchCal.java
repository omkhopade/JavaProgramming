package ExceptionHandling;

import java.util.Scanner;

public class SwitchCal {
	

	public static void main(String[] args) {

		 int x,y,opt,z;
		 
		 Scanner sc= new Scanner (System.in);
		 
		 System.out.println("Enter your choice");
		 opt= sc.nextInt();
		 
		 
		 switch(opt)
		 {
		 case 1:
			  System.out.println(" Enter the value x and y ");
			  x= sc.nextInt();
			  y=sc.nextInt();
			   z= x+y;
			  System.out.println("Value of z is --> " + z) ;
					  
			  
		 case 2:
			 System.out.println(" Enter the value x and y ");
			  x= sc.nextInt();
			  y=sc.nextInt();
			   z= x-y;
			  System.out.println("Value of z is --> " + z) ;
			  
		 }
		 
		  
		 
		  
	}

}
