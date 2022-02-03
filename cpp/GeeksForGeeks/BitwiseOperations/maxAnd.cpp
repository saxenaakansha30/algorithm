//
//  maxAnd.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 24/11/21.
//

#include <stdio.h>
#include <iostream>
using namespace std;

class Solution {
public:

    // Function to check if element of array matches the passed bit pattern.
    int getMSB(int n) {
        if (n<=0) {
            return 0;
        }
        while ((n&(n-1)) != 0) {
            n = n&(n-1);
        }
        return n;
    }

    // Function to check if element of array matches the passed bit pattern.
    bool pairWithPatternExist(int arr[], int pattern = 0, int n = 0) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ((pattern & arr[i]) == pattern) {
                count++;
            }
            
            // Since we are looking for pair of two numbers.
            if (count == 2) {
                return true;
            }
        }
        return false;
    }
    
    int getMaxAnd(int arr[], int n) {
        int maxNumber, pattern = 0, msb;
        maxNumber = *max_element(arr, arr + n);
        if (maxNumber > 0) {
            msb = getMSB(maxNumber);
            while (msb > 0) {
                if (pairWithPatternExist(arr, pattern|msb, n) == true) {
                    pattern = pattern|msb;
                }
                // To check next bit from right.
                msb >>= 1;
            }
        }

        return pattern;
    }
};

int main() {
//    int arr[] = {4,8,12,14}, N=4;
    int arr[] = {4,8,6,2}, N=4;
    Solution obj;
    cout<<obj.getMaxAnd(arr, N)<<endl;
    return 0;
}
