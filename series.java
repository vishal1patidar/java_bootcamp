// 1.0, 2.0, 3.0, 6.0, 9.0, 18.0, 27.0, 54.0, 81.0,

import java.util.*;
public class series {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        double odd = 1;
        double even = 2;

        for(int i = 1; i<=n; i++)
        {
            if(i%2!=0){
                System.out.print(odd+ ", ");
                odd*=3;
            }
            else
            {
                System.out.print(even+ ", ");
                even*=3;
            }
        }
    }
}