//B23CS1262
//Vedha Mahadevan
//Matrix Multiplication

import java.util.Scanner;

public class MatrixMultiplication
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		System.out.print("Enter no. of rows for Matrix A : ");
		int r1 = obj.nextInt();
		System.out.print("Enter no. of columns for Matrix A : ");
		int c1 = obj.nextInt();
		System.out.print("Enter no. of rows for Matrix B : ");
		int r2 = obj.nextInt();
		System.out.print("Enter no. of columns for Matrix B : ");
		int c2 = obj.nextInt();
		
		if(c1!=r2)
		{
			System.out.println("Matrix Multiplication NOT possible");
		}
		else
		{
			int[][] MatrixA = new int [10][10];
			int[][] MatrixB = new int [10][10];
			int[][] Product = new int [10][10];
			
			System.out.print("Enter elements of Matrix A : ");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					MatrixA[i][j]=obj.nextInt();
				}
			}
			System.out.print("Matrix A : \n");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					System.out.print(MatrixA[i][j]+" ");
				}
				System.out.print("\n");
			}
			
			System.out.print("Enter elements of Matrix B : ");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					MatrixB[i][j]=obj.nextInt();
				}
			}
			System.out.print("Matrix B : \n");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.print(MatrixB[i][j]+" ");
				}
				System.out.print("\n");
			}
			
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					Product[i][j]=0;
					for(int k=0;k<c1;k++)
					{
						Product[i][j]+=MatrixA[i][k]*MatrixB[k][j];
					}
				}
			}
			
			System.out.println("Product Matrix : ");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					System.out.print(Product[i][j]+" ");
				}
				System.out.print("\n");
			}
		}
	}
}

/*OUTPUT
Enter no. of rows for Matrix A : 2
Enter no. of columns for Matrix A : 2
Enter no. of rows for Matrix B : 2
Enter no. of columns for Matrix B : 2
Enter elements of Matrix A : 1
2
3
4
Matrix A : 
1 2 
3 4 
Enter elements of Matrix B : 1
2
3
4
Matrix B : 
1 2 
3 4 
Product Matrix : 
7 10 
15 22 
*/
