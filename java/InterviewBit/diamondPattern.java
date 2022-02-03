package InterviewBit;

import java.util.Scanner;

public class diamondPattern {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        // Upside of diamond.
        while (row <= n) {
            for (int i = row; i < n; i++) {
                System.out.print(" ");
            }
            for (int i = 1; i < 2*row; i++) {
                System.out.print("*");
            }
            row++;
            System.out.println();
        }
        row -= 2;
        // Downside of diamond.
        while (row > 0) {
            for (int i = n; i > row; i--) {
                System.out.print(" ");
            }
            for (int i = 1; i < 2*row; i++) {
                System.out.print("*");
            }
            System.out.println();
            row--;
        }
    }
}
