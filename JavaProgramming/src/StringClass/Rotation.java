package StringClass;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {

		  Scanner sc=new Scanner(System.in);
	        
	        String s1=sc.next();
	        String s2=sc.next();
	        String sub= s1.substring(0,2);
	        int total = s2.indexOf(sub);
	        System.out.println(total);
	        
	        
	        
	}

}
