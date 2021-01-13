package SDETProgram;

import java.util.Scanner;

public class AdditionOfMatrix {

	public static void main(String[] args) {


		int row , col;
		Scanner sc= new Scanner(System.in	);
		System.out.println("Enter the value of row and col");
		row= sc.nextInt();
		col= sc.nextInt();

		int matrixA [][]= new int[row][col];
		int matrixB [][]= new int[row][col];
		int sum[][]= new int [row][col];
		
		System.out.println("Enter the value into Matrix A");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrixA[i][j]= sc.nextInt();
			}
		}

		System.out.println("Enter the value into Matrix B");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				matrixB[i][j]= sc.nextInt();
			}
		}

		
		
		System.out.println("Printing valu of matrixA");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(matrixA[i][j]+" ");

			}
			System.out.println();
		}

		System.out.println("Printing valu of matrixB");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(matrixB[i][j]+" ");

			}
			System.out.println();
		}
		
		
		
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
					
				sum[i][j]=matrixA[i][j]+matrixB[i][j];
				
			}
			
		}

		System.out.println("Addition of two matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
					
				System.out.print(sum[i][j]+" ");
				
			}
			System.out.println();
			
		}
		
		sc.close();
	}

}
