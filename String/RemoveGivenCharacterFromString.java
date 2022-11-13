/*
Q11. 

Given a string, compute recursively a new string where all 'x' chars have been removed.

Input format :
String S

Output format :
Modified String

Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 

Sample Input 1 :
xaxb
Sample Output 1:
ab

Sample Input 2 :
abc
Sample Output 2:
abc

Sample Input 3 :
xx
Sample Output 3:
*/

import java.util.*;

class RemoveGivenCharacterFromString
{
static void removeChar(String s, char c)
{
    int j, count = 0, n = s.length();
    char []t = s.toCharArray();
    for (int i = j = 0; i < n; i++)
    {
        if (t[i] != c)
        t[j++] = t[i];
        else
            count++;
    }
     
    while(count > 0)
    {
        t[j++] = '\0';
        count--;
    }
     
    System.out.println(t);
}
 public static void main(String[] args)
{
	
	Scanner sc= new Scanner(System.in);
	
    String s = sc.next();
	char c = sc.next().charAt(0);
    removeChar(s, c);
}
}