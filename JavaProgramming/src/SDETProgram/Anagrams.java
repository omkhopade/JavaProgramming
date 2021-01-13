package SDETProgram;

import java.util.Arrays;

public class Anagrams {

	
	public static boolean  isAnagram(String a, String b)
	{
		String copyA=a;
		String copyB=b;
	
		char[] s1=copyA.toLowerCase().toCharArray();
		char[] s2=copyB.toLowerCase().toCharArray();
		
		int a_length=s1.length;
		int b_length=s2.length;
		
		if(a_length!=b_length)
			return false;
		
		Arrays.sort(s1);
		Arrays.sort(s2);
		
		
		if(Arrays.equals(s1, s2)) {
			 
			System.out.println("Given "+a+" and "+b+" Strins are anagrams ");
			return true;
			 
		}
		
		else {
			
			System.out.println("Given "+a+" and "+b+" Strins are NOT anagrams ");
			return false;
			
		}
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		
		isAnagram("Mother In Law", "Hitler Woman");
		  
		isAnagram("keEp", "peeK");
		  
		isAnagram("SiLeNt CAT", "LisTen AcT");
		  
		isAnagram("Debit Card", "Bad Credit");
		  
		isAnagram("School MASTER", "The ClassROOM");
		  
		isAnagram("DORMITORY", "Dirty Room");
		  
		isAnagram("ASTRONOMERS", "NO MORE STARS");
		  
		isAnagram("Toss", "Shot");
		  
		isAnagram("joy", "enjoy");
		
	}

}
