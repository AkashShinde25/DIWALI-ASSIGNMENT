import java.lang.*;
import java.util.*;

class First{

	static int a;
	static int b;
	
	static{
	
		System.out.println("Static block - 1");
		
	}
	
	static void staticMethod(){
		
		System.out.println("Static method");
		
	}
	
	static{
	
		System.out.println("Static block - 2");
		
	}
	
}

class StaticBlockStaticMethod25{
	
	public static void main(String args[]){
	
		First.staticMethod();
	}
}
