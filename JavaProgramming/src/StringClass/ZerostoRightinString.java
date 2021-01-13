package StringClass;

public class ZerostoRightinString {

	public static void main(String[] args) {
		
		String str= "omk00kar00ma0a0r0u0ti00";
		char strarr[]= str.toCharArray();
		int count=0;
		
		for(int i=0;i<strarr.length;i++)
		{
			if(strarr[i]!='0')
			{
				strarr[count++]=strarr[i];
			}
			
		}
		
		while(count<strarr.length)
		{
			strarr[count++]='0';
		}
	
		for(char c: strarr)
		{
			System.out.print(c);
		}
	}

}
