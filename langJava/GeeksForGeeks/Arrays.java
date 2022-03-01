package langJava.GeeksForGeeks;

public class Arrays {

    /**
     * T.C: O(N)
     * S.C: O(1)
     *
     * @param A
     * Input Array.
     */
    protected static void getFrequencyInSorted(int[] A) {
        int counter = 1;

        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[i-1]) {
                counter++;
            } else {
                // Found new element.
                System.out.println(A[i-1] + ": " + counter);
                counter = 1;
            }
        }

        // For last element.
        System.out.println(A[A.length - 1] + ": " + counter);
    }

    /**
     * T.C = O(N)
     * S.C = O(1)
     *
     * @param A input array.
     * @return max profit.
     */
    protected static int maxProfit(int[] A) {
        int buy = A[0], sell = 0, profit = 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] > A[i-1]) {
                // Keep looking for best selling price.
                sell = A[i];

                // Have reached the max end price.
                if (i == A.length - 1) {
                    profit += (sell-buy);
                }
            } else {
                profit += (sell-buy);
                buy = A[i]; // Made the profit now buy again.
            }
        }

        return profit;
    }

    /**
     * T.C: O(N)
     * S.C O(N)
     *
     * @param A input array
     * @return The water storing capacity.
     */
    public static int waterTrappingProblem(int[] A) {
        int store = 0;
        int[] lMax = new int[A.length];
        int[] rMax = new int[A.length];

        // Populate max Tower for each i from left.
        lMax[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            if (A[i] > lMax[i-1]) {
                lMax[i] = A[i];
            } else {
                lMax[i] = lMax[i-1];
            }
        }

        // Build rMax array.
        // Max for each tower from right.
        rMax[A.length - 1] = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] > rMax[i+1]) {
                rMax[i] = A[i];
            } else {
                rMax[i] = rMax[i+1];
            }
        }

        // Calculate the storage.
        // First and Last are edges and they obviously cannot trap water.
        for (int i  = 1; i < A.length - 1; i++) {
            if (lMax[i] < rMax[i])
                store = store + lMax[i] - A[i];
            else
                store = store + rMax[i] - A[i];
        }

        return store;
    }

    /**
     * T.C: (N)
     * S.C: O(1)
     *
     * @param A Input array/
     * @return max count of the consecutive 1s.
     */
    public static int maxConsecutive1s(int[] A) {
        int res = 0, counter = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] ==  1) {
                counter++;
                if (counter > res) {
                    res = counter;
                }
            } else {
                counter = 0;
            }
        }

        return res;
    }

    public static int maxSumSubArray(int[] A) {
        int sum = A[0], max = A[0];

        for (int i = 1; i < A.length; i++) {
            sum = sum + A[i];

            // This will happen in case of big negative numbers only.
            // As sum of positive numbers is always going to be greater than A[i
            if (sum < A[i]) {
                sum = A[i];
            }

            // Kadence Algorithm: Store sum or A[i] whatever is more.1

            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,3,4,5,6,6,7};
        getFrequencyInSorted(arr);

        int[] stocks = {30,20,10};
        System.out.println(maxProfit(stocks));

        int[] towers = {30,20,10,30};
        System.out.println(waterTrappingProblem(towers));

        int[] binaryArray = {1,1,1,1,1,0,1};
        System.out.println(maxConsecutive1s(binaryArray));

        int[] maxSubArraySet = {-1,-6,-8};
        System.out.println(maxSumSubArray(maxSubArraySet));
    }
}
