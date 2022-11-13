/*

Given an array of length N, you need to find and return the sum of all elements of the array. Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Output Format :
Sum
Constraints :
1 <= N <= 10^3
Sample Input 1 :
3
9 8 9
Sample Output 1 :
26
Sample Input 2 :
3
4 2 1
Sample Output 2 :
7  





*/

// Java program to find sum of array
// elements using recursion.

class SumofArrayElements {
	static int arr[] = { 1, 2, 3, 4, 5 };

	
	static int findSum(int A[], int N)
	{
		if (N <= 0)
			return 0;
		return (findSum(A, N - 1) + A[N - 1]);
	}

	
	public static void main(String[] args)
	{
		System.out.println(findSum(arr, arr.length));
	}
}
