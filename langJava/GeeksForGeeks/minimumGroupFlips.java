package langJava.GeeksForGeeks;

import java.util.Arrays;

public class minimumGroupFlips {

    /**
     *
     * @param A Input array.
     * @return Minimum flips required to make the array element same.
     */
    public static void printMinimumGroupFlips(int[] A) {
        int firstGroup = A[0];
        int start = -1;

        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i-1]) {
                // When no found different group.
                if (A[i] == firstGroup) {
                    int end = i - 1;
                    System.out.println("From: " + start + " to " + end);
                } else {
                    start = i;
                }
            }
        }

        // For last element.
        if (A[A.length - 1] != firstGroup) {
            int end = A.length - 1;
            System.out.println("From: " + start + " to " + end);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,0,1};

        printMinimumGroupFlips(arr);
    }
}
