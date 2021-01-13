package StringClass;

public class ReplaceAlphabate {

	public static void main(String[] args) {
		int n=10;
		int sum =0;
		while(n<1)
		{
			for( char i='a';i<='z';i++)
			{
				sum =sum+1;
				System.out.println(sum+" = " +i);
			}
			n--;
		}


	}

}
