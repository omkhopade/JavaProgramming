package StringClass;

public class RegionMatches {

	public static void main(String[] args) {
		
		String  string1 = "OMKAR KHOPADE";
		String  string2 = "omkar khopade";
		
		System.out.println(string1.regionMatches(true, 0, string2, 0, 13));

	}

}
