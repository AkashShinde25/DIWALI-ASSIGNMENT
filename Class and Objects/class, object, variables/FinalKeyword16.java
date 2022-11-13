import java.lang.*;
import java.util.*;

class Shape{
	
	final int length = 10 ;
	final int breadth = 20;  // cant be changed
	

	
	final public void printDetails(){ // cant be overridden in child class
		
		System.out.println("Length of the rectangle is : "+length);
		System.out.println("Breadth of the rectangle is : "+breadth)
		;
	}
	
	
}

final class Rectangle extends Shape{ // cant be inherited
	
	public void calArea(){
		
		int areaR = length * breadth;
		System.out.println("Area of the rectangle is : "+areaR);
		
	}
	
}

class FinalKeyword16{
	
	public static void main(String args[]){
	
		Rectangle r1 = new Rectangle();
		r1.printDetails();
		r1.calArea();
	}
}