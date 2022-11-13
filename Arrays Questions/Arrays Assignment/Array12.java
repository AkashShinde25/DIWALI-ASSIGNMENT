class Array12
{
	public static void rotateArrayLeft(int arr[],int k)
	{
		int arrLeft[]=new int[arr.length];
		
		int start=0;
		for(int i=k;i<arr.length;i++)
		{
			arrLeft[start]=arr[i];
			start++;

		}
		for(int i=0;i<k;i++)
		{

			arrLeft[start]=arr[i];
			start++;
		}
		for(int n:arrLeft)
		{
			System.out.print(n+" ");
		}


	}
public static void rotateArrayRight(int arr[],int k)
	{
		
		int arrRight[]=new int[arr.length];
		int start=0;
		for(int i=k-1;i<arr.length;i++)
		{
			arrRight[start]=arr[i];
			start++;

		}
		for(int i=arr.length-k;i<arr.length;i++)
		{

			arrRight[k]=arr[i];
			k++;
		}
		for(int n:arrRight)
		{
			System.out.print(n+" ");
		}


	}

public static void main(String[] args) 
{
	int arr[]={1,2,3,4,5};
	rotateArrayLeft(arr,3);
	rotateArrayRight(arr,3);
}

}