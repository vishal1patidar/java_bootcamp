// Given the integer N, the task is to print all the numbers less than N, which are divisible by 3 and 5.
// Examples : 
 

// Input : 50
// Output : 0 15 30 45 

// Input : 100
// Output : 0 15 30 45 60 75 90 

import java.util.Scanner;

class sumNumberDivisible {

    static void result(int N) {
        for (int num = 0; num < N; num++) {
            if (num % 3 == 0 && num % 5 == 0)
                System.out.print(num + " ");
        }

    }

    public static void main(String[] args) {

        System.out.println("enter a number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(N);
        System.out.println("The sum is =" + Integer.sum(N));
        result(N);
        sc.close();

    }
}