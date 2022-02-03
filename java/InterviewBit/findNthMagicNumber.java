package InterviewBit;

import java.util.Scanner;

public class findNthMagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Variable declarations for the logic.
        // Idea is to check th enumber by converting it to its binary form and
        // with base 5 or whatever and then calculate it's respective base 5
        // (etc) decimal form.
        int degree = 1, res = 0;
        while (n > 0) {
            degree = degree*5;
            if ((n&1) == 1) {
                // Last digit is set to 1.
                res = degree + res;
            }
            n = n>>1; // Right shift by 1 to divide by base (5).
        }
        System.out.println(res);
    }
}
