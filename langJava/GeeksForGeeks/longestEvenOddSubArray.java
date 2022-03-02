package langJava.GeeksForGeeks;

public class longestEvenOddSubArray {

    /**
     * T.C: O(N)
     * S.C: O(1)
     *
     * @param A Input array.
     * @return Max Length of subarray with even-odd consecutive order.
     */
    public static int maxLengthEvenOdd(int[] A) {
        int counter = 1;
        int type = A[0]%2;
        int max = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i]%2 == type) { // Found same type consecutive.
                counter = 1; // Reset the counter.
            } else {
                counter++;
                type = A[i]%2;

                if (counter>max) {
                    max = counter;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] A = {1,2,3,4,8,5,7,6};

        System.out.println(maxLengthEvenOdd(A));
    }
}
