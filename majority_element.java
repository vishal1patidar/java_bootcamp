// Write a function which takes an array and prints the majority element (if it exists), 
//otherwise prints no majority element
//A majority element in an array A[] of size n is an element that
// appears more than n/2 times (and hence there is at most one such element). 

// Examples : 

// Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
// Output : 4
// Explanation: The frequency of 4 is 5 which is greater
// than the half of the size of the array size. 

// Input : {3, 3, 4, 2, 4, 4, 2, 4}
// Output : No Majority Element
// Explanation: There is no element whose frequency is
// greater than the half of the size of the array size.
// Recommended Practice
// Majority Element

// METHOD 1  

// Approach: The basic solution is to have two loops and keep track of the maximum count for all different 
//elements. If maximum count becomes greater than n/2 then break the loops and return the element having 
//maximum count. If the maximum count doesn’t become more than n/2 then the majority element doesn’t exist.

// Algorithm: 
// Create a variable to store the max count, count = 0
// Traverse through the array from start to end.
// For every element in the array run another loop to find the count of similar elements in the given array.
// If the count is greater than the max count update the max count and store the index in another variable.
// If the maximum count is greater than the half the size of the array, print the element. Else print there 
//is no majority element.


// Java program to find Majority
// element in an array

import java.io.*;

class majority_element {

	// Function to find Majority element
	// in an array
	static void findMajority(int arr[], int n)
	{
		int maxCount = 0;
		int index = -1; // sentinels
		for (int i = 0; i < n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j])
					count++;
			}

			// update maxCount if count of
			// current element is greater
			if (count > maxCount) {
				maxCount = count;
				index = i;
			}
		}

		// if maxCount is greater than n/2
		// return the corresponding element
		if (maxCount > n / 2)
			System.out.println(arr[index]);

		else
			System.out.println("No Majority Element");
	}

	public static void main(String[] args)
	{

		int arr[] = { 1, 1, 2, 1, 3, 5, 2, 4, 4, 2 };
		int n = arr.length;

		// Function calling
		findMajority(arr, n);
	}
	// This code is contributed by ajit.
}
