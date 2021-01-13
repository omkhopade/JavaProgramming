package StringClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stringcount {

	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String str= br.readLine();
		String str1[]= str.split(" ");
		List<String> list= new ArrayList<String>();

		for (int i=0;i<str1.length;i++)
		{
			list.add(str1[i]);
		}

		for(String word :list)
		{
			int fre=Collections.frequency(list, word);
			System.out.println(word +" occures "+fre +" times");
		}
	}
}
