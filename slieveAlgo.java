import java.util.*;

public class slieveAlgo {

    // function to print all the prime numbers
    static void prime(ArrayList<Integer> arr) {

        System.out.println(arr);
        System.out.println();

        // Here the exit condition states, if there is only 1 left then print it and exit
        if(arr.size()==1)
        {
            System.out.print(arr.get(0)+" ");
            return;
        }
        else
        {
            // else we are taking the first element and find all its multiple in the arraylist
            // once found we delete it from the arraylist and once done with checking we print
            // the first element and delete it so that in next iteration the number at index 1 becomes
            // the first element and so on
            int firstElement = arr.get(0);

            for(int i = 1; i<arr.size(); i++)
            {
                if(arr.get(i)%firstElement==0)
                {
                    arr.remove(i);
                }
            }

            // after checking we print the number as prime and then we remove it.
            System.out.println(arr.get(0)+", ");
            arr.remove(0);

            // we perform recursion operation on it uptil exit condition.
            prime(arr);
        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number.");
        int num = sc.nextInt();

        sc.close();

        ArrayList<Integer> arr = new ArrayList<Integer>();

        // taking the number in array list and passing it to the prime function.
        for(int i = 1; i<=(num-1);i++)
        {
            arr.add(i+1);
        }
        prime(arr);
    }

}