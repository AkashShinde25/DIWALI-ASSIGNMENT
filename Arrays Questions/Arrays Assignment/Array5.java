import java.util.*;
class Array5
{
	public static void findArray(int arr[])
	{
		int largest,smallest;
		largest=smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}

		}

		System.out.print("Largest:: "+largest+" Smallest:: "+smallest);
	}
public static void main(String ... s)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no. of elements:: ");
	int num=sc.nextInt();
	int arr[]=new int[num];
	sc.nextLine();
	System.out.println("Enter "+num+" Numbers seperated by comma: ");
	String string[]=sc.nextLine().split(",");
	for(int i=0;i<num;i++)
	{
		
		arr[i]=Integer.parseInt(string[i]);
	
	}
	findArray(arr);
}
}