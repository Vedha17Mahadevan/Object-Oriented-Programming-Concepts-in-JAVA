//B23CS1262
//Vedha Mahadevan
//Frequency of a Character in a String

import java.util.Scanner;

public class Count
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner (System.in);
		
		System.out.print("Enter the string : ");
		String input = obj.nextLine().toLowerCase();
		
		System.out.print("Enter the character : ");
		char ch = obj.next().charAt(0);
		
		int count=0;

		for (int i=0;i<input.length();i++)
		{
			if(input.charAt(i) == ch)
			{
				count++;
			}
		}
		
		System.out.println("The count of "+ch+" in "+input+" is : " + count);
	}
}

/*OUTPUT
Enter the string : Hello World
Enter the character : l
The count of l in Hello World is : 3
*/
