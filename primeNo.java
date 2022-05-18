import java.util.*;
public class primeNo {
    
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        int i = 2, j, count;

        for(;i<=n;i++)
        {
            count = 0;
            for(j = 2;j<=(i/2);j++)
            {
                if(i%j==0)
                    count++;
            }
            if(count==0)
                System.out.println(i);
        }
    }

}