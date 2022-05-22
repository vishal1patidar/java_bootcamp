// Given an integer ‘x’, write a C function that returns true if binary representation of x is
// palindrome else return false.
// For example a numbers with binary representation as 10..01 is palindrome and number with 
//binary representation as 10..00 is not palindrome.
// The idea is similar to checking a string is palindrome or not. We start from leftmost and
// rightmost bits and compare bits one by one. If we find a mismatch, then return false. 

// Recommended Practice
// Palindrome Numbers
// Try It!

// Algorithm: 
// isPalindrome(x) 
// 1) Find number of bits in x using sizeof() operator. 
// 2) Initialize left and right positions as 1 and n respectively. 
// 3) Do following while left ‘l’ is smaller than right ‘r’. 
// ..…..a) If bit at position ‘l’ is not same as bit at position ‘r’, then return false. 
// ..…..b) Increment ‘l’ and decrement ‘r’, i.e., do l++ and r–-. 
// 4) If we reach here, it means we didn’t find a mismatching bit.
// To find the bit at a given position, we can use the idea similar to this post. 
//The expression “x & (1 << (k-1))” gives us non-zero value if bit at k’th position from 
//right is set and gives a zero value if if k’th bit is not set.


class binary_plaindrome
{
 
    // This function returns true if k'th bit in x
    // is set (or 1). For example if x (0010) is 2
    // and k is 2, then it returns true
    static int isKthBitSet(long x, long k)
    {
        int rslt = ((x & (1 << (k - 1))) != 0) ? 1 : 0;
        return rslt;
    }
     
    // This function returns true if binary
    // representation of x is palindrome.
    // For example (1000...001) is palindrome
    static int isPalindrome( long x)
    {
        long l = 1; // Initialize left position
        long r = (Integer.SIZE/8 )* 8; // initialize right position
     
        // One by one compare bits
        while (l < r)
        {
            if (isKthBitSet(x, l) != isKthBitSet(x, r))
            {
                return 0;
            }
            l++; r--;
        }
        return 1;
    }
     
    public static void main (String[] args)
    {
        long x = 1 << 15 + 1 << 16 ;
        System.out.println(isPalindrome(x));
         
        x = (1 << 31) + 1 ;
        System.out.println(isPalindrome(x));
    }
}
 