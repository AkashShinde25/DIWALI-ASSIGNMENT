import java.util.*;
class RemoveConsecutiveDuplicates
{
		
public static String removeDups(String s)
{
    if ( s.length() <= 1 ) return s;
    if( s.substring(1,2).equals(s.substring(0,1)) ) return removeDups(s.substring(1));
    else return s.substring(0,1) + removeDups(s.substring(1));
}



		 
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(removeDups(str));
	}
}