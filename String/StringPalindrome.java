/*Java Program to Check whether a String is a Palindrome or not using Recursive Function*/
import java.util.Scanner;
public class StringPalindrome
{
    //Recursive function that checks 
    //whether the string is palindrome or not
    static boolean isPalindrome(String str) 

    {

        str=str.replaceAll("[^a-zA-Z]","");
        str=str.toLowerCase(); 
        //If string has 0 or 1 character
        if(str.length() == 0 || str.length() == 1)
            return true; 
        //If string has multiple characters
        //Check whether first and last characters are same or not
        if(str.charAt(0) == str.charAt(str.length()-1))
            return isPalindrome(str.substring(1, str.length()-1));
        return false;
    }   
    // Driver Code 
    public static void main(String args[]) 
    { 
        //Take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String :");
        String str = sc.nextLine();   //Input the string
        //Check whether palindrome or not
        if (isPalindrome(str)) 
            System.out.println(str+" is palindrome"); 
        else
            System.out.println(str+ " is not a palindrome"); 
    }     
}