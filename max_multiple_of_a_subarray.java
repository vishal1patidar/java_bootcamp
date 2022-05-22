// Given an array that contains both positive and negative integers, find the product of the maximum product subarray. Expected Time complexity is O(n) and only O(1) extra space can be used.

// Examples:

// Input: arr[] = {6, -3, -10, 0, 2}
// Output:   180  // The subarray is {6, -3, -10}

// Input: arr[] = {-1, -3, -10, 0, 60}
// Output:   60  // The subarray is {60}

// Input: arr[] = {-2, -40, 0, -2, -3}
// Output:   80  // The subarray is {-2, -40}

import java.util.Scanner;

public class max_multiple_of_a_subarray {
    static int maxSubarrayProduct(int arr[]) {
        int result = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int mul = arr[i];
            for (int j = i + 1; j < n; j++) {
                result = Math.max(result, mul);
                mul = mul * arr[j];
            }
            result = Math.max(result, mul);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { -3, 6, -10, 0, 2, 5, 0, 1, 2, 0, 3, 4 };
        System.out.println("Maximum Sub array product is "
                + maxSubarrayProduct(arr));
    }
}
