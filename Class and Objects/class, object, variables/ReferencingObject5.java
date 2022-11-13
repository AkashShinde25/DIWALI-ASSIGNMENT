import java.lang.*;
import java.util.*;

class Car{
	
	static String manufacturer;
	static String color;
	static int avg;
	static int noOfDoors;
	
	Car(){
	
	
	}
	
	Car(String manufacturer, String color, int avg, int noOfDoors){
		
		this.manufacturer = manufacturer;
		this.color = color;
		this.avg = avg;
		this.noOfDoors = noOfDoors;
		
	}
	
	static void printDetails(){
			
		System.out.println("Name of the manufacturer of the car is : "+manufacturer);
		System.out.println("Color of the car is : "+color);
		System.out.println("Average of the car is : "+avg);
		System.out.println("No of doors in the car are : "+noOfDoors);
		
	}	
	
	class CarDetails{
		
		void methodCall(){
			
			printDetails();
		}
	}
	
}

class ReferencingObject5{
	
	public static void main(String args[]){
		
		Car c1 = new Car("TATA", "Red", 15, 4);
		
		Car.CarDetails ccd1 = c1.new CarDetails();
		ccd1.methodCall();
	}
}
