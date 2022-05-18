// when number rotated 180 degrees, results in the same number.
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