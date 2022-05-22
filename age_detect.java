 import java.util.Scanner;
public class age_detect {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Birth Year in two digits.");
        int b = sc.nextInt();
        System.out.println("Enter the Current Year in two digits.");
        int c = sc.nextInt();
        sc.close();

        int age;
        
        if(b>=1 && b<=99 && c>=1 && c<=99)
        {
            if(c>=b)
                age = c-b;
            else
                age = (100-b)+c;
            
            System.out.println("The age of the person = "+age);
        }
        else
            System.out.println("Invalid Input !!");

    }
} 
    
