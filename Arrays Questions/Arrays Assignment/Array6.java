class Array6
{
	public static void findThirdLargest(int arr[])
	{

	int first,second,third;
	first=second=third=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>first)
		{
			third=second;
			second=first;
			first=arr[i];

		}

		else if(arr[i]>second)
		{
			third=second;
			second=arr[i];


		}
		else if(arr[i]>third)
		{
			third=arr[i];
		}
		

	}	
	System.out.print("Third Largest element :: "+third);
}

public static void main(String ... args)
{
	int arr[]={24,54,31,16,82,45,67};
	findThirdLargest(arr);



}
}