 
class Array7 {
     
  
    static void alternateMerge(int arr1[], int arr2[],
                               int n1, int n2, int arr3[])
    {
        int i = 0, j = 0, k = 0;
     
        
        while (i < n1 && j < n2)
        {
            arr3[k++] = arr1[i++];
            arr3[k++] = arr2[j++];
        }
     
        
        while (i < n1)
            arr3[k++] = arr1[i++];
     
       
        while (j < n2)
            arr3[k++] = arr2[j++];
    }
     
   

	
	
public static void main(String args[])
    {
        int arr1[] = {23,60,94,3,102};
        int n1 = arr1.length;
     
        int arr2[] = {42,16,74};
        int n2 = arr2.length;
     
        int arr3[] = new int[n1+n2];
        alternateMerge(arr1, arr2, n1, n2, arr3);
     
      
        for (int i = 0; i < n1 + n2; i++)
            System.out.print( arr3[i] + " ");
    }
	

}