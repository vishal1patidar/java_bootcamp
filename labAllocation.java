// There are 3 labs in the CSE department(L1, L2, and L3) with a seating capacity of x, y, and z. One of the 3 labs has been allocated for ACE training. Out of the available labs, find the lab which has the minimal seating capacity.

// Input and Output Format:
// Assume that x, y, and z are always distinct.
// Refer sample input and output.

// All text in bold corresponds to the input and the rest corresponds to output.
// Sample Input and Output 1:
// Enter x
// 30
// Enter y
// 40
// Enter z
// 20
// Enter the lab allocated for ACE training
// L3
// L1 has the minimal seating capacity


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