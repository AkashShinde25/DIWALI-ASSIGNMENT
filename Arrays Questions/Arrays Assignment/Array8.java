import java.util.*;
class Array8
{
	public static void printAverage(int ... arr)
	{
		while(arr.length>3)
		{
		for(int i=0;i<arr.length-2;i++)
		{
			int avg= (arr[i]+arr[i+1]+arr[i+2])/3;
			System.out.print(avg+",");
		}
		}
		
	}

	public static void main(String ... args)
	{

		

		int arr[]={5,14,35,89,140};
		printAverage(arr);



	}


}