package langJava.InterviewBit;

import java.util.Arrays;

public class ArrayExperiments {
    public static void getLargestElement(int[] a) {
        // O(n) complexity. Largest Element.
        int res = 0, largest = a[res];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
                res = i;
            }
        }

        System.out.println(res);
    }

    public static void getSecondLargestElement(int[] a) {
        // O(n) complexity. Largest Element.
        int l = 0, sl = -1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[l]) {
                sl = l;
                l = i;
            } else if (a[i] != a[l] && a[i] > a[sl]) {
                sl = i;
            }
            else if (a[i] != a[l] && sl == -1) {
                // Second largest is not set yet.
                sl = i;
            } else if (sl > -1 && a[i] > a[sl]) {
                sl = i;
            }
        }

        System.out.println(sl);
    }

    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i-1]) {
                return false;
            }
        }

        return true;
    }

    public static void reverseArray(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            int temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
        }
    }

    public static int removeDuplicatesInSorted(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            // Found the duplicate.
            if (a[i] == a[i-1]) {
                int dup = i;
                i = i - 1; // To stick to this number for further comparisions.

                // Move the duplicate to the last.
                while (a[dup] <= a[dup - 1]) {
                    // Swap dup with next number.
                    // Next element should come at duplicates position.
                    if (dup >= n-1) {
                        n -= 1;
                        break;
                    }

                    int temp = a[dup];
                    a[dup] = a[dup+1];
                    a[dup+1] = temp;

                    // Move until reaches last.
                    dup += 1;
                }
            }
        }

        return n;
    }

    public static int reverseOptimized(int[] a) {
        int pos = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != a[i-1]) {
                // Only when unique.
                a[pos] = a[i];
                pos++;
            }
        }

        return pos;
    }

    // Complexity is O(n).
    public static void moveZeroToEnd(int[] a) {
        int pos = -1; // zero'th position.
        for (int i =  0; i < a.length; i++) {
            if (a[i] == 0) {
                if (pos < 0) {
                    pos = i;
                }
            } else {
                if (pos >= 0) {
                    int temp = a[i];
                    a[i] = a[pos];
                    a[pos] = temp;
                    i = i - 1;
                    pos = -1;
                }
            }
        }
    }

    public static void leftShiftBy1(int[] a) {
        int temp = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i-1] = a[i];
        }
        a[a.length-1] = temp;
    }

    public static void leftShift(int[] a, int l) {
        int[] temp = new int[l];

        // For larger shift numbers.
        l = l%a.length;

        if (a.length - l >= l) {
            for (int i = 0; i < a.length - l; i++) {
                if (i < l) {
                    temp[i] = a[i];
                }

                a[i] = a[i+l];
            }
        } else {
            for (int i = 0; i < l; i++) {
                temp[i] = a[i];

                if (l+i < a.length) {
                    a[i] = a[l+i];
                }
            }
        }

        // Fill the remaining elements with temp stored array elements
        for (int i = 0; i < l; i++) {
            a[a.length - l + i] = temp[i];
        }
    }

    public static int countOddEven(int[] A) {
        int count = 0;
        int[] prefixSumOdd = new int[A.length];
        int[] prefixSumEven = new int[A.length];

        // Populate odd and even.
        prefixSumOdd[0] = 0;
        prefixSumEven[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            if (i%2 == 0) {
                prefixSumEven[i] = A[i] + prefixSumEven[i-1];
                prefixSumOdd[i] = prefixSumOdd[i-1];
            } else {
                // Odd index.
                prefixSumOdd[i] = A[i] + prefixSumOdd[i-1];
                prefixSumEven[i] = prefixSumEven[i-1];
            }
        }

        // Check for special number.
        // sumOdd = sumEven after removing ith element.
        for (int i = 0; i < A.length; i++) {
            int sumEven = 0, sumOdd = 0;

            if (i > 0) {
                sumEven = sumEven + prefixSumEven[i - 1];
                sumOdd = sumOdd + prefixSumOdd[i - 1];
            }
            sumEven = sumEven + (prefixSumOdd[A.length - 1] - prefixSumOdd[i]);
            sumOdd = sumOdd + (prefixSumEven[A.length - 1] - prefixSumEven[i]);

            if (sumEven == sumOdd) {
                count++;
            }
        }

        return count;
    }

    public static int[] getLeader(int[] A) {
        int[] res = new int[A.length];
        int counter = 0;
        int max = A[A.length - 1];

        res[counter] = max;
        for (int i = A.length - 2; i >= 0; i--) {
            if (A[i] > max) {
                System.out.println(counter);
                counter+=1;
                res[counter] = A[i];
                max = A[i];
            }
        }

        // Since out is array and we cannot know the size in advance so.
        int[] leaders = new int[counter+1];
        for (int i = 0; i <= counter; i++) {
            leaders[i] = res[i];
        }

        return leaders;
    }

    public static void main(String[] args) {
//        int[] a = {7,20,4,30,10};
//        int[] a = {8,5,0,10,0,0,20};
        int[] a = {1,2,3,5,4};

//        getLargestElement(a);

//        getSecondLargestElement(a);

//        System.out.println(isSorted(a));

//        reverseArray(a);
//        System.out.println(Arrays.toString(a));

//        int n = removeDuplicatesInSorted(a);
//        System.out.println(n);
//        System.out.println(Arrays.toString(a));

//        int n = reverseOptimized(a);
//        System.out.println(n);
//        System.out.println(Arrays.toString(a));

//        moveZeroToEnd(a);
//        System.out.println(Arrays.toString(a));


//        leftShiftBy1(a);
//        System.out.println(Arrays.toString(a));

//        leftShift(a, 3);
//        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(getLeader(a)));
    }
}
