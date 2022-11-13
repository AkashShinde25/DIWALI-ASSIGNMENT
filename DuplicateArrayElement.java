

import java.util.*;


public class DuplicateArrayElement {  
    public static void main(String[] args) {      
          
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
        
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) 
			{  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }  
}  
/*
Enter the elements of the array:
2 2 5 6 4
Array elements are:
2
2
5
6
4
Duplicate elements in given array:
2
*/