import java.util.*;
class NoofDigit
{
	 static int digit=0;
	static int findDigitNumbers(int num)
	{
		

		if(num/10==0)
			return digit+1;
		else 
		{
			num=num/10;
			digit++;
			return findDigitNumbers(num-1);
		}
		
			
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a no. :: ");
		int num=sc.nextInt();
		System.out.println(findDigitNumbers(num));
	}
}