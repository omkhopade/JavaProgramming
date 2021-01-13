package FileHandling;

import java.io.File;

public class FileHandling {

	public static void main(String[] args) {

		File file= new File(".\\FileHandling");
		
		String file_name =file.getName();
		System.out.println(file_name);
		
		long length= file.length();
		System.out.println("Lenght of the file is --> "+ length);
		
		String path= file.getPath();
		System.out.println("path of the file is --> "+ path);
		
		String APath = file.getAbsolutePath();
		System.out.println("Absolute path of the file is --> "+ APath);
		
		String[] list = file.list();
		
		for(int i=0;i<list.length;i++)
		{ 
			System.out.println(list[i]);
		}
		
	}
	
}
