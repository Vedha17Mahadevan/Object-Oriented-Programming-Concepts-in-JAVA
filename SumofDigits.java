//B23CS1262
//Vedha Mahadevan
//Sum of Digits

import java.util.Scanner;

public class SumofDigits
{
	public static void main(String[] args)
	{
		Scanner myObj = new Scanner(System.in);
		System.out.print("Enter number : ");
		
		int num1 = myObj.nextInt();
		
		int i,dig,s=0,num2;
		num2=num1;
		while(num1>0)
		{
			dig=num1%10;
			s+=dig;
			num1=num1/10;
		}
		System.out.print("Sum of Digits of "+num2+" is "+s);
	}
}
