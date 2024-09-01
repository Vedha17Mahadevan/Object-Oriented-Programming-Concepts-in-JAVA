//B23CS1262
//Vedha Mahadevan
//Fibonacci Series

import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter limit : ");
		
		int limit = myObj.nextInt();
		
		int a=0,b=1,next,i;
		
		if(limit<=0)
		{
			System.out.println("Invalid Limit!");
		}
		else
		{
			if (limit==1)
			{
				System.out.println(a);
			}
			else if(limit==2)
			{
				System.out.println(a+" "+b);
			}
			else
			{
				System.out.println(a+""+b);
				for(i=2;i<limit;i++)
				{
					next=a+b;
					System.out.print(next);
					a=b;
					b=next;
				}
			}
		}
	}
}

/*OUTPUT
Enter limit : 0
Invalid Limit!
Enter limit : -1
Invalid Limit!
Enter limit : 3
0
1
1
*/

