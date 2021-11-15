//
//  find2OddOccuringNumbers.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 15/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    void getTwoOddOccuringNumbers(int arr[], int n) {
        int xor1 = 0, sn;
        int res1 = 0, res2 = 0;
        for (int i=0; i<n; i++) {
            xor1^= arr[i];
        }
        sn = xor1 & (~(xor1-1)); // Get last set bit of xor1.
        // Now divide the passed array to two groups based on last set value recieved above.
        for(int i=0; i<n; i++) {
            if ((sn&arr[i]) != 0) {
                // The last bit of array element currently traversing is set to 1.
                res1 ^= arr[i];
            } else {
                res2 ^= arr[i];
            }
        }
        cout<<res1<<" "<<res2;
    }
};

int main() {
    int arr[] = {4,3,6,7,8,6,4,4,8,8,8,7,4,6}, n = 14;
    Solution obj;
    obj.getTwoOddOccuringNumbers(arr, n);
    cout<<endl;
    return 0;
}
