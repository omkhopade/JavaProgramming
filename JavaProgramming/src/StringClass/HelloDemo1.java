package StringClass;

import java.util.Scanner;

public class HelloDemo1 {

	public static void main(String[] args) {

		  String s;
		  Scanner sc =new Scanner(System.in);
		  System.out.println("Enter String ");
		  s= sc.next();
		  
		  System.out.println("lenght of the String is --> " +s.length() );
		  
		  sc.close();
		  
		  System.out.println("Char at given location is --> "+s.charAt(7));
		  
		  
		  String x= "Omkar khopade";
		  String z=s.concat(x);
		  
		  System.out.println("value of z string is--> "+z.toString() );
		  
		  String d= new String("Omkar maruti Khopade");
		  System.out.println(d.toString());
		  
	} 

}
