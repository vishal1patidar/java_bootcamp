// Steps to Find the Sum of Prime Numbers
// Read or initialize the lower and upper limit.
// Iterate a loop (for or while) to find the prime numbers between the given range.
// If the number is prime, add that number to the variable sum and print the result.
// Let's implement the above steps in a Java program.


import java.util.Scanner;
public class sumOfPrimeFactors {
    
    public static boolean prime(int num)
    {
        boolean result = true;

        for(int i = 2; i<num; i++)
        {   
            if(num%i == 0)
            {
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter the number to find sum of prime factors");
            int num = sc.nextInt();
            int sum = 0;
    
            for(int i = 2; i<=(num/2); i++)
            {
                if((num%i == 0) && (prime(i)==true))
                    sum += i;
            }
    
            System.out.println("The prime factors sum for "+num+ " = "+sum);

            System.out.println("Enter 0 to exit and any other number to continue");
            int temp = sc.nextInt();
            if(temp == 0)
                break;

        }
        sc.close();
    }
}