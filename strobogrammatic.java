// A strobogrammatic number is a number whose numeral is rotationally symmetric, so that it appears the same 
//when rotated 180 degrees. In other words, the numeral looks the same right-side up and upside down (e.g., 69, 96, 1001). 
//A strobogrammatic prime is a strobogrammatic number that is also a prime number, i.e., a number that is only divisible 
//by one and itself (e.g., 11). It is a type of ambigram, words and numbers that retain their meaning when viewed from a different
// perspective, such as palindromes."
// The first few strobogrammatic numbers are:
// 0, 1, 8, 11, 69, 88, 96, 101, 111, 181, 609, 619, 689, 808, 818, 888,
// 906, 916, 986, 1001, 1111, 1691, 1881, 1961, 6009, 6119, 6699, 6889, 6969, 8008,
// 8118, 8698, 8888, 8968, 9006, 9116, 9696, 9886, 9966, ...



// // when number rotated 180 degrees, results in the same number.
import java.util.Scanner;
// import java.lang.Math;
public class strobogrammatic {

    public static boolean stobgramatic(int n){

        int copy = n, rev = 0, temp;
        while(copy>0){
            temp = copy%10;
            if(temp==0|| temp==1|| temp==8||temp==6 ||temp==9)
            {
                
                if(temp==6)
                {
                    rev = rev*10 + 9;
                }
                else if(temp==9)
                {
                    rev = rev*10 + 6;
                }
                else 
                    rev = rev*10 + temp;
            }
            else
            {
                return false;
            }
            copy/=10;
        }

        if(rev == n)
            return true;
        else
            return false;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the numbers:");
            int num = sc.nextInt();

            if(stobgramatic(num))
                System.out.println(num + " is a strobogrammatic number.");
            else
                System.out.println(num + " is a not a strobogrammatic number.");
            
            System.out.println("Enter 0 to exit and any other number to continue");
            int temp = sc.nextInt();
            if(temp == 0)
            {
                System.out.println("Program exited successfully");
                break;
            }
        }

        sc.close();
    }
}