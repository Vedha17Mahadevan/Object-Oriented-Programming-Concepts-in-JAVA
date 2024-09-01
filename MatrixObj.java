//B23CS1262
//Vedha Mahadevan
//Matrix - Diagonal Elements , Sum of Diagonal elements & Transpose

import java.util.Scanner;

class Matrix{

	int matrix[][],transpose[][];
	int row,col,i,j,sum1=0,sum2=0;
	
	public void diagonal_elements(int matrix[][],int row,int col){
		System.out.println("Diagonal Elements : ");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				if(i==j){
					System.out.println(matrix[i][j]);
				}
			}
		}
		System.out.println("Anti-Diagonal Elements : ");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				if(j==(row-i-1)){
					System.out.println(matrix[i][j]);
				}
			}
		}
	}
	
	public void sum_diagonal_element(int matrix[][],int row,int col){
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				if(i==j){
					sum1+=matrix[i][j];
				}
			}
		}
		System.out.println("Sum of Diagonal Elements : "+sum1);
		
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				if(j==(row-i-1)){
					sum2+=matrix[i][j];
				}
			}
		}
		System.out.println("Sum of Anti-Diagonal Elements : "+sum2);
	}
	
	public void transpose_matrix(int matrix[][],int transpose[][],int row,int col){
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				transpose[j][i]=matrix[i][j];
			}
		}
		System.out.println("Transpose Matrix : ");
		for(i=0;i<col;i++){
			for(j=0;j<row;j++){
				System.out.print(transpose[i][j]+" ");
			}
			System.out.print("\n");
		}
	}
}

public class MatrixObj{
	public static void main (String args[]){
	
		Scanner obj = new Scanner(System.in);
		int i,j;
		
		System.out.print("Enter the no. of rows : ");
		int row = obj.nextInt();
		System.out.print("Enter the no. of columns : ");
		int col = obj.nextInt();
		
		int[][] matrix = new int [row][col];
		int[][] transpose = new int [col][row];
		
		if(row!=col){
			System.out.println("It is NOT a Square Matrix");
		}
		else{
			System.out.println("It is a Square Matrix");
		}
		
		System.out.println("Enter the elements of the matrix : ");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				System.out.print("Element ["+(i+1)+","+(j+1)+"] : ");
				matrix[i][j]=obj.nextInt();
			}
		}
		
		System.out.println("Matrix : ");
		for(i=0;i<row;i++){
			for(j=0;j<col;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		Matrix matrix_obj = new Matrix();
		
		if(row==col){
			matrix_obj.diagonal_elements(matrix,row,col);
			matrix_obj.sum_diagonal_element(matrix,row,col);
		}
		matrix_obj.transpose_matrix(matrix,transpose,row,col);
	}
}

/*OUTPUT

Enter the no. of rows : 3
Enter the no. of columns : 3
It is a Square Matrix
Enter the elements of the matrix : 
Element [1,1] : 1
Element [1,2] : 2
Element [1,3] : 3
Element [2,1] : 4
Element [2,2] : 5
Element [2,3] : 6
Element [3,1] : 7
Element [3,2] : 8
Element [3,3] : 9
Matrix : 
1 2 3 
4 5 6 
7 8 9 
Diagonal Elements : 
1
5
9
Anti-Diagonal Elements : 
3
5
7
Sum of Diagonal Elements : 15
Sum of Anti-Diagonal Elements : 15
Transpose Matrix : 
1 4 7 
2 5 8 
3 6 9 

Enter the no. of rows : 3
Enter the no. of columns : 2
It is NOT a Square Matrix
Enter the elements of the matrix : 
Element [1,1] : 1
Element [1,2] : 2
Element [2,1] : 3
Element [2,2] : 4
Element [3,1] : 5
Element [3,2] : 6
Matrix : 
1 2 
3 4 
5 6 
Transpose Matrix : 
1 3 5 
2 4 6 
*/
