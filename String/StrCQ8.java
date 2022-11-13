// 8. How to count the occurrence of a given character in String?

import java.util.Scanner;

public class StrCQ8
{  
public static void main(String[] args) 
{  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s1 = sc.nextLine(); 
	char c1 = sc. next().charAt(0);
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
			
			if(chArray1[i] == c1)
			{
					if(count >= 1 && chArray1[i] != '_' )
					{
					int n = count+1;
					System.out.println("The character "+chArray1[i]+" repeats "+n+" times");
					}
					else
					{
					int n = count+1;
					System.out.println("The character "+chArray1[i]+" repeats "+n+" times");
					}
			}
		}
}
}	

