//B23CS1262
//Vedha Mahadevan
//Inheritance

import java.util.*;

abstract class Shape{
	public abstract void numberofSides();
}

class Triangle extends Shape{
	public void numberofSides(){
		System.out.println("Number of sides in a TRIANGLE : 3");
	}
}

class Rectangle extends Shape{
	public void numberofSides(){
		System.out.println("Number of sides in a RECTANGLE : 4");
	}
}

class Hexagon extends Shape{
	public void numberofSides(){
		System.out.println("Number of sides in a HEXAGON : 6");
	}
}

public class Abstraction_Polymorphism{
	public static void main(String args[]){
		Triangle tri = new Triangle();
		tri.numberofSides();
		Rectangle rect = new Rectangle();
		rect.numberofSides();
		Hexagon hex = new Hexagon();
		hex.numberofSides();
	}
}

/* OUTPUT

Number of sides in a TRIANGLE : 3
Number of sides in a RECTANGLE : 4
Number of sides in a HEXAGON : 6

*/
