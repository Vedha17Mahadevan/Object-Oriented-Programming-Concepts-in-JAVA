//B23CS1262
//Vedha Mahadevan
//Read Elements Using Command Line Argument & Display Sum

public class CommandLine {
	public static void main (String args[]) {
	
		int i,sum=0;
		int[] a = new int [args.length];
		
		System.out.println("Array : ");
		for(i=0;i<args.length;i++) {
			a[i]=Integer.parseInt(args[i]);
			System.out.println(a[i]+" ");
			sum+=a[i];
		}	
		System.out.println("Sum of Array : "+sum);
		
	}
}

/*OUTPUT

java CommandLine 10 20 30 40
Array : 
10 
20 
30 
40 
Sum of Array : 100

*/
