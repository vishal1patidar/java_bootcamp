import java.util.Scanner;

public class max_multiple_of_a_subarray {
    static int maxSubarrayProduct(int arr[]) {
        int result = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int mul = arr[i];
            for (int j = i + 1; j < n; j++) {
                result = Math.max(result, mul);
                mul = mul * arr[j];
            }
            result = Math.max(result, mul);
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { -3, 6, -10, 0, 2, 5, 0, 1, 2, 0, 3, 4 };
        System.out.println("Maximum Sub array product is "
                + maxSubarrayProduct(arr));
    }
}
