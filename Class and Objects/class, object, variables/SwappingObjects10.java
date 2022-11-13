import java.lang.*;
import java.util.*;

class Cricketer{
	
	int jersyNo;
	String name;
	int noOfMatches;
	
	Cricketer(){
	
	
	}
	
	Cricketer(int jersyNo, String name, int noOfMatches){
		
		this.jersyNo = jersyNo;
		this.name = name;
		this.noOfMatches = noOfMatches;
		
	}
	
	public String toString(){
		
		return " Cricketer [ Jersy No = "+jersyNo+", Name = "+name+", No of matches = "+noOfMatches+" ]";
	}
	
}

class SwappingObjects10{
	
	public static void swap(Cricketer c1 , Cricketer c2){
		
		int tempjersyNo;
		
		tempjersyNo = c1.jersyNo;
		c1.jersyNo = c2.jersyNo;
		c2.jersyNo = tempjersyNo;
		
		String tempName;
		
		tempName = c1.name;
		c1.name = c2.name;
		c2.name = tempName;
		
		int tempNoOfMatches;
		
		tempNoOfMatches = c1.noOfMatches;
		c1.noOfMatches = c2.noOfMatches;
		c2.noOfMatches = tempNoOfMatches;
		
		
	} 
	
	public static void main(String args[]){
		
		Cricketer c1 = new Cricketer(18, "Virat", 230);
		Cricketer c2 = new Cricketer(45, "Rohit", 300);
		
		
		swap(c1, c2);
		
		System.out.println(c1);
		System.out.println(c2);
		
	}
}