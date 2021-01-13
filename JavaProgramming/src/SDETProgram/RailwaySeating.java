package SDETProgram;

import java.util.Scanner;

public class RailwaySeating {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		
		
		System.out.println("Enter seat number ");
		int seat=sc.nextInt();
		 int arr[]= new int [seat];
		 int count=11;
		for(int i=0;i<arr.length;i++)
			
		{
			arr[i]=sc.nextInt();
			
			if(arr[i]%6==1 || arr[i]%6==0)
			{
				
				System.out.println(arr[i]+ count +"  WS");
				
			}
			
			if(arr[i]%6==2 || arr[i]%6==5 )
			{
				System.out.println((arr[i]+count)-2+ "  MS");
			}
			
			if( arr[i]%6==4 || arr[i]%6==3)
			{
				System.out.println((arr[i]+count)-4 +"  AS");
			}
		}
	
		sc.close();
		
	}

}
