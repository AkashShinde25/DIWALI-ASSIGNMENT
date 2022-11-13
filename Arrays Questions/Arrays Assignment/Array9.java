class Array9
{
	
	public static void generateSeries(int n)
	{
			int []arr=new int[n];

			for(int i=0;i<n;i++)
			{
				if(i%2==0)
					arr[i]=(i+1)*(i+1)*(i+1);

				else
					arr[i]=	(i+1)*(i+1);

			}

			for(int num:arr)
			{
				System.out.print(num+",");

			}


	}

	public static void main(String ... args)
	{
		generateSeries(6);


	}


}