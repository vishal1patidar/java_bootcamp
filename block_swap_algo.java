// The block swap algorithm for array rotation is an efficient algorithm that is used for array rotation.
// It can do your work in O(n) time complexity.

// So, in array rotation, we are given an array arr[] of size n and a number k that define the no. 
//of the element to be rotated.

// Let’s see an example on array rotations −

// Input  −

// arr[] = {4, 6, 1, 8, 9, 2}, k = 2 (number of rotations.)
// Output −

// {1, 8, 9, 2, 4, 6}
// Explanation − On rotation, we will shift the one element to the last position and shift the next
// elements to one position.

// Element at index 0 will be shifted to index n-1. And the rest of the elements are shifted to the 
//previous index.

// Block Swap Algorithm
// The block swap algorithm is used to perform array rotations perfectly.

// Algorithm
// Step 1 − Divide the array two sub-arrays with k as division point. Let them be X = arr[0...k-1] 
//and Y = arr[k...n-1].

// Step 2 − Follow the below steps until the size of X and Y are the same.

// Step 2.1 − If the size of X > Y, divide X into two portions X1 and X2 such that size of X1 is equal to the size of Y. 
//Then swap the sub-array X1 and Y. This will change the original array formation from X1X2Y to YX2X1.

// Step 2.2 − If the size of Y > X, divide Y into two portions Y1 and Y2 such that the size of Y2 is equal to the size of X. 
//Then swap the subarray X and Y2. This will change the original array formation from XY1Y2 to Y2Y1X.

// Step 3 − When the size of X and Y are the same, swap them.

// This algorithm needs a repetitive call to the same chunk of code. This repetitive call can be achieved using two approaches. They are the recursive approach and iterative approach. we will discuss the approach using programs.


// Initialize A = arr[0..d-1] and B = arr[d..n-1]
// 1) Do following until size of A is equal to size of B

//   a)  If A is shorter, divide B into Bl and Br such that Br is of same 
//        length as A. Swap A and Br to change ABlBr into BrBlA. Now A
//        is at its final place, so recur on pieces of B.  

//    b)  If A is longer, divide A into Al and Ar such that Al is of same 
//        length as B Swap Al and B to change AlArB into BArAl. Now B
//        is at its final place, so recur on pieces of A.

// 2)  Finally when A and B are of equal size, block swap them.

import java.util.*;
 
class blok_swap_algo
{
    // Wrapper over the recursive function leftRotateRec()
    // It left rotates arr[] by d.
    public static void leftRotate(int arr[], int d, int n)
    {
        leftRotateRec(arr, 0, d, n);
    }
 
    public static void leftRotateRec(int arr[], int i,int d, int n)
    {
        /* Return If number of elements to be rotated
        is zero or equal to array size */
        if(d == 0 || d == n)
            return;
         
        /*If number of elements to be rotated
        is exactly half of array size */
        if(n - d == d)
        {
            swap(arr, i, n - d + i, d);
            return;
        }
         
        /* If A is shorter*/   
        if(d < n - d)
        {
            swap(arr, i, n - d + i, d);
            leftRotateRec(arr, i, d, n - d);    
        }
        else /* If B is shorter*/   
        {
            swap(arr, i, d, n - d);
            leftRotateRec(arr, n - d + i, 2 * d - n, d); /*This is tricky*/
        }
    }
 
/*UTILITY FUNCTIONS*/
/* function to print an array */
public static void printArray(int arr[], int size)
{
    int i;
    for(i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
    System.out.println();
}
 
/*This function swaps d elements
starting at index fi with d elements
starting at index si */
public static void swap(int arr[], int fi,
                        int si, int d)
{
    int i, temp;
    for(i = 0; i < d; i++)
    {
        temp = arr[fi + i];
        arr[fi + i] = arr[si + i];
        arr[si + i] = temp;
    }
}
 
public static void main (String[] args)
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7};
    leftRotate(arr, 2, 7);
    printArray(arr, 7);    
}
}
