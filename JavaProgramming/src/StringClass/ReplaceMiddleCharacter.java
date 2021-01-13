package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReplaceMiddleCharacter {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		List<Character> list= new ArrayList<Character>();
		String rev="";

		for(int i=0 ;i<str.length();i++) 
		{ 
			char ch= str.charAt(i); list.add(ch); 

		}



		for(int i=0;i<list.size();i++)
		{
			rev= rev+list.get(list.size()/2);
			list.remove(list.size()/2);

		}

		System.out.println(rev);
		System.out.println(list.toString());
	}

}
