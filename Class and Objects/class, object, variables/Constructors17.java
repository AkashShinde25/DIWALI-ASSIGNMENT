import java.lang.*;
import java.util.*;

class Vehicles{
	
	int noOfWheels;
	String color;
	
	Vehicles(){
	
	
	}
	
	Vehicles(int noOfWheels, String color){
		
		this.noOfWheels = noOfWheels;
		this.color = color;
		
	}
	
	public void printDetails(){
		
		System.out.println("No of wheels in the vehicle are : "+noOfWheels);
		System.out.println("Color of the vehicle is : "+color);
		
	}
	
}

class Car extends Vehicles{
	
	int maxSpeed;
	
	Car(){
	
	
	}
	
	Car(int maxSpeed){
		
		this.maxSpeed = maxSpeed;
		
	}
	
	public void carDetails(){
		
		System.out.print("Max speed of the car is : "+maxSpeed);
		
	}
	
}

class Constructors17{
	
	public static void main(String args[]){
		
		Vehicles v1 = new Vehicles(4, "Blue");
		v1.printDetails();
		
		Car c1 = new Car(120);
		c1.carDetails();
	}
}