import java.lang.*;
import java.util.*;

interface Shape{
	
	void printDetails();
	
	void calArea();
	
}

class Rectangle implements Shape{
	
	int length;
	int breadth;
	
	Rectangle(){
		
		
	}
	
	Rectangle(int length, int breadth){
		
		this.length = length;
		this.breadth = breadth;
		
	}
	

	public void printDetails(){
		
		System.out.println("Length of the rectangle is : "+length);
		System.out.println("Breadth of the rectangle is : "+breadth);
		
	}
	
	public void calArea(){
		
		int areaR = length * breadth;
		System.out.println("Area of the rectangle is : "+areaR);
		
	}
		
}

class Circle implements Shape{
	
	double radius;
	
	Circle(){
		
		
	}
	
	Circle(double radius){
		
		this.radius = radius;
	}
	
	public void printDetails(){
		
		System.out.println("Radius of the circle is : "+radius);
		
	}
	
	public void calArea(){
		
		double areaC = (double)2*3.14*radius;
		System.out.println("Area of the circle is : "+areaC);
		
	}
	
}


class ShapeInterface7{
	
	public static void main(String args[]){
		
		Rectangle r1 = new Rectangle(4, 5);
		r1.printDetails();
		r1.calArea();
		
		Circle c1 = new Circle(4.6);
		c1.printDetails();
		c1.calArea();
		
	}
}