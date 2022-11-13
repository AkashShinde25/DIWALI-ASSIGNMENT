/*	11. How to replace each given character to other e.g. blank with %20?
		For example, if the input is (Java is Great) and asked to replace space with %20 then it should be (Java%20is%20Great).*/
		
import java.util.Scanner;

public class StrCQ11
{  
public static void main(String[] args) 
{  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s1 = sc.nextLine();  
       
	String[] strArray = s1.split("\\s");			//creates an array where every index position holds an word
	
	for(int i=0;i<strArray.length;i++)
	{
		if(i == strArray.length -1)					//To eliminate last replacement
			System.out.print(strArray[i]);
		else
			System.out.print(strArray[i]+"%20");
	}
}
}	