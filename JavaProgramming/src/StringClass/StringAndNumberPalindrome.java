package StringClass;

public class StringAndNumberPalindrome {

	static int result=0;
	static String temp="";
	
	public static int NumberPalindrom(int num)
	{
		while( num!=0)
		{
			int rem;
			 rem= num%10;
			 result=result*10+rem;
			 num= num/10;
		
		}
		
		return result;
	}
	
	public static String stringDemo(String str)
	{
		
		for(int i=str.length()-1;i>0;i--)
		{
			temp=temp+str.charAt(i);
		}
		
		return temp;
	}
	
	
	public static void main(String[] args) {
		
		int finalresult=NumberPalindrom(8785878);
		String finalstring=stringDemo("madam");
		if(finalstring.equals(temp));
		{
			System.out.println("Yes String ");
		}
		
		
		
		if(finalresult==8785878)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}

}
