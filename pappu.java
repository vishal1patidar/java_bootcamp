import java.lang.Math;
import java.util.Scanner;

public class pappu {

    public static int maxReturn(int n) {

        int copy = n;
        int newNum = 0;

        int p = 0;
        while (copy > 0) {
            int lastDig = copy % 10;
            if (lastDig == 6)
                lastDig = 9;
            newNum = lastDig * (int) (Math.pow(10, p++)) + newNum;
            copy = copy / 10;
        }
        return (newNum - n);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of T");
        int T = sc.nextInt();
        int result[] = new int[T];

        for (int i = 0; i < T; i++) {
            int num = sc.nextInt();
            result[i] = maxReturn(num);
        }

        for (int i = 0; i < T; i++) {
            System.out.println(result[i]);
        }

        sc.close();

    }
}