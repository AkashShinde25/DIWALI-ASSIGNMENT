import java.lang.*;
import java.util.*;

class Demo{
	
	int a;
	int b;
	
	Demo(){
	
	
	}
	
	Demo(int a, int b){
		
		this.a = a;
		this.b = b;
		
	}
	
	public void add(){
		
		int res = a + b;
		System.out.println("Addition of a and b is : "+res);
	
	}
	
	void sub(){
		
		int res = a - b;
		System.out.println("Subtraction of the a and b is : "+res);
		
	}
	
	public int mul(){
		
		int res = a*b;
		return res;
		
	}
		
}

class UseOfMethods11{
	
	public static void main(String args[]){
		
		Demo d1 = new Demo(10, 5);
		d1.add();
		
		d1.sub();
		
		int i = d1.mul();
		System.out.println("Multiplication of two number is : "+i);
		
	}
}