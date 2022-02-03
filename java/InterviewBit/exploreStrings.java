package InterviewBit;

import java.util.Scanner;

public class exploreStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int count = 0;
        int s = 0, e = A.length()-1;
        while(s<e) {
            if (A.charAt(s) != A.charAt(e)) {
                count += 2;
            }
            s++;
            e--;
        }
        System.out.println(count);
    }
}
