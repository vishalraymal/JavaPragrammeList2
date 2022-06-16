package com.programme;

public class addTwoMatrix {
	public static void main(String[] args) 
	{
		int rows=2; int cols=3;
		int a[][]={{1,2,3},{4,3,2}};
		int b[][]={{2,3,1},{3,8,6}};
		int sum[][] = new int[rows][cols];
		for(int i=0; i <=1; i++)
		{
			for(int j=0; j<=2; j++)
			{				
				sum[i][j]=a[i][j]+b[i][j];
			   
			}
		}
		for(int[] row : sum)
		{
			for(int column : row)
			{
				System.out.print(column+"  ");
			}
			System.out.println();
		}
		
		
		
	}
}
