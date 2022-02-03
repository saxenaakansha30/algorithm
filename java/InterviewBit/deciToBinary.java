package InterviewBit;

import java.util.Scanner;

public class deciToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long res = 0, base = 1;
        while(n>0) {
            res = res + (n%10)*base;
            n = n/10;
            base = base*2;
        }
        System.out.println(res);
    }
}
