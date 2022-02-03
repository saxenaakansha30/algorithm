package InterviewBit;

import java.util.Scanner;

public class toUppercase {

    public static String toUppercase(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            int lowercaseChar = (int)chars[i] - 32;
            chars[i] = (char)(lowercaseChar);
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lowercase = sc.next();
        String toUppercase = toUppercase(lowercase);
        System.out.println(toUppercase);
    }
}
