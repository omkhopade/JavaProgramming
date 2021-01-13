package SDETProgram;

public class ConvertArrayToString {

	public static void main(String[] args) {

		char arr[] = {'a','b','c','d'};
		String string="";
		for(int i=0;i<arr.length;i++)
		{
			string= string+arr[i];
		}

		System.out.println("Converted String is --> "+ string);
		
		
		String s= new String(arr);
		System.out.println("Char to String is --> "+ s);
	}

}
