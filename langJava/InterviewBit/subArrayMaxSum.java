package langJava.InterviewBit;

public class subArrayMaxSum {
    public static void main(String[] args) {
//        int[] a = {0,8,-3,-4,9};
//        int[] a = {0,-2,3,-8,5};
        int[] a = {-5,-4,-2,-6,-1};

        // Brute force/ Naive approach and O(n^2) time complexity.
        int out = a[0];
        for (int i = 0; i < a.length; i++) {
            int sum = a[i];
            for (int j = i+1; j < a.length; j++) {
                sum += a[j];
                if (sum > out) {
                    out = sum;
                }
            }
            // For last element.
            if (sum > out) {
                out = sum;
            }
        }

        System.out.println(out);

        // Better approach.
        int max_sum = a[0], sum = a[0];
        for (int i = 1; i < a.length; i++) {
            sum += a[i];

            if (a[i] > sum) {
                sum = a[i];
            }

            if (sum > max_sum) {
                max_sum = sum;
            }
        }

        System.out.println(max_sum);

    }
}
