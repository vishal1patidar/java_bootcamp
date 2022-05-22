// Chinese Remainder Theorem | Set 1 (Introduction)
// Difficulty Level : Easy
// Last Updated : 23 Aug, 2021
// We are given two arrays num[0..k-1] and rem[0..k-1]. In num[0..k-1], every pair is coprime 
//(gcd for every pair is 1). We need to find minimum positive number x such that: 

//      x % num[0]    =  rem[0], 
//      x % num[1]    =  rem[1], 
//      .......................
//      x % num[k-1]  =  rem[k-1] 
// Basically, we are given k numbers which are pairwise coprime, and given remainders 
//of these numbers when an unknown number x is divided by them. We need to find the minimum
// possible value of x that produces given remainders.
// Examples : 
 

// Input:  num[] = {5, 7}, rem[] = {1, 3}
// Output: 31
// Explanation: 
// 31 is the smallest number such that:
//   (1) When we divide it by 5, we get remainder 1. 
//   (2) When we divide it by 7, we get remainder 3.

// Input:  num[] = {3, 4, 5}, rem[] = {2, 3, 1}
// Output: 11
// Explanation: 
// 11 is the smallest number such that:
//   (1) When we divide it by 3, we get remainder 2. 
//   (2) When we divide it by 4, we get remainder 3.
//   (3) When we divide it by 5, we get remainder 1.
// Chinese Remainder Theorem states that there always exists an x that satisfies given 
//congruences.

import java.io.*;
 
class remainder_theoram {
     
    // k is size of num[] and rem[].  Returns the smallest
    // number x such that:
    //  x % num[0] = rem[0],
    //  x % num[1] = rem[1],
    //  ..................
    //  x % num[k-2] = rem[k-1]
    // Assumption: Numbers in num[] are pairwise coprime
    // (gcd for every pair is 1)
    static int findMinX(int num[], int rem[], int k)
    {
        int x = 1; // Initialize result
      
        // As per the Chinese remainder theorem,
        // this loop will always break.
        while (true)
        {
            // Check if remainder of x % num[j] is
            // rem[j] or not (for all j from 0 to k-1)
            int j;
            for (j=0; j<k; j++ )
                if (x%num[j] != rem[j])
                   break;
      
            // If all remainders matched, we found x
            if (j == k)
                return x;
      
            // Else try next number
            x++;
        }
      
    }
      
    // Driver method
    public static void main(String args[])
    {
        int num[] = {3, 4, 5};
        int rem[] = {2, 3, 1};
        int k = num.length;
        System.out.println("x is " + findMinX(num, rem, k));
    }
}
 