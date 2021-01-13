package StringClass;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CharacterLocationInString {

	public static void main(String[] args) throws Exception {

		
		BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
		
		 String string = br.readLine();
		 string = string.toUpperCase();
		 int count=0;
		 for(int i=0;i<string.length();i++)
		 {
			 if(string.charAt(i)=='J')
			 {
				 System.out.println("Character found at "+ (i+1)+" location ");
				 count ++;
				 
			 }
			 
			 
			 
			 
			
		 }
		 System.out.println("Given char occure in the string is --> "+ count);
		 CharSequence ch =  string.subSequence(5, 16);
		 System.out.println("Char sequence of the given string is --> "+ ch);
		 
	}

}
