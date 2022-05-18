import java.util.Scanner;
public class labAllocation {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int l1 = sc.nextInt();
        int l2 = sc.nextInt();
        int l3 = sc.nextInt();
        int n = sc.nextInt();

        sc.close();

        int labs = 0;

        if(n<=l1)
        {
            if(n<=l2)
            {
                if(n<=l3)
                    labs += 3;
                else
                    labs +=2;
            }
            else
                labs++;
        }

        System.out.println("The number of labs allocated = "+ labs);

    }

}