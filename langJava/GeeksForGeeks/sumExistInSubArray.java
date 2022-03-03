package langJava.GeeksForGeeks;

public class sumExistInSubArray {

    /**
     * T.C: O(N)
     * S.C: O(1)
     *
     * @param A Non-negative integer's input array.
     * @param target Given sum.
     */
    public static void sumExistInSubArraySorted(int[] A, int target) {
        int sum = 0 , start = 0;
        for (int i = 0; i < A.length; i ++) {
            sum = sum + A[i];

            // Clean previous
            while (sum > target) {
                sum = sum - A[start];
                start++;
            }

            if (sum == target) {
                // Print start and i.
                System.out.println("From: " + start + " to " + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 6, 20, 1, 10, 1};

        sumExistInSubArraySorted(arr, 1);
    }
}
