package langJava.InterviewBit;

import java.util.Arrays;

public class Matrix {
    
    public static int[][] diagonal(int[][] A) {
        int[][] res = new int[A.length+1][A.length];

        // From row starting anti-diagonals
        for (int i = 0; i < A.length; i++) {
            int row = 0;
            int col = i;
            int j = 0;
            while ((row < A.length) && (col >= 0)) {
                res[i][j] = A[row][col];
                col--;
                row++;

                // For the address of res array.
                j++;
            }
        }

        return res;
    }

    public static int[][] generateMatrix(int A) {
        int count = 0;
        int[][] matrix = new int[A][A];

        for (int spiral = 0; spiral <= A/2; spiral++) {
            int row = 0, col = 0;

            // For top spiral.
            row = spiral;
            for (col = spiral; col < A - spiral; col++) {
                matrix[row][col] = ++count;
            }

            // For right ending of spiral.
            col = A - 1 - spiral;
            for (row = spiral + 1; row < A - spiral; row++) {
                matrix[row][col] = ++count;
            }

            // For bottom of spiral.
            row = A - 1 - spiral;
            for (col = A - 1 - spiral - 1; col >= spiral; col--) {
                matrix[row][col] = ++count;
            }

            // For left of spiral.
            col = spiral;
            for (row = A - 1 - spiral - 1; row > spiral; row--) {
                matrix[row][col] = ++count;
            }
        }

        return matrix;
    }

    public static void main(String[] args) {
//        int[][] arr = new int[3][3];
        int[][] arr = {{1,2,3,}, {4,5,6}, {6,7,8}};

        int[][] res = generateMatrix(1);
        
        for (int[] row:
             res) {
            System.out.println(Arrays.toString(row));
        }

//        System.out.println(Arrays.toString(generateMatrix(4)));

    }
}
