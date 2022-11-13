class Array20
{
	public static void seperateZeroNonZeroElements(int arr[])
	{
		int arrZeros[]=new int[arr.length];
		int arrNonZeros[]=new int[arr.length];
		int k=0;
		int l=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				arrZeros[k++]=arr[i];
			}
			else 
			{
				arrNonZeros[l++]=arr[i];
			}
		}
		System.out.print("Zero elements :: ");
		for(int i=0;i<k;i++)
		{
			System.out.print(arrZeros[i]+" ");
		}
		System.out.println();
		System.out.print("NonZero elements :: ");
		for(int i=0;i<l;i++)
		{
			System.out.print(arrNonZeros[i]+" ");
		}



	}


	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,0,0,2,4,0,0};
		seperateZeroNonZeroElements(arr);
	}
}
