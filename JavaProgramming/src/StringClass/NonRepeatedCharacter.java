package StringClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonRepeatedCharacter {

	public static void main(String[] args) {

		 Scanner sc= new Scanner(System.in);
		 String str= sc.next();
		char ch[]= str.toCharArray();

		List<Character> list= new ArrayList<Character>();
		
		boolean flag=false;
		 for(int i=0;i< ch.length;i++)
		 {
			
			char chs = ch[i];
			
			if( list.contains(chs))
				continue;
			for(int j=i+1;j<ch.length;j++) {
				
				if(chs==ch[j])
				{
					list.add(chs);
					
					break;
					
				}
				else if( j == ch.length-1)
				{
					System.out.println(chs);
					flag=true;
					break;
				}
			}
				
			 
		 }
		 
		
		 
				 
		 
		 
		 sc.close();
	}

}
