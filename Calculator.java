//B23CS1262
//Vedha Mahadevan
//Print "Calculator"

public class Calculator
{
	//main method declaration
	public static void main(String[] args)
	{
		int a=20,b=10,sum,diff,product,remainder,quotient;
		sum=a+b;
		diff=b-a;
		product=a*b;
		remainder=a%b;
		quotient=a/b;
		System.out.println("Sum a+b : "+sum);
		System.out.println("Difference b-a : "+diff);
		System.out.println("Product a*b : "+product);
		System.out.println("Quotient a/b : "+quotient);
		System.out.println("Remainder a%b : "+remainder);
	}
} 

/*OUTPUT
Sum a+b : 30
Difference b-a : -10
Product a*b : 200
Quotient a/b : 2
Remainder a%b : 0
*/
