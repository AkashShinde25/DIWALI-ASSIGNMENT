import java.lang.*;
import java.util.*;

class First{
	
	int a;
	int b;
	
	First(){
	
	
	}
	
	First(int a, int b){
		
		this.a = a;
		this.b = b;
		
	}
	
	
}

class Second extends First{

	int c;
	
	
	Second(){
	
	
	}
	
	Second(int a, int b, int c){
		
		super(a, b);
		this.c = c;
	
	}
	
	void printValues(){
	
		System.out.println("Value of a is : "+a);
		System.out.println("Value of b is : "+b);
		System.out.println("Value of c is : "+c);
		
	}
	
}

class CallingSuperClassConstructor21{
	
	public static void main(String args[]){
		
		Second s1 = new Second(5, 6, 7);
		s1.printValues();
	}
}