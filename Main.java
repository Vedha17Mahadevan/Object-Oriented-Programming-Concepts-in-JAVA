//B23CS1262
//Vedha Mahadevan
//Print Name , Age & Salary

import java.util.Scanner;

class Main
{
	public static void main (String[] args)
	{
		Scanner myObj = new Scanner (System.in);
		System.out.println("Enter your name , age and Salary :");
		
		//String input
		String name = myObj.nextLine();
		//Numerical input
		int age = myObj.nextInt();
		double salary = myObj.nextDouble();
		
		//Output input by user
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
		System.out.println("Salary : "+salary);
		System.out.println("Salary of "+name+"(age:"+age+") is Rs."+salary);
	}
}

/*OUTPUT
Enter your name , age and Salary :
BOB
28
50000
Name : BOB
Age : 28
Salary : 50000.0
Salary of BOB(age:28) is Rs.50000.0
*/
