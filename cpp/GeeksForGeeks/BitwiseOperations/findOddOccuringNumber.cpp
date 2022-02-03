//
//  findOddOccuringNumber.cpp
//  GeeksForGeeks
//
// Using Xor Properties:
// x^0 = x
// x^y = y^x
// x^(y^z) = (x^y)^z
// x^x = 0
//
//  Created by Akansha.Saxena on 15/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int getOddOccuingNumber(int arr[], int n) {
        int res = 0;
        for (int i = 0; i < n; i++) {
            res ^= arr[i];
        }
        return  res;
    }
};

int main() {
    int arr[] = {4,3,4,4,4,5,5}, n = 7;
    Solution obj;
    cout<<obj.getOddOccuingNumber(arr, n);
    cout<<endl;
    return  0;
}
