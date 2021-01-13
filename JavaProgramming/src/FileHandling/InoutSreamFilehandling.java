package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;

public class InoutSreamFilehandling {

	
	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(".\\Filehandling\\file1.docx");
		
		long lenght= file.available();
		
		for(long i=0;i<lenght;i++)
		{
			System.out.println((char)file.read());
		}

		file.close();
	}
}
