package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {

	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str= br.readLine();
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		
		
		for(Character ch : set)
		{
			System.out.print(ch);
		}
	}

}
