/* 	9. How to convert numeric String to an int?
	For example, if you pass "67263" to the program then it should return 67263.		*/
	
import java.util.Scanner;


public class StrCQ9
{  
public static void main(String[] args) 
{  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s1 = sc.nextLine();  
        
	//Converting String into int using Integer.parseInt()  
	int i=Integer.parseInt(s1);  
	
	//Printing value of i  
	System.out.println(i);  
}
}		
			