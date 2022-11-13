//5. How to check if a String contains only digits?

import java.util.Scanner;

public class StrCQ5 
{  
public static void main(String[] args) 
{  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s1 = sc.nextLine();  
        boolean result = s1.matches("[0-9]+");
		
		if(result == true)
        System.out.println("The string contain only digit");
		
		else
		System.out.println("The string does not contain only digit");
        
    }
}