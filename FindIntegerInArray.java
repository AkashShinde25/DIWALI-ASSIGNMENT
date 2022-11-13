import java.util.*;
class FindIntegerInArray
{
	
	
	
	static int recSearch(int arr[], int l, int r, int x)
     {
          if (r < l)
             return -1;
          if (arr[l] == x)
             return l;
          
          return recSearch(arr, l+1, r, x);

     }
      
     
     public static void main(String[] args)
     {
     	System.out.print("Enter Length of Array :: ");
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter the Array elements:: ");
      for(int i=0;i<n;i++)
      {
         arr[i]=sc.nextInt();
      }
      System.out.println("Enter number to find :: ");
        int x = sc.nextInt();
         
        
        int index = recSearch(arr, 0, n-1, x);
        if (index != -1)
           System.out.println("Element " + x + " is present at index " +
                                                    index);
        else
            System.out.println("Element " + x + " is not present");
      }
 }
	
	
