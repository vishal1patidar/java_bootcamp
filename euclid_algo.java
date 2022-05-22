// // Simple Java program to find GCD (Greatest Common Divisor) or GCF  (Greatest Common Factor) 
// or HCF (Highest common factor). The GCD of two numbers is the largest positive integer that divides
//  both the numbers fully i.e. without any remainder. There are multiple methods to find GCD, GDF, or 
//  HCF of two numbers but  Euclid's algorithm is very popular and easy to understand, of course, only
//   if you understand how recursion works. Euclid's algorithm is an efficient way to find the GCD of 
//   two numbers and it's pretty easy to implement using recursion in the Java program. According to 
//   Euclid's method GCD of two numbers, a, b is equal to GCD(b, a mod b) and GCD(a, 0) = a.





// Java Program to calculate GCD of two numbers
// /**
//  * Java program to demonstrate How to find Greatest Common Divisor or GCD of 
//  * two numbers using Euclid’s method. There are other methods as well to 
//  * find GCD of two number in Java but this example of finding GCD of two number
//  * is most simple.
//  *
//  */



import java.io.*;
import java.util.Scanner;
public class euclid_algo {
  
    public static void main(String args[]){
     
        //Enter two number whose GCD needs to be calculated.      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number to find GCD");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number to find GCD");
        int number2 = scanner.nextInt();
      
        System.out.println("GCD of two numbers " + number1 +" and " 
                           + number2 +" is :" + findGCD(number1,number2));
      
      
    }

    /*
     * Java method to find GCD of two number using Euclid's method
     * @return GDC of two numbers in Java
     */
    private static int findGCD(int number1, int number2) {
        //base case
        if(number2 == 0){
            return number1;
        }
        return findGCD(number2, number1%number2);
    }
  
}


