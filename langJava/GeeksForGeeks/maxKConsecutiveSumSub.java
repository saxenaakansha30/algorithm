package langJava.GeeksForGeeks;

public class maxKConsecutiveSumSub {

    /**
     * T.C: O(N)
     * S.C: O(1)
     *
     * @param A Input array.
     * @param k MAx sum.
     * @return
     */
    public static int getMaxKConsecutiveSum(int[] A, int k) {
        int sum = A[0];

        // First pair sum from left.
        for (int i = 1; i < k; i++) {
            sum = sum + A[i];
        }

        // NOw sum for next K consecutives sub array.
        int max_sum = sum;
        for (int i = 0; i < A.length - 1 - k; i++) {
            sum = sum + A[i + k] - A[i];

            if (sum > max_sum) {
                max_sum = sum;
            }
        }

        return max_sum;
    }

    /**
     * T.C: O(N)
     * S.C: O(1)
     *
     * @param A Input array.
     * @param k True if passed sum exist..
     * @return
     */
    public static boolean maxKConsecutiveSubArraySumExist(int[] A, int k, int target) {
        int sum = A[0];

        // First pair sum from left.
        for (int i = 1; i < k; i++) {
            sum = sum + A[i];
        }

        // NOw sum for next K consecutives sub array.
        int max_sum = sum;
        for (int i = 0; i < A.length - 1 - k; i++) {
            sum = sum + A[i + k] - A[i];

            if (sum == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,8,30,-5,20,7};

        System.out.println(getMaxKConsecutiveSum(arr, 3));

        System.out.println(maxKConsecutiveSubArraySumExist(arr,3,44));
    }
}
