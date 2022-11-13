class Array18
{
	public static void findDuplicate(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}


	}
	public static void main(String[] args) {
		int arr[]={1,2,3,1,4,5,5};
		findDuplicate(arr);
	}
}