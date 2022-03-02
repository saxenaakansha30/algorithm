package langJava.GeeksForGeeks;

import java.util.Arrays;

public class maxSumSubArrayCyclic {

    public static int getMaxSubArrayCyclic(int[] A) {
        int res = A[0];
        int[] sum = new int[A.length];
        int[] max_sum = new int[A.length];

        // Build sum and max_sum array/
        sum[0] = A[0];
        max_sum[0] = A[0];
        int temp = A[0];
        for (int i = 1; i < A.length; i++) {
            sum[i] = sum[i-1] + A[i];

            if (sum[i] > max_sum[i-1]) {
                max_sum[i] = sum[i];
            } else {
                max_sum[i] = max_sum[i-1];
            }

            // Kadance algorightm for getting max sub-array sum.
            temp = temp + A[i];
            if (temp < A[i]) {
                temp = A[i];
            }

            // Get Max upto n;
            if (temp > res) {
                res = temp;
            }
        }

        // Get sum of cyclic sub-arrays.
        for (int i = 2; i < A.length; i++) {
            int cyclic_sum = sum[A.length-1] - sum[i-1] + max_sum[i-2];

            if (cyclic_sum > res) {
                res = cyclic_sum;
            }
        }

        return res;
    }

    public static void main(String[] args) {
//        int[] arr = {2,3,-8,7,-1};
        int[] arr = {-6,-1,-8};

        System.out.println(getMaxSubArrayCyclic(arr));
    }
}
