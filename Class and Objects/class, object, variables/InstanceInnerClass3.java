import java.lang.*;
import java.util.*;


class Student{
	
	int rollNo;
	String name;
	int noOfSubjects;
	int totMarks;
	
	Student(){
		
		
	}
	
	Student(int rollNo, String name, int noOfSubjects, int totMarks){
		
		this.rollNo = rollNo;
		this.name = name;
		this.noOfSubjects = noOfSubjects;
		this.totMarks = totMarks;
		
	}
	
	void studentDetails(){
		
		AvgMarks am1 = new AvgMarks();
		double r = am1.printAvg();
		
		PrintDetails pd1 = new PrintDetails();
		pd1.printing(r);
	}
	
	class PrintDetails{
		
		void printing(double avg){
			
			System.out.println("Roll no of the student is : "+rollNo);
			System.out.println("Name of the student is : "+name);
			System.out.println("Average marks of the student are : "+avg);
		}
	}
	
	class AvgMarks{
		
		double printAvg(){
			
			double avg = (double)totMarks / noOfSubjects;
			
			return avg;
			
		}
		
	}
	
	
}


class InstanceInnerClass3{ 

	public static void main(String args[]){
		
		// we are directly accessing inner classes through outer class
		Student s1 = new Student(1, "Omkar", 5, 400);
		
		Student.AvgMarks sam1 = s1.new AvgMarks();
		double res = sam1.printAvg();
		
		Student.PrintDetails spd1 = s1.new PrintDetails();
		spd1.printing(res);
		
		
		// we are accessing inner classes in outer class method
		Student s2 = new Student(2, "Gaurav", 4, 360);
		s2.studentDetails(); 
		
		
	}
}