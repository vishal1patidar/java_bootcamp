// A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte. 
// Given a byte, swap the two nibbles in it. For example 100 is be represented as 01100100 in a byte (or 8 bits). The two nibbles are (0110) and (0100).
// If we swap the two nibbles, we get 01000110 which is 70 in decimal.
 

// Recommended Practice
// Swap Two Nibbles In A Byte
// Try It!

// To swap the nibbles, we can use bitwise &, bitwise ” operators. 
//A byte can be represented using a unsigned char in C as size of char is 1 byte in a typical C compiler. 

// Explanation: 
// 100 is 01100100 in binary. The operation can be split mainly in two parts 
// 1) The expression “x & 0x0F” gives us last 4 bits of x. For x = 100, the result is 00000100. Using bitwise ‘<<‘ operator, we shift the last four bits to the left 4 times and make the new last four bits as 0. The result after shift is 01000000.
// 2) The expression “x & 0xF0” gives us first four bits of x. For x = 100, the result is 01100000. Using bitwise ‘>>’ operator, we shift the digit to the right 4 times and make the first four bits as 0. The result after shift is 00000110.
// At the end we use the bitwise OR ‘|’ operation of the two expressions explained above. The OR operator places first nibble to the end and last nibble to first. For x = 100, the value of (01000000) OR (00000110) gives the result 01000110 which is equal to 70 in decimal.
// This article is contributed by Anuj Garg. Please write comments if you find anything incorrect, or you want to share more information about the topic discussed above

// Another Approach:

// Using binary instead of hexadecimal values. It is much clearer to beginners.

// Step 1: Take & of 00001111 with number to get right nibble i.e. 0b00001111 & N

// Step 2: Take & of 11110000 with number to get left nibble i.e. 0b11110000 & N

// Step 3: Left shift the right nibble obtained in step 1 by 4 positions to get it as left nibble in the final answer i.e. <<4

// Step 4: Right shift the left nibble obtained in step 2 by 4 positions to get it as right nibble in final answer >>4

// Step 5: Do or( | ) operation between values obtained in step 3 & 4 to get the answer


 

class swap_two_nibbles {
     
  static int swapNibbles(int x)
  {
      return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
  }
   
  // Driver code
  public static void main(String arg[])
  {
      int x = 100;
      System.out.print(swapNibbles(x));
  }
  }