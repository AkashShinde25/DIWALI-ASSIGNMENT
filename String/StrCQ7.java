/* 7. You need to write a program to print all duplicate character and their count in Java. 
		For example, if given String is (Programming) then your program should print
		g : 2	r : 2	m : 2			*/

import java.util.Scanner;

public class StrCQ7 
{  
public static void main(String[] args) 
{  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s1 = sc.nextLine(); 
	
        int count;  
          
        char chArray1[] = s1.toCharArray();
		
		for(int i=0;i<chArray1.length;i++)
		{
			count = 0;
			for(int j=i+1;j<chArray1.length;j++)
			{
				if(chArray1[i] == chArray1[j])
				{
				count++;
				chArray1[j] = '_';			
				}
			}
			
			if(count >= 1 && chArray1[i] != '_' )
			{
			int n = count+1;
			System.out.println("The character "+chArray1[i]+" repeats "+n+" times");
			}
		}
}
}	

