//B23CS1262
//Vedha Mahadevan
//Read Elements Using Command Line Argument and display Plaindrome

public class CommandLinePalindrome {
	public static void main (String args[]) {
	
		int i,j,rev=0;
		int num=0,dig;
		int[] a = new int [args.length];
		
		for(i=0;i<args.length;i++) {
			a[i]=Integer.parseInt(args[i]);
			num=a[i];
			System.out.println("Entered number : "+a[i]);
		}	
		
		//palindrome
		for(i=0;i<args.length;i++){
			while(a[i]>0){
				dig=a[i]%10;
				rev=(rev*10)+dig;
				a[i]=a[i]/10;
			}
		}
		
		System.out.println("Reverse : "+rev);
		
		for(i=0;i<args.length;i++){
			if(num==rev){
				System.out.println("It is a Palindrome");
			}
			else{
			System.out.println("It is NOT a Palindrome");
			}
		}
	}
}

/*OUTPUT

java CommandLinePalindrome 121
Entered number : 121
Reverse : 121
It is a Palindrome

Entered number : 123
Reverse : 321
It is NOT a Palindrome
*/
