package InterviewBit;

import java.util.Scanner;

public class trimFromEnd {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String trunctedString =  solve(s);
        System.out.println(trunctedString);
    }
}
