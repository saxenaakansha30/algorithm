package langJava.LeetCode;

import java.util.Scanner;

public class squareRoot {
    public static int mySqrt(int x) {
        int s = 1, e = x/2;

        // Handle case of 1 as separe and alll will fall under x/2 case.
        if (x == 1) {
            return 1;
        }

        while (s<=e) {
            int m = (s+e)/2;
            long temp = (long)m*m;
            if (m == x) {
                return m;
            } else if (x < temp) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return e;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you wish to know the square root of: ");
        int n = sc.nextInt();
        System.out.println(mySqrt(n));
    }
}
