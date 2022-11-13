import java.lang.*;
import java.util.*;

class Operations{
	
	int a;
	int b;
	String name;
	
	Operations(){
	
	
	}
	
	Operations(int a, int b, String name){
	
		this.a = a;
		this.b = b;
		this.name = name;
		
	}
	
	public int addition(){
		
		int res = a + b;
		return res;
		
	}
	
	public double multiplication(){
		
		double res = (double)a * b;
		return res;
		
	}
	
	public String printName(){
		
		return name;
		
	}
	
}

class MethodWithoutParaWithReturn12{
	
	public static void main(String args[]){
		
		Operations o1 = new Operations(4, 5, "Omkar");
		
		int x = o1.addition();
		double y = o1.multiplication();
		String z = o1.printName();
		
		System.out.println("Addition of two no is : "+x);
		System.out.println("Multiplication of two no is : "+y);
		System.out.println("Name is : "+z);
		
	}
}