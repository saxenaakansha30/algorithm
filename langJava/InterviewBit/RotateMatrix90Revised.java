package langJava.InterviewBit;

import java.util.Arrays;

public class RotateMatrix90Revised {

    public static void rotate90(int[][] a) {
        int n = a.length;
        for (int row = 0; row < n/2; row++) {
            // For cycle count.
            for (int cycle = 0; cycle < n-1-2*row; cycle++) {
                int temp = a[n-1-row][cycle+row];
                a[n-1-row][cycle+row] = a[n-1-cycle-row][n-1-row];
                a[n-1-cycle-row][n-1-row] = a[row][n-1-cycle-row];
                a[row][n-1-cycle-row] = a[cycle+row][row];
                a[cycle+row][row] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
//        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
//        int[][] arr = {{1,2}, {3,4}};
        for (int[] x:arr) {
            System.out.println(Arrays.toString(x));
        }

        rotate90(arr);
        System.out.println("*********OutPut**********");

        for (int[] x:arr) {
            System.out.println(Arrays.toString(x));
        }
    }
}
