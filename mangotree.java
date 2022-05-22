// Dora is very much interested in gardening and she decides to plant more trees in her garden.
//  She plants trees in the order of rows and columns. She numbered the trees in column wise
//   order. She planted the mango trees only in the second column from both first and last. 
//   But later when the trees grew up, she forgot where she planted mango trees. So help her 
//   find out whether the given tree number is a number of mango trees or not. Display whether
//    “It is a mango tree” or “It is not a mango tree”.

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