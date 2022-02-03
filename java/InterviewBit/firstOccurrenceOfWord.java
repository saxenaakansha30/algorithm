package InterviewBit;

public class firstOccurrenceOfWord {
    public static int solve(String A, String B) {
        int from = 0, i = 0;

        while (from < A.length()) {
            if (B.charAt(i) == A.charAt(from)) {
                i = i+1;
                int to = from + 1;

                // if B has only 1 char.
                if (i == B.length()) {
                    // Found thevfirst match.
                    return from + 1; // Since we are taking index from 0 not 1.
                }

                // Start comparing next char.
                // Loop till next char are same.
                while (B.charAt(i) == A.charAt(to)) {
                    i = i+1;
                    to = to + 1;
                    if (i == B.length()) {
                        // Found thevfirst match.
                        return from + 1; // Since we are taking index from 0 not 1.
                    }
                }
                // It was not a match.
                // Restart again.
                i = 0;
                from = to;
            } else {
               from = from+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String s1 = "Let us solve this problem";
        String s2 = "solve that problem";
        int charAt = solve(s1, s2);
        System.out.println(charAt);
    }
}
