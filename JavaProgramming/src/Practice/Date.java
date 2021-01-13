package Practice;
import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) {


		
		System.out.println( new java.util.Date().toString());
		
		
		String date1 = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format( new java.util.Date());
		
		System.out.println(date1);
		
		

	}

}
