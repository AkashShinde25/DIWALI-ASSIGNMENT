import java.lang.*;
import java.util.*;

class Database{
	
	int a;
	int b;
	
	Database(){
	
	
	}
	
	Database(int a, int b){
		
		this.a = a;
		this.b = b;
		
	}
	
	public String toString(){
		
		return " Database [ a = "+a+", b = "+b+" ]";
		
	}
	
	public int hashCode(){
		
		return 5*(a+b);
		
	}
	
	public boolean equals(Object ob){
		
		Database d = (Database)ob;
		
		if(this.a == d.a && this.b == d.b){
			
			return true;
			
		}
		
		else{
			
			return false;
			
		}
	}
	
	
}

class HashCodeMethod15{
	
	public static void main(String args[]){
		
		Database d1 = new Database(5, 7);
		Database d2 = new Database(5, 7);
		
		System.out.println("d1 = "+d1);
		System.out.println("Hash code of the d1 is : "+d1.hashCode());
		
		System.out.println("d1 = "+d1);
		System.out.println("Hash code of the d2 is : "+d2.hashCode());
		
		System.out.println(d1.equals(d2));
		System.out.println("Hash code of the d1 is : "+d1.hashCode());
		System.out.println("Hash code of the d1 is : "+d1.hashCode());
		
	}
}

/*  wihtout overriding hashcode method

d1 =  Database [ a = 5, b = 7 ]
Hash code of the d1 is : 366712642
d1 =  Database [ a = 5, b = 7 ]
Hash code of the d2 is : 1829164700

*/


/* after overriding hashCode method

d1 =  Database [ a = 5, b = 7 ]
Hash code of the d1 is : 60
d1 =  Database [ a = 5, b = 7 ]
Hash code of the d2 is : 60
true
Hash code of the d1 is : 60
Hash code of the d1 is : 60

*/