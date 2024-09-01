//B23CS1262
//Vedha Mahadevan
//Largest element in Array

import java.util.Scanner;

public class Largest
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		int[] arr = new int[100];
		
		System.out.print("Enter length of array : ");
		int l = obj.nextInt();
		
		System.out.print("Enter elements of array : ");
		for(int i=0;i<l;i++)
		{
			arr[i]=obj.nextInt();
		}
		
		System.out.print("Array : ");
		for(int i=0;i<l;i++)
		{
			System.out.print(arr[i]+" ");
		}	
		System.out.print("\n");
		
		int max_value = 0;
		for(int i=0;i<l;i++)
		{
			if(arr[i]>max_value)
			{
				max_value=arr[i];
			}
		}
		
		System.out.println("The largest element in the Array is : "+max_value);
	}
}

/*OUTPUT
Enter length of array : 5
Enter elements of array : 9
7
4
5
2
Array : 9 7 4 5 2 
The largest element in the Array is : 9
*/
