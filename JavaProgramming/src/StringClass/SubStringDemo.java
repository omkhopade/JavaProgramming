package StringClass;

import java.util.Scanner;

public class SubStringDemo {

	public static void main(String[] args) {

		
		String s= new String(" Hello World");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String ");
		 s= sc.next();
		 
		s=s.substring(3,7);
		System.out.println(s);
		
		
	sc.close();
		
	}

}
 