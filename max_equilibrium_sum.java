// Given an array arr[]. Find the maximum value of prefix sum which is also suffix sum for index i in arr[].

// Examples : 

// Input : arr[] = {-1, 2, 3, 0, 3, 2, -1}
// Output : 4
// Prefix sum of arr[0..3] = 
//             Suffix sum of arr[3..6]

// Input : arr[] = {-2, 5, 3, 1, 2, 6, -4, 2}
// Output : 7
// Prefix sum of arr[0..3] = 
//               Suffix sum of arr[3..7]
// A Simple Solution is to one by one check the given condition (prefix sum equal to suffix sum) 
// for every element and returns the element that satisfies the given condition with maximum value. 

import java.io.*;

class max_equilibrium_sum {

    static int findMaxSum(int[] arr, int n)

    {

        int res = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++)

        {

            int prefix_sum = arr[i];

            for (int j = 0; j < i; j++)

                prefix_sum += arr[j];

            int suffix_sum = arr[i];

            for (int j = n - 1; j > i; j--)

                suffix_sum += arr[j];

            if (prefix_sum == suffix_sum)

                res = Math.max(res, prefix_sum);

        }

        return res;

    }

    public static void main(String[] args)

    {

        int arr[] = { -2, 5, 3, 1, 2, 6, -4, 2 };

        int n = arr.length;

        System.out.println(findMaxSum(arr, n));

    }

}
