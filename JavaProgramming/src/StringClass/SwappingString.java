package StringClass;

public class SwappingString {

	public static void main(String[] args) {

		String s1= "Good";
		String s2= "Morning";
		String s3= s1+s2;
		s2=s3.substring(0, s1.length());
		s1=s3.substring(s2.length());
		System.out.println(s1 + s2);
		
	}

}
