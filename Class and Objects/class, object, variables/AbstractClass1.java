import java.lang.*;
import java.util.*;

abstract class Student{ 
	
	int roll;
	int marks;
	String name;
	
	Student(){
		
		
	}
	
	abstract void setDetails(int roll, int marks, String name);
	
	
	void printDetails(){
		
		System.out.println("Name of the student is : "+name);
		System.out.println("Roll no of the student is : "+roll);
		System.out.println("Marks in the exam are  : "+marks);
		
	}
	
	
}

class Person extends Student{
	
	char gender;
	
	Person(){
		
		
	}
	
	Person(char gender){
		
		this.gender = gender;
		
	}
	
	public void setDetails(int roll, int marks, String name){
		
		this.roll = roll;
		this.marks = marks;
		this.name = name;
		
	}
	
	void printGender(){
		
		System.out.println("Gender of the student is : "+gender);
	}
	
}


class AbstractClass1{
	
	public static void main(String args[]){
		
		Person p1 = new Person('M');
		Person p2 = new Person('F');
		
		
		p1.setDetails(1, 80, "Omkar");
		p1.printDetails();
		p1.printGender();
		
		p2.setDetails(2, 85, "Pooja");
		p2.printDetails();
		p2.printGender();
		
		
		
	}
}