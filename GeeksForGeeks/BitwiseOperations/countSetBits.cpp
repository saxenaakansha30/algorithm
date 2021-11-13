//
//  countSetBits.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 12/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int getSetBitCount(int n) {
        int count = 0, i=1;
        while (i <= n) {
            if ((n&i) != 0) {
                count++;
            }
            i = i<<1;
        }
        return count;
    }
    
    int getSetBitByBrianKernighanAlgo(int n) {
        int count = 0;
        while (n > 0) {
            n = n&(n-1);
            count++;
        }
        return count;
    }
};

int main() {
    int n;
    Solution obj;
    cout<<"Enter a number for which you want to see set bit count: ";
    cin>>n;
    cout<<obj.getSetBitCount(n)<<endl;
    cout<<obj.getSetBitByBrianKernighanAlgo(n)<<endl;
    cout<<endl;
    return 0;
}
