package SDETProgram;

import java.util.Scanner;

public class WorkDuration {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		int  num;
		System.out.println("Enter the starting and ending min");
		num=sc.nextInt();
		
		int SH[]= new int[num];
		int SM[] = new int [num];
		int EH[]= new int[num];
		int EM[]= new int [num];
		int TH[]= new int[num];
		int TM[]= new int[num];
		int TSH[]= new int[num];
		int TEH[]= new int[num];
		int div[]= new int[num];
		int rem[]= new int[num];
		int total[]= new int[num] ;
		
		
		for(int i=0;i<num;i++)
		{
		SH[i]=sc.nextInt();
		SM[i]=sc.nextInt();
		EH[i]=sc.nextInt();
		EM[i]=sc.nextInt();
		}
		
		for(int i=0;i<num;i++)
		{
			TSH[i]=(SH[i]*60)+SM[i];
			TEH[i]=(EH[i]*60)+EM[i];
			total[i]=TEH[i]-TSH[i];
			div[i]=total[i]/60;
			rem[i]= total[i]%60;
			TH[i]=div[i];
			TM[i]= rem[i];
			
			System.out.println(TH[i]+" "+ TM[i]);
		}
		
		sc.close();
	}

}
