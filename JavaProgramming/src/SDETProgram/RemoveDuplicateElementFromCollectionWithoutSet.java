package SDETProgram;

import java.util.ArrayList;

public class RemoveDuplicateElementFromCollectionWithoutSet {

	public static void main(String[] args) {

		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(5);
		list.add(7);
		list.add(6);
		list.add(9);
		
		System.out.println(list.toString());
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size()-1;j++)
				
			{
				if(list.get(j).equals(list.get(i)))
				{
					list.remove(list.get(j));
				}
				
				
			}
		}
		
		
		System.out.println(list.toString());
		
	}

}
