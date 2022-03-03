package langJava.GeeksForGeeks;

public class majorityElement {

    /**
     * T.C O(N)
     * S.C: O(1)
     *
     * @param A Input array.
     * @return Index of majority element.
     */
    public static int getMajorityElementIndex(int[] A) {
        int maj = 0; // Assuming 1st element is majority.
        int counter = 1; // The count of the majority element.

        // Get element index with max the occurance.
        for (int i = 1; i < A.length; i++) {
            if (A[i] == A[maj]) {
                counter++;
            } else {
                counter --;
            }

            if (counter == 0) {
                maj = i;
                counter = 1;
            }
        }

        // Check if the maj is actually occurance more than n/2.
        counter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == A[maj]) {
                counter++;
            }
        }

        if (counter > A.length/2) {
            return maj;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {8,4,5,8,8};

        System.out.println(getMajorityElementIndex(arr));
    }
}
