package SDETProgram;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

	int num, digit=0 , rem;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number to Reverse");
	
	num = sc.nextInt();
	
	while(num!= 0)
	{
		rem = num%10;
		digit= digit*10+rem;
		num= num/10;
		
		
	}
	
	
	System.out.println("Revesre Number is --> "+ digit);
	
	sc.close();
	
	}

}
