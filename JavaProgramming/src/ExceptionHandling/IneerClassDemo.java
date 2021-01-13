package ExceptionHandling;

import java.util.ArrayList;
import java.util.Iterator;

public class IneerClassDemo {

	
	
		 public static void main(String[] args) {
			
			ArrayList<Integer> list= new ArrayList<Integer>();
			list.add(50);
			list.add(25);
			list.add(65);
		
			Iterator<Integer> iter= list.iterator();
			
			
			while(iter.hasNext())
			{
				
				iter.remove();
				
			}
			
		
	}
}
