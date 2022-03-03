package langJava.GeeksForGeeks;

public class prefixSum {

    /**
     * T.C: O(n)
     * S.C: O(n)
     * @param A input array.
     * @param Q set of queries.
     */
    public static void getQuerySetSome(int[] A, int[][] Q) {
        int[] sum = new int[A.length];

        sum[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            sum[i] = sum[i-1] + A[i];
        }

        for (int i = 0; i < Q.length; i++) {
            int[] set = Q[i];
            if (set[0] == 0) {
                System.out.println(sum[set[1]]);
            } else {
                System.out.println(sum[set[1]] - sum[set[0] - 1]);
            }
        }
    }

    /**
     * T.C: O(n)
     * S.C: O(n)
     * @param A Input array.
     * @return Index.
     */
    public static int equilibriumIndex(int[] A) {
        int res = -1;
        int[] PS = new int[A.length];

        // Build PS.
        PS[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            PS[i] = PS[i-1] + A[i];
        }

        for (int i = 0; i < A.length; i++) {
            int sumLeftSide = 0;
            int sumRightSide = 0;

            if (i > 0) {
                sumLeftSide = PS[i-1];
            }
            if (i < A.length - 1) {
                sumRightSide = PS[A.length - 1] - PS[i];
            }

            if (sumLeftSide == sumRightSide) {
                res = i;
                break;
            }
        }

        return res;
    }

    /**
     * T.C: O(N)
     * S.C: O(1)
     *
     * @param A Input array.
     * @return Index
     */
    public static int equilibriumOptimized(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }

        int sumL = 0;
        for (int i = 0; i < A.length; i++) {
            int sumR = sum - (sumL + A[i]);

            if (sumL == sumR) {
                return i;
            }

            sumL = sumL + A[i];
        }

        return -1;
    }

    public static void main(String[] args) {
//        int[] arr = {2,8,3,9,6,5,4};
//        int[][] Q = {{0,2},{1,3}};

//        getQuerySetSome(arr, Q);

        int[] equiSet = {3,4,8,-9,20,6};
        System.out.println(equilibriumIndex(equiSet));
        System.out.println(equilibriumOptimized(equiSet));
    }
}
