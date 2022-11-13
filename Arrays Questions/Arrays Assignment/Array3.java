import java.util.*;
class Array3
{
	public static void findSum(int arr[],int key)
	{
		int num[]=new int[2];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{

				if(arr[i]+arr[j]==key)
				{
					num[0]=arr[i];
					num[1]=arr[j];
				System.out.print("["+num[0]+","+num[1]+"] ");
				}
				

			}
			
		}
		
	}


	public static void main(String ... args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array:: ");
		int len=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the elements seperated by comma:: ");
		String s[]=sc.nextLine().split(",");
		int arr[]=new int[s.length];
		for(int i=0;i<s.length;i++)
		{
			arr[i]=Integer.parseInt(s[i]);

		}
		System.out.println("Enter target number:: ");
		int target=sc.nextInt();
		
		findSum(arr,target);		

	}

}