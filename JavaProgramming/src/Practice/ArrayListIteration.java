package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {

	public static void main(String[] args) {
		
		
		List<String> list= new ArrayList<String>();
		list.add("omkar");
		list.add("khopade");
		list.add("maruti");
		list.add("Suraj");
		
		System.out.println("\nFor Loop \n");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		System.out.println("\nAdvance for loop \n");
		for(String str :list)
		{
			System.out.println(str);
		}
		
		System.out.println("\nWhile loop \n");
		
		Iterator<String> it= list.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		

	}

}
