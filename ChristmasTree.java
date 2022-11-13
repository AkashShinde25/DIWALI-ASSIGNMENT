class ChristmasTree

{
	public static void main(String args[])
	{ 
		int p1=1;
		int p2=5;
		int p3=4;
		int p4=8;
	    
		for(int i=1;i<=5;i++)
		{
			
			 
			
			for(int j=p1;j<=p2;j++)
			{
				for(int k=1;k<=p4;k++)
					System.out.print(" ");
				for(int k=p3;k>=j;k--)
				{
					System.out.print(" ");
				}
				for(int k=1;k<=j;k++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
			}
			p1+=2;
			p2+=2;
			p3+=2;
			p4-=2;
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=10;j++)
				System.out.print(" ");
			for(int j=1;j<=4;j++)
				System.out.print("*");
			System.out.println();
		}
	}

		
	

}

