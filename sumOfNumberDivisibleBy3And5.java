import java.util.Scanner;
public class sumOfNumberDivisibleBy3And5 {
    
    public static int SumNumbersDivisible(int m, int n){
        int sum = 0;
        for(int i = m; i<=n; i++)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the value of m and n");
            int m = sc.nextInt();
            int n = sc.nextInt();
    
            System.out.println("The sum of the numbers divisible by 3 & 5 between m and n = "+SumNumbersDivisible(m, n));

            System.out.println("Enter 0 to exit and any other number to check again");
            int exit = sc.nextInt();
            if(exit ==0)
                break;
        }
        sc.close();
    }
}