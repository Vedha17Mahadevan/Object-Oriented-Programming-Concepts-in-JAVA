//B23CS1262
//Vedha Mahadevan
//Check even or odd

import java.util.Scanner;

class EvenOdd
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter a number : ");
		
		//numerical input
		int num = myObj.nextInt();
		
		if(num<0)
		{
			System.out.println("Invalid Entry");
		}
		else if(num==0)
		{
			System.out.println(num+" is neither EVEN nor ODD.");
		}
		else
		{
			if(num%2==0)
			{
				System.out.println(num+" is EVEN.");
			}
			else
			{
				System.out.println(num+" is ODD.");
			}
		}
	}
}

/*OUTPUT
Enter a number : 
0
0 is neither EVEN nor ODD.
Enter a number : 
2
2 is EVEN.
Enter a number : 
7
7 is ODD.
Enter a number : 
-6
Invalid Entry
*/
