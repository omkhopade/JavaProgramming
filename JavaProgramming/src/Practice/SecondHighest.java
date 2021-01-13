package Practice;


import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int large=0 , sec=0;
		int num= sc.nextInt();
		int arr[] = new int[num];
		
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				sec=large;
				large=arr[i];
				
			}
			
			else if(arr[i]>sec)
			{
				sec=arr[i];
			}
		}
		
		System.out.println(sec);
		
		
	}

}
