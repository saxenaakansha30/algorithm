package langJava.InterviewBit;

import java.util.Arrays;

public class GeneralPractice {
    public static String solveOptimized(String A) {
        int s = 0, e = A.length() - 1;
        while (s<=e) {
            boolean flag = true;

            if (s<A.length() && A.charAt(s) == '*') {
                s++;
                flag = false;
            }

            if (e>=0 && A.charAt(e) == '*') {
                e--;
                flag = false;
            }

            if (flag) {
                break;
            }
        }

        if (s>e) { // Case of a string with all asterisk. So blank after trim.
            return A.substring(s,s);
        }

        return A.substring(s,e+1);
    }

    public static String solve(String A) {
        int start = 0, end = A.length()-1;

        // To trip from start.
        while (A.charAt(start) == '*') {
            start += 1;

            if (start == A.length()) {
                break;
            }
        }
        // To trim from end.
        while (end > 0 && A.charAt(end) == '*') {
            end -= 1;
        }

        // Empty string case.
        if (start>end) {
            return  A.substring(0, 0);
        }

        return A.substring(start, end+1);
    }

    public static void sortWeakestToStrongest() {
//        int[] arr = {6,5,6,8,6,1,3};
        int[] arr = {4,1,2};
        int[] s = new int[arr.length];
        int[] out = new int[arr.length];
        for (int row = 0; row < arr.length; row++) {
            int val = arr[row];
            s[row] = arr[row];
            int prev = row - 1;
            out[row] = row;
            while (prev >= 0) {
                if (val < s[prev]) {
                    // Swap. // Problem is here.....
//                    out[j + 1] = out[j];
                    // curr = row
                    // prev = j;
                    int temp = out[prev+1];
                    out[prev+1] = out[prev];
                    out[prev] = temp;
//                    out[row] = j;
//                    out[j] = row;
                }
                prev--;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(out));


//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                // If previous is greater then move forward.
//                if (arr[j] > arr[i]) {
//                    // swap.
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }

//        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
//        String A = "***********************************************************************************************************************************************************************************************************************";
//        long beforeRunningCode = System.currentTimeMillis();
//        System.out.println(solveOptimized(A));
//        long afterRunningCode = System.currentTimeMillis();
//        long timeTaken = afterRunningCode - beforeRunningCode;
//        System.out.println("Optimized Code ran in- " + timeTaken);
//
//        beforeRunningCode = System.currentTimeMillis();
//        System.out.println(solve(A));
//        afterRunningCode = System.currentTimeMillis();
//        timeTaken = afterRunningCode - beforeRunningCode;
//        System.out.println("Normal Code ran in- " + timeTaken);

        sortWeakestToStrongest();

    }
}
