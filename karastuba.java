// Given two numbers X and Y, calculate their multiplication using the Karatsuba Algorithm.
// Input: X = “1234”, Y = “2345”
// Output: Multiplication of x and y is 28,93,730.

// Naive Method
// The naive method is to follow the elementary school multiplication method, i.e. to multiply 
// each digit of the second number with every digit of the first number and then add all the multiplication
//  results.

public class karastuba {
    public static void main(String args[]) {
      System.out.println(multiplication(12, 5));
    }
  
    public static int multiplication(int X, int Y) {
      // Convert numbers into string
      String x = Integer.toString(X);
      String y = Integer.toString(Y);
      int result = 0;
  
      // Looping over y
      for (int i = 0; i < y.length(); i++) {
        int carry = 0; // intermediate carry
        String inter_res = ""; // intermediate result
  
        // Looping over x.
        for (int j = x.length() - 1; j >= 0; j--) {
          // intermediate multiplication of each digit and addition of carry.
          int num = Character.getNumericValue(y.charAt(i)) * Character.getNumericValue(x.charAt(j)) + carry;
          // if intermediate multiplication is of two digits and j>0
          // then second digit is appended to intermediate result
          // and first digit is stored as carry
          if (num > 9 && j > 0) {
            inter_res = Integer.toString(num % 10) + inter_res;
            carry = num / 10;
          }
          // else the digit is append to intermediate result
          // And assign carry as zero
          else {
            inter_res = Integer.toString(num) + inter_res;
            carry = 0;
          }
        }
        // Adding the intermediate results
        result *= 10;
  
        result += Integer.parseInt(inter_res);
      }
      return result;
    }
  }