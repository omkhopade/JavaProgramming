package SDETProgram;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class LinearSearchInCollection {

	public static void main(String[] args) {
		int key;
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(32);
		set.add(98);
		set.add(57);
		set.add(25);
		set.add(10);
		System.out.println("Enter the key value");
		key=sc.nextInt();
		
		
		Iterator<Integer> it = set.iterator();
		 while( it.hasNext())
		 {
			 
			 
			 
			 if(key==(int)it.next())
			 {
				 System.out.println("Key is found in given tree set" );
				 break;
			 }
			 
			 else if(it.hasNext()==false)
			 {
				 System.out.println("Key is not found in the Tree Set");
			 }
			
			 
		 }
		 
		sc.close();
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
				
		
	}

}
