import java.io.*;
import java.util.*;
 
class Array15 {
 
    
    public static void findMissing(int arr[], int N)
    {
        int i;
        int temp[] = new int[N + 1];
        for (i = 0; i <= N; i++) {
            temp[i] = 0;
        }
 
        for (i = 0; i < N; i++) {
            temp[arr[i] - 1] = 1;
        }
 
        int ans = 0;
        for (i = 0; i <= N; i++) {
            if (temp[i] == 0)
                ans = i + 1;
        }
        System.out.println("Missing element from series is : "+ans);
    }
	 public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the number of elements you want to store: ");  
		 int n = sc.nextInt();
		 
		 int[] arr = new int[n];  
			System.out.println("Enter the elements of the array: ");  
			for(int i=0; i<n; i++)  
			{  
			//reading array elements from the user   
			arr[i]=sc.nextInt();  
			}  
			
			System.out.println("Array elements are: ");  
				// accessing array elements using the for loop  
				for (int i=0; i<n; i++)   
				{  
				System.out.println(arr[i]);  
				}
       
        int l = arr.length;
 
       
        findMissing(arr, l);
    }
}
/*
Enter the number of elements you want to store: 6
Enter the elements of the array:
1 2 3 4 5 7
Array elements are:
1
2
3
4
5
7
Missing element from series is : 6
*/