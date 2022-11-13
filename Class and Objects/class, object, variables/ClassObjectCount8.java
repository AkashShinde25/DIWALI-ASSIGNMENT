import java.lang.*;
import java.util.*;

class Student{
	
	static int count;
	
	Student(){
		
		count++;
	
	}
	
	static void printCount(){
		
		System.out.println("No of objects created for the class is : "+count);
	
	}
	
}

class ClassObjectCount8{
	
	public static void main(String args[]){
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();
		Student s5 = new Student();
		Student s6 = new Student();
		
		Student.printCount();
	}
}