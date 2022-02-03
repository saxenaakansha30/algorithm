//
//  fibonacciSeries.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 27/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int getFibonacciNumber(int pos) {
        int i = 2, curr = 1, prev = 0, temp;
        if (pos == 0) {
            return 0;
        }
        
        if (pos == 1) {
            return curr;
        }
        
        while (i <= pos) {
            temp = curr;
            curr = curr + prev;
            prev = temp;
            i++;
        }
        return curr;
    }
    
    int getFibnocacciRecursive(int pos, int curr = 1, int prev = 0, int i = 1) {
        if (i == pos) {
            return curr;
        }
        
        if (pos == 0) {
            return 0;
        }
        
        if (pos == 1) {
            return curr;
        }
        
        return getFibnocacciRecursive(pos, curr + prev, curr, i+1);
    }

    int getFibnocacciRecursiveOptimized(int pos) {
        if (pos <= 1) {
            return pos;
        }
        return getFibnocacciRecursiveOptimized(pos - 1) + getFibnocacciRecursiveOptimized(pos - 2);
    }
};

int main() {
    Solution obj;
//    cout<<obj.getFibonacciNumber(4)<<endl;
    cout<<obj.getFibnocacciRecursiveOptimized(7)<<endl;
    return 0;
}
