import java.util.Scanner;
class mangotree{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int r = sc.nextInt();
        System.out.println("Enter the number of column");
        int c = sc.nextInt();
        System.out.println("Enter the tree number");
        int t = sc.nextInt();

        sc.close();

        if(t>=1 && t<=(c*r))
        {
            if(t<=c || t%c==0 || t%c==1)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
        }
        else
            System.out.println("Invalid Input");
        
        
    }
}