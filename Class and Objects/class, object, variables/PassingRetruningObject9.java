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
	
	public String toString(){
		
		return "First [ a = "+a+", b = "+b+" ]";
	}
	
}

class Second{
	
	int c;
	First f1;
	
	Second(){
	
	
	}
	
	Second(int c, First f1){
		
		this.c = c;
		this.f1 = f1;
		
	}
	
	public String toString(){
		
		return "Second [ c = "+c+", f1 = "+f1+" ]";
		
	}
	
}

class Third{
	
	First f2;
	First f3;
	
	Third(){
		
		
	}
	
	Third(First f2, First f3){
		
		this.f2 = f2;
		this.f3 = f3;
		
	}
	
	public int add(){
		
		int res = f2.a + f3.a;
		
		return res;
		
	}
	
}

class PassingRetruningObject9{

	public static void main(String args[]){
		
		First f1 = new First(5, 10);
		
		Second s1 = new Second(15, f1);
		
		System.out.println(f1);
		System.out.println(s1);
		
		
		First f2 = new First(20, 25);
		First f3 = new First(30, 35);
		
		Third t1 = new Third(f2, f3);
		int f = t1.add();
		
		System.out.print(f);
		
	}
}