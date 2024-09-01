//B23CS1262
//Vedha Mahadevan
//Reverse of Number

import java.util.Scanner;

public class Reverse
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter number : ");
		
		int num1 = myObj.nextInt();
		int i,dig,rev=0,num2;
		num2=num1;
		while(num1>0)
		{
			dig=num1%10;
			rev=(rev*10)+dig;
			num1=num1/10;
		}
		System.out.print("Reverse of "+num2+" is "+rev);
	}
}
