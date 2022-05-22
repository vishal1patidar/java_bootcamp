// Maximum Product Subarray Problem
// Given an integer array, find the subarray that has the maximum product of its elements. 
//The solution should return the maximum product of elements among all possible subarrays.

// For example,

// Input:  { -6, 4, -5, 8, -10, 0, 8 }
// Output: 1600
// Explanation: The maximum product subarray is {4, -5, 8, -10} having product 1600
 
 
// Input:  { 40, 0, -20, -10 }
// Output: 200
// Explanation: The maximum product subarray is {-20, -10} having product 200

// The problem differs from the problem of finding the maximum product subsequence. 
//Unlike subsequences, subarrays are required to occupy consecutive positions within the original array.

 
// A naive solution would be to consider every subarray and find the product of their elements. 
//Finally, return the maximum product found among all subarrays. The implementation can be seen here.
// The time complexity of this solution is O(n2), where n is the size of the input.

 
// A better solution will be to maintain two variables to store the maximum and minimum product ending 
//in the current position. Then traverse the array once, and for every index i in the array, update the
// maximum and minimum product ending at A[i]. Update the result if the maximum product ending at any 
//index is more than the maximum product found so far.


class max_product_subarray
{
    // Function to return the maximum product of a subarray of a given array
    public static int findMaxProduct(int[] A)
    {
        // base case
        if (A.length == 0) {
            return 0;
        }
 
        // maintain two variables to store the maximum and minimum product
        // ending at the current index
        int max_ending = A[0], min_ending = A[0];
 
        // to store the maximum product subarray found so far
        int max_so_far = A[0];
 
        // traverse the given array
        for (int i = 1; i < A.length; i++)
        {
            int temp = max_ending;
 
            // update the maximum product ending at the current index
            max_ending = Integer.max(A[i], Integer.max(A[i] * max_ending,
                                                A[i] * min_ending));
 
            // update the minimum product ending at the current index
            min_ending = Integer.min(A[i], Integer.min(A[i] * temp,
                                                A[i] * min_ending));
 
            max_so_far = Integer.max(max_so_far, max_ending);
        }
 
        // return maximum product
        return max_so_far;
    }
 
    public static void main(String[] args)
    {
        int[] A = { -6, 4, -5, 8, -10, 0, 8 };
 
        System.out.print("The maximum product of a subarray is " + findMaxProduct(A));
    }
}
