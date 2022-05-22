// Leaders in an Array
// Problem Statement: Given an array, print all the elements which are leaders. A Leader is an element
// that is greater than all of the elements on its right side in the array.

// Examples:

// Example 1:
// Input:
//  arr = [4, 7, 1, 0]
// Output:
//  7 1 0
// Explanation:
//  Rightmost element is always a leader. 7 and 1 are greater than the elements in their right side.

// Example 2:
// Input:
//  arr = [10, 22, 12, 3, 0, 6]
// Output:
//  22 12 6
// Explanation:
//  6 is a leader. In addition to that, 12 is greater than all the elements in its right side (3, 0, 6), 
//also 22 is greater than 12, 3, 0, 6.
// Solution
// Disclaimer: Don’t jump directly to the solution, try it out yourself first.

// Solution 1:
// Intuition:
// There is no special intuition needed here. Just a common fact that we need to compare elements in 
//order to find the greatest is more than enough.

// Approach:
// Let’s see the basic brute force approach. The candidates for the leaders are the array elements itself.
// So, we’ll start with the first element and we’ll compare it with every other element.
// If we do not find any element greater than the starting element, then the starting element is one 
//of the possible leaders. We print it.
// If we found at least one element greater than the current element, then it is not a leader.
// We do this for all the rest of the elements in the array and print whenever we find a leader.




import java.util.*;

public class leader_an_array {

  public static void main(String[] args) {

    int[] arr1 = {4, 7, 1, 0};
    System.out.println("The leaders of the first array are: ");
    printLeadersBruteForce(arr1, arr1.length);

    int[] arr2 = {10, 22, 12, 3, 0, 6};
    System.out.println("The leaders of the second array are: ");
    printLeadersBruteForce(arr2, arr2.length);
  }

  public static void printLeadersBruteForce(int[] arr, int n) {
    for (int i = 0; i < n - 1; i++) {
      boolean leader = true;

      //Checking whether arr[i] is greater than all the elements in its right side
      for (int j = i + 1; j < n; j++)
        if (arr[j] > arr[i]) {
          leader = false;
          break;
        }

      if (leader)
        System.out.print(arr[i] + " ");
    }
    System.out.print(arr[n - 1] + "\n");
  }

}