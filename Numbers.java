import java.util.*;
class Numbers
{
	static void printNumber(int n)
	{
		if(n<=0)
		{
			return;
		}
		else
		{
			printNumber(n-1);
			System.out.print(" "+n);
		}
	}	
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.print("Integer n : ");
		int n=s.nextInt();
		System.out.print("Numbers from 1 to n :");
		printNumber(n);
	}
}