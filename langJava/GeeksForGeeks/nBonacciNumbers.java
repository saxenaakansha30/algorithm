package langJava.GeeksForGeeks;

import java.util.Arrays;

public class nBonacciNumbers {

    public static int[] getNBonacciSeries(int k, int m) {
        int[] A = new int[m];

        // For upto K.
        for (int i = 0; i < k-1; i++) {
            A[i] = 0;
        }
        A[k-1] = 1;

        // Generate rest of the numbers.
        int sum = 1;
        for (int i = k; i < m; i++) {
            A[i] = sum;
            sum = sum + A[i] - A[i-k];
        }

        return A;
    }

    public static void main(String[] args) {
        int[] arr = getNBonacciSeries(2, 10);

        System.out.println(Arrays.toString(arr));
    }
}
