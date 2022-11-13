import java.lang.*;
import java.util.*;

class AdditonOfByte26{
	
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first byte number : (-128 to 127) ");
		byte a = sc.nextByte();
		
		System.out.println("Enter the second byte number : (-128 to 127) ");
		byte b = sc.nextByte();
		
		byte res = (byte)(a+b);
		System.out.println("Sum of given byte numbers is : "+res);
		
	}
}