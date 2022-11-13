import java.lang.*;
import java.util.*;

class Batsman{
	
	static int jersyNo;
	static String name;
	int noOfMatches;
	int avg;
	
	Batsman(){
	
	
	}
	
	Batsman(int jersyNo, String name, int noOfMatches, int avg){
		
		this.jersyNo = jersyNo;
		this.name = name;
		this.noOfMatches = noOfMatches;
		this.avg = avg;
		
	}
	
	public static void printDetails(){
		
		System.out.println("Static method can access only static variables : ");
		System.out.println("Jersy no of the batsman is : "+jersyNo);
		System.out.println("Name of the batsman is : "+name);
		
	}
	
	public void printDetails1(){
		
		System.out.println("Non static method can access non static variables : ");
		System.out.println("No of the matches played by the batsman is : "+noOfMatches);
		System.out.println("Average of the batsman is : "+avg);
		
	}
	
	public void printDetails2(){
		
		System.out.println("Non static method can access both static and non static variables : ");
		System.out.println("Jersy no of the batsman is : "+jersyNo);
		System.out.println("Name of the batsman is : "+name);
		System.out.println("No of the matches played by the batsman is : "+noOfMatches);
		System.out.println("Average of the batsman is : "+avg);
		
		
	}
	
	
}

class StaticAndNonStaticAccessibility22{
	
	public static void main(String args[]){
		
		Batsman b1 = new Batsman(1, "Sachin", 400, 60);
		b1.printDetails();
		b1.printDetails1();
		b1.printDetails2();
		
	}
}