//4. How to program to print the first non repeated character from String?

import java.util.Scanner;

public class StrCQ4 
{  
public static void main(String[] args) 
{  
    System.out.println("Enter the String");
	Scanner sc = new Scanner(System.in);
	
	String s1 = sc.nextLine();  
        int count;  
          
        char chArray1[] = s1.toCharArray();
		
		System.out.println("The character which non repeats firt time is: ");
		
		for(int i=0;i<chArray1.length;i++)
		{
			
			for(int j=i+1;j<chArray1.length;j++)
			{
				if(chArray1[i] != chArray1[j])
				{
				
				System.out.println(chArray1[j]);
				break;
				
				
				}
				
				
			}
			
			break;
			
			
		}
}
}	