// Minimum number of Apples to be collected from trees to guarantee M red apples
// Difficulty Level : Easy
// Last Updated : 13 Aug, 2021
// There are different kinds of apple trees in the four directions (East, West, North, South),
// which may grow both red and green apples such that each tree grows exactly K apples,
// in the following manner:

// N – number of trees to the north do not have red apples.
// S – number of trees to the south do not have green apples.
// W – number of trees in the west have some red apples.
// E – number of trees in the east have some green apples.
// However, the colors of apples can not be distinguished outside the house. 
//So, the task is to find the minimum number of apples to be collected from the trees 
//to guarantee M red apples. If it is not possible, print -1.

// Examples:

// Input: M = 10, K = 15, N = 0, S = 1, W = 0, E = 0
// Output: 10
// Explanation: It simply gets 10 apples from the 1st south tree

// Input: M = 10, K = 15, N = 3, S = 0, W = 1, E = 0
// Output: -1
// Explanation: There are no red apples in the South, North and East. 
//But in the West there are atleast 1 red apple and total tree is 1, So, total no. 
//of guaranteed red apple is 1 * 1 = 1 which is less than M.


import java.io.*;
class alice_apple_tree {
 
// Function to minimum no. of apples
static int minApples(int M,int K,int N,int S,int W,int E)
{
   
    // If we get all required apple
    // from South
    if(M <= S * K)
        return M;
 
    // If we required trees at
    // East and West
    else if(M <= S * K + E + W)
        return S * K + (M-S * K) * K;
 
    // If we doesn't have enough
    // red apples
    else
        return -1;
}
 

public static void main(String[] args)
{
    // No. of red apple for gift
    int M = 10;
 
    // No. of red apple in each tree
    int K = 15;
 
    // No. of tree in North
    int N = 0;
 
    // No. of tree in South
    int S = 1;
 
    // No. of tree in West
    int W = 0;
 
    // No. of tree in East
    int E = 0;
 
    // Function Call
    int ans = minApples(M,K,N,S,W,E);
    System.out.println(ans);
}
}