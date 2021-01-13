package SDETProgram;

import java.util.Scanner;

public class MatrixPrint {

	public static void main(String[] args) {


		Scanner sc= new Scanner (System.in);

		int row=sc.nextInt();
		int col= sc.nextInt();
		int rowa[][]= new int[row][col];
	
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				rowa[i][j]=sc.nextInt();
			}
		}

		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{

				System.out.print(rowa[i][j]+" ");

			}
			
			System.out.println();
			
		}


	}
}