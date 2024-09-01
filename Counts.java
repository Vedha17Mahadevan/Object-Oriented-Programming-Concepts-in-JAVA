//B23CS1262
//Vedha Mahadevan
//Frequency of a Character in a String

import java.util.Scanner;

public class Counts
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner (System.in);
	
		System.out.print("Enter the string : ");
		String input = obj.nextLine().toLowerCase();
	
		int[] frequency = new int[256];
			
		for(int i=0;i<input.length();i++)
		{
			char c= input.charAt(i);
			frequency[c]++;
		}
			
		for(int i=0 ; i<frequency.length ; i++)
		{
			if (frequency[i]>0)
			{
				System.out.println((char)i+" : "+frequency[i]);
			}
		}
	}
}

/*OUTPUT
Enter the string : She sells Sea shells on the Sea shore
  : 7
a : 2
e : 7
h : 4
l : 4
n : 1
o : 2
r : 1
s : 8
t : 1
*/
