package langJava.LeetCode;

import java.util.Scanner;

public class perfectSquare {
    public static boolean isPerfectSquare(int num) {
        int s = 2, e = num/2, out = 0;

        if (num == 1) {
            return true;
        }

        while (s <= e) {
            int m = s+(e-s)/2; // Cannot understand the logic for this.
            if (m <= num/m) {
                out = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        // The digit must be equal and should have any remainder.
        if (out == num/out && num%out == 0) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPerfectSquare(n));
    }
}
