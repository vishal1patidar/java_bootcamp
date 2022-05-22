// Given a number n, find length of the longest consecutive 1s in its binary representation.
// Examples : 

// Input : n = 14
// Output : 3
// The binary representation of 14 is 1110.

// Input : n = 222
// Output : 4
// The binary representation of 222 is 11011110.


class longest_consicutive_one
{
    private static int maxConsecutiveOnes(int x)
    {
        int count = 0;
        System.out.println("your ones are in a binary no "); 
        while (x!=0)
        {
            x = (x & (x << 1)); 
            count++;
        }
      
        return count;
    }
 
    public static void main(String strings[])
    {
        System.out.println(maxConsecutiveOnes(222));  //(11011110)₂
    }
}