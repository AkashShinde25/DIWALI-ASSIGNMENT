class Array2
{
	public static void isEqual(int arr1[],int arr2[])
	{
		boolean flag=false;
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]==arr2[i])
				{
					flag=true;

				}


			}

		}

		if(flag)
			System.out.println("Equal");
		else
		 System.out.println("Not Equal");

	}	
	public static void main(String ... args)
	{
		int arr1[]={1,2,3,4,5};
		int arr2[]={1,2,3,4,5};
		int arr3[]={2,3,4,5};

		isEqual(arr1,arr2);
		isEqual(arr2,arr3);



	}



}