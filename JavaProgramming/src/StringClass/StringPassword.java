package StringClass;

public class StringPassword {

	public static void main(String[] args) {
		
		int keys =4;
		
		char ch='w';
		
		char chs='Z';
		int temp;
		temp=(int) ch+keys;
		
		if(temp>122)
		{
			temp=temp-26;
		}
		
		System.out.println((char)temp);
		 int x=(int) chs+keys;
		
		 if(x>90)
		 {
			 x=x-26;
			 
		 }
		System.out.println((char)x);
	
		
		

	}

}
