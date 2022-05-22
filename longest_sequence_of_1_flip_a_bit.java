// Find longest sequence of 1’s in binary representation with one flip
// Difficulty Level : Hard
// Last Updated : 21 May, 2021
// Give an integer n. We can flip exactly one bit. Write code to find the length of the longest sequence of 1 s you could create. 

// Examples: 

// Input : 1775         
// Output : 8 
// Binary representation of 1775 is 11011101111.
// After flipping the highlighted bit, we get 
// consecutive 8 bits. 11011111111.

// Input : 12         
// Output : 3 

// Input : 15
// Output : 5

// Input : 71
// Output: 4

// Binary representation of 71 is 1000111.
// After flipping the highlighted bit, we get 
// consecutive 4 bits. 1001111. 



class longest_sequence_of_1_flip_a_bit
{
 
    static int flipBit(int a)
    {
        /* If all bits are l, binary representation
        of 'a' has all 1s */
        if (~a == 0)
        {
            return 8 * sizeof();
        }
 
        int currLen = 0, prevLen = 0, maxLen = 0;
        while (a != 0)
        {
            // If Current bit is a 1
            // then increment currLen++
            if ((a & 1) == 1)
            {
                currLen++;
            }
             
            // If Current bit is a 0 then
            // check next bit of a
            else if ((a & 1) == 0)
            {
                /* Update prevLen to 0 (if next bit is 0)
                or currLen (if next bit is 1). */
                prevLen = (a & 2) == 0 ? 0 : currLen;
 
                // If two consecutively bits are 0
                // then currLen also will be 0.
                currLen = 0;
            }
 
            // Update maxLen if required
            maxLen = Math.max(prevLen + currLen, maxLen);
 
            // Remove last bit (Right shift)
            a >>= 1;
        }
 
        // We can always have a sequence of
        // at least one 1, this is flipped bit
        return maxLen + 1;
    }
 
    static byte sizeof()
    {
        byte sizeOfInteger = 8;
        return sizeOfInteger;
    }
     
    public static void main(String[] args)
    {
        // input 1
        System.out.println(flipBit(13));
 
        // input 2
        System.out.println(flipBit(1775));
 
        // input 3
        System.out.println(flipBit(15));
    }
}