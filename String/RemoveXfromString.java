import java.util.*;
class RemoveXfromString
{
	static String removeX(String s)
	{
		if(s.length()==0)
			return s;

		if(s.charAt(0)=='x')
			return removeX(s.substring(1));
		return s.substring(0,1)+removeX(s.substring(1)); 

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String :: ");
		String s=sc.nextLine();
		System.out.println(removeX(s));
	}
}