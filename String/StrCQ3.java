//3. How to check if two Strings are anagrams of each other?

/* An anagram of a string is another string that contains the same characters, only the order of characters can be different. 
For example, (abcd) and (dabc) are an anagram of each other */

import java.util.*;					//While writting array functions, it is better to write
import java.util.Scanner;


public class StrCQ3 
{  
public static void main(String[] args) 
{  
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the String");
	String s1 = sc.nextLine();  
	String s2 = sc.nextLine();  
	
	//Converting to same cass bcoz anagrams are case insenitive
	
	s1 = s1.toLowerCase();
    s2 = s2.toLowerCase();

    // check if length is same
    if(s1.length() == s2.length()) 
	{

      // convert strings to char array
      char[] charArray1 = s1.toCharArray();
      char[] charArray2 = s2.toCharArray();

      // sort the char array
      Arrays.sort(charArray1);
      Arrays.sort(charArray2);

      // if sorted char arrays are same
      // then the string is anagram
      boolean result = Arrays.equals(charArray1, charArray2);

      if(result) 
	  {
        System.out.println(s1 + " and " + s2 + " are anagram.");
      }
      else 
	  {
        System.out.println(s1 + " and " + s2 + " are not anagram.");
      }
    }
    else 
	{
      System.out.println(s1 + " and " + s2 + " are not anagram.");
    }
	
}}
