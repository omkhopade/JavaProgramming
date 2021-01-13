package SDETProgram;

import java.util.Scanner;

public class FaceBookPicture {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner (System.in);
		int L;
		System.out.println("Enter the value of the Lenght ");
		L= sc.nextInt();
		
		System.out.println("Enter the number of photos that user want to enter");
		int num= sc.nextInt();
		
		System.out.println("Enter the value of width and height");
		
		int H[] = new int[num];
		int W[]= new int [num];
		
		for(int i=0;i<num;i++)
		{
			
		 H[i] =sc.nextInt();
		 W[i]=sc.nextInt();
		
		}
		
		for(int i=0;i<num;i++)
		{
		
		if(H[i]<L || W[i]<L )
		{
			System.out.println("Upload Another ");
			
		}
		
		
		else if(H[i]==W[i])
		{
			System.out.println("Accepted");
		}
		
		
		else
		{
			System.out.println("Crop it");
		}
		
		
		}
	}

}
