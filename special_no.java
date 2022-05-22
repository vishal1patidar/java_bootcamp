// The digits of the number are: 1, 4, 5

// Factorial of digits:

// !1 = 1

// !4 = 4*3*2*1 = 24

// !5 = 5*4*3*2*1 = 120

// Sum of factorial of digits = 1 + 24 + 120 = 145

// Compare the sum of the factorial of digits with the given number, i.e. 145 = 145. We observe that both are equal.

// Hence, the given number 145 is a special number.

// import java.util.Scanner;
import java.util.Scanner;
public class special_no {
    public static void main(String args[]) {
        int num, number, last_digit, sum_Of_Fact = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = sc.nextInt();
        num = number;
        while (number > 0) {
            last_digit = number % 10;
            int fact = 1;
            for (int i = 1; i <= last_digit; i++) {
                fact = fact * i;
            }
            sum_Of_Fact = sum_Of_Fact + fact;
            number = number / 10;
        }
        if (num == sum_Of_Fact) {
            System.out.println(num + " is a special number.");
        } else {
            System.out.println(num + " is not a special number.");
        }
    }
}






// one more special no 
// like 19 
// 1+9=10
// 1*9=9
// and add both 10+9=19 is a special no 



// import java.util.Scanner;

// public class special_no {
//     public static void main(String args[]) {
//         int r, n, num, res;
//         int sum =0 ,mul = 1;
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         n = sc.nextInt();
//         num = n;
//         while (num > 0) {
//             r = num % 10;
//             mul = mul * r;
//             sum = sum +r;
//             num = num / 10;
//         }
//         res =mul+sum;
//         if(res == n){
//             System.out.println("it is special no"+res);
//         }
//         else{
//             System.out.println("it is not a special no"+res);
//         }

//     }
// }
