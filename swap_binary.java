// Input:  761622921 (00101101011001010111000110001001)
 
// Output: 513454662 (00011110100110101011001001000110)
 
// Explanation: (Every pair of adjacent bits swapped)
 
// 00 10 11 01 01 10 01 01 01 11 00 01 10 00 10 01
// 00 01 11 10 10 01 10 10 10 11 00 10 01 00 01 10

import java.util.Scanner;
public class swap_binary
{
    public static void main(String[] args) 
    {
        int n, count = 0, a , b , m;
        String x = "";
        String y = "";
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first decimal number:");
        n = s.nextInt();
        System.out.print("Enter second decimal number:");
        m = s.nextInt();
        while(n > 0 || m>0)
        {
            a = n % 2;
            b = m % 2;
            if(a == 1 || b==1)
            {
                count++;
            }
            x = a + "" + x;
            y= b + "" + y;
            n = n / 2;
            m= m / 2;
        }
        System.out.println("Binary number:"+x);
        System.out.println("Binary number:"+y);
        System.out.println("No. of 1s:"+count);
    }
}