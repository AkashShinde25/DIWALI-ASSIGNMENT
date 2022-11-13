class Array16
{
	public static void findIntersection(int arr1[],int arr2[])
	{
		int len1=arr1.length;
		int len2=arr2.length;
		
		
			for(int i=0;i<len1;i++)
			{
				for(int j=0;j<len2;j++)
				{
					if(arr1[i]==arr2[j])
					{
						System.out.print(arr1[i]+" ");

					}


				}
			}


		



	}

	public static void main(String[] args) {
		int arr1[]={1,2,3,4,5,6,7,8,9,10};
		int arr2[]={8,11,20,55};
		findIntersection(arr1,arr2);
	}
}