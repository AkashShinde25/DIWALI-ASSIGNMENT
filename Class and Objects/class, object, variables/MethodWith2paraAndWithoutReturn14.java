import java.lang.*;
import java.util.*;

class Cricketer{
	
	int jersyNo;
	String name;
	int noOfMatches;
	double avg;
	
	Cricketer(){
	
	
	}
	
	public void printDetails(int jersyNo, String name, int noOfMatches, double avg){
		
		System.out.println("Jersy no of the cricketer is : "+jersyNo);
		System.out.println("Name of the cricketer is : "+name);
		System.out.println("No of matches played by cricketer is : "+noOfMatches);
		System.out.println("Average of the cricketer is : "+avg);
		
	}
	
}

class MethodWith2paraAndWithoutReturn14{
	
	public static void main(String args[]){
		
		Cricketer c1 = new Cricketer();
		c1.printDetails(15,"Dhoni", 340, 56.70);
	}
}