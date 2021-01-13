package ExceptionHandling;

import java.util.Scanner;

public class Customers extends Bank{

	public int bal=0;
	public int  amount;
	public int withdraw;
	
	 
	Scanner sc = new Scanner(System.in);
	
	
	
	public void addAmount()
	
	{
		System.out.println("initial balance of account is --> "+ bal);
		System.out.println("Enter amount to deposite");
		amount=sc.nextInt();
		bal= bal+amount;
		System.out.println("After addding amount to the bank bal is --> "+ bal);
		System.out.println("Enter the amount to be debited from account ");
		withdraw= sc.nextInt();
		bal= bal-withdraw;
		System.out.println("Updated balance is --> "+ bal );
	}
	
	public static void main(String[] args)   {

		 Customers custo= new Customers() ;
		 
		 custo.customersDetails();
		 custo.addAmount();
		 try {
			custo.finalize();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 System.out.println(Runtime.getRuntime());
		
	}

}
