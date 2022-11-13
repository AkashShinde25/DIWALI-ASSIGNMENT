import java.lang.*;
import java.util.*;

class Employee{
	
	String type;
	
	Employee(){
	
	
	}
	
	Employee(String type){
		
		this.type = type;
		
	}
	
	void printDetails(){
		
		System.out.println("Given string is : "+type);
	}
	
	
}

class StringConstructor20{
	
	public static void main(String args[]){
		
		Employee e1 = new Employee("Omkar");
		e1.printDetails();
	}
}