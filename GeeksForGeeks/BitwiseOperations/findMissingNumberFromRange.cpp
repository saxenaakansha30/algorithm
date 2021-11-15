//
//  findMissingNumberFromRange.cpp
//  GeeksForGeeks
//
// Using Xor Properties:
// x^0 = x
// x^y = y^x
// x^(y^z) = (x^y)^z
// x^x = 0
//
//  Created by Akansha.Saxena on 14/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int findMissingNumber(int arr[], int n) {
        int res = 0;
        for (int i = 1; i<=n+1; i++) {
            res = res ^ i ^ arr[i-1];
        }
        return res;
    }
};

int main() {
    int arr[5] = {1,2,3,5}, n = 4;
    Solution obj;
    cout<<obj.findMissingNumber(arr, n);
    cout<<endl;
    return 0;
}
