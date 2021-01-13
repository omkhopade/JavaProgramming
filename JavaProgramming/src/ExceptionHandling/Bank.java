package ExceptionHandling;

import java.util.Scanner;

public class Bank {

	
	 public String name;
	 public String surname;
	 public int accountnumber;
	 public int branch;
	 public String location;
	 
	 Scanner sc = new Scanner(System.in);
	 
	 
	 public  void customersDetails()
	 {
		System.out.println("Enter the details of the customers");
		name = sc.next();
		surname = sc.next();
		accountnumber= sc.nextInt();
		branch = sc.nextInt();
		location= sc.next();
		
		
		System.out.println("Customer details are as follows : \nname= " +name +"\nsurname=  "+ surname+ "\naccount number = "+accountnumber+"\nbranch = " + branch+"\nlocation ="+ location);
		
	 }
	 
	 public static void main(String[] args) {

		 
		 Bank bank= new Bank() ;
		 bank.customersDetails();
	}

}
