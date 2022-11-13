import java.lang.*;
import java.util.*;


abstract class Shape{
	
	int length;
	int breadth;

	
	Shape(){
		
		
	}
	
	abstract void setDetails(int length, int breadth);
	
	abstract void calArea();
	
	abstract void calVolume();
	
}

class Rectangle extends Shape{
	
	public void setDetails(int length, int breadth){
		
		this.length = length;
		this.breadth = breadth;
	
		
	}
	
	public void calArea(){
		
		int areaR = length * breadth;
		System.out.println("Area of the rectangle is : "+areaR);
		
	}
	
	public void calVolume(){
		
		
	}
	
}

class Square extends Shape{
	
	int side;
	
	Square(){
		
		
	}
	
	Square(int side){
		
		this.side = side;
		
	}
	
	public void setDetails(int length, int breadth){
		
		
	}
	
	public void calArea(){
		
		int areaS = side * side;
		System.out.println("Area of the square is : "+areaS);
		
	}
	
	public void calVolume(){
		
		
	}
	
}

class Sphere extends Shape{
	
	int radius;
	double PI = 3.14;
	
	Sphere(){
		
		
	}
	
	Sphere(int radius){
		
		this.radius = radius;
		
	}
	
	
	public void setDetails(int length, int breadth){
		
		
	}
	
	public void calArea(){
		
		double areaSp = (double)4*PI*radius*radius;
		System.out.println("Area of the sphere is : "+areaSp);
		
	}
	
	public void calVolume(){
		
		double volumeSp = (double)4/3*PI*radius*radius*radius;
		System.out.println("Volume of the sphere is : "+volumeSp);
		
	}
	
}

class RectangularBox extends Shape{
	
	int height;
	
	RectangularBox(){
		
		
	}
	
	RectangularBox(int height){
		
		this.height = height;
		
	}
	
	public void setDetails(int length, int breadth){
		
		this.length = length;
		this.breadth = breadth;
		
	}
	
	public void calArea(){
		
		int areaRB = 2*(length * breadth + breadth * height + length * height);
		System.out.println("Area of the rectangular box is : "+areaRB);
		
	}
	
	public void calVolume(){
		
		int volumeRB = length * breadth * height;
		System.out.println("Volume of the rectangular box is : "+volumeRB);
		
	}
	

}


class AbstractClassMethods2{
	
	public static void main(String args[]){
		
		Rectangle r1 = new Rectangle();
		Square s1 = new Square(5);
		Sphere sp1 = new Sphere(6);
		RectangularBox rb1 = new RectangularBox(7);
		
		r1.setDetails(4,5);
		r1.calArea();
		
		s1.calArea();
		
		sp1.calArea();
		sp1.calVolume();
		
		rb1.setDetails(8,9);
		rb1.calArea();
		rb1.calVolume();
	}
	
}