package langJava.InterviewBit;

import java.util.Arrays;

public class rotateMatrix {
    public static void rotate90(int[][] A) {
        int l = A.length;
        // Cycle to form for which rows.
        for (int row = 0; row < l/2; row++) {
            // Cycle to form for which columns under upper row.
            for (int col = row; col < l-1-row; col++) {
                // Cycle from backward.
                int temp = A[row][col];
                A[row][col] = A[l-1-col][row];
                A[l-1-col][row] = A[l-1-row][l-1-col];
                A[l-1-row][l-1-col] = A[col][l-1-row];
                A[col][l-1-row] = temp;
            }
        }
    }

    public static void main(String[] args) {
//        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        int[][] arr = {{1,2}, {3,4}};
        for (int[] x:arr) {
            System.out.println(Arrays.toString(x));
        }
        rotate90(arr);
        for (int[] x:arr) {
            System.out.println(Arrays.toString(x));
        }
    }
}
