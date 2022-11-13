import java.util.*;
class Array24
{
	public static void findKthLargest(int arr[],int k)
	{
		//List<Integer>list=Arrays.asList(arr);

		//Collections.sort(list, Collections.reverseOrder());  
		//Set<Integer>treeArray=new TreeSet<>(list);
		Arrays.sort(arr);

		System.out.println(k+"th largest element:: ");
	
		System.out.println(arr[arr.length-k]);

		


	}
	public static void main(String[] args) {
		int arr[]={2,1,8,6,5,7,0,9,4,3};
		System.out.println("Input Array :: ");
		for(int n:arr)
		{
			System.out.print(n+",");
		}
		System.out.println();
		findKthLargest(arr,3);
	}

}