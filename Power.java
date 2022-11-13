import java.util.*;
class Power
{
	static int power(int x,int n)
	{
		if(n==0)
			return 1;
		else
			return x* power(x,n-1);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Two integers x and n");
		int x=s.nextInt();
		int n=s.nextInt();
		System.out.println("x raise to the power n : "+power(x,n));
	}
}