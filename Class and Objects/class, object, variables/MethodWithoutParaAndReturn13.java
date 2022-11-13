import java.lang.*;
import java.util.*;

class Student{
	
	int rollNo;
	String name;
	double marks;
	
	Student(){
	
	
	}
	
	Student(int rollNo, String name, double marks){
		
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		
	}
	
	public void printDetails(){
		
		System.out.println("Roll no of the student is : "+rollNo);
		System.out.println("Name of the student is : "+name);
		System.out.println("Marks of the student is : "+marks);
		
	}
	
}

class MethodWithoutParaAndReturn13{

	public static void main(String args[]){
		
		Student s1 = new Student(1, "omkar", 70.0);
		s1.printDetails();
	}
}