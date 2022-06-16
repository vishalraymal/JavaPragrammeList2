package com.programme;

public class TransposeMatrix {

	public static void main(String[] args) {
		int rows=2; int cols=3;
		int a[][]={{1,2,3},{4,3,2}};
		int transpose[][] = new int[cols][rows];	
		for(int i=0; i <=1; i++)
		{
			for(int j=0; j<=2; j++)
			{				
				transpose[j][i]=a[i][j];
			   
			}
		}
		for(int[] row : transpose)
		{
			for(int column : row)
			{
				System.out.print(column+"  ");
			}
			System.out.println();
		}
	}
	
	
	
	


}
