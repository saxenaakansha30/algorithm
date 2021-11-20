//
//  totalSetBits.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 19/11/21.
//

#include <iostream>
#include <math.h>
using namespace std;

class Solution {
public:
    int getNearestPowerOf2(int n) {
        int counter = 0;
        while(n > 1) {
            n = n/2;
            counter++;
        }
        return counter;
    }

    int getTotalSetBits(int n) {
        int x, bitCount=0, nearestPowerof2Number;
        x = getNearestPowerOf2(n);
        nearestPowerof2Number = pow(2, x);
        // Total bits upto nearest perfect power of 2 number.
        bitCount = pow(2, x-1)*x + (n+1-nearestPowerof2Number);
        if ((n-nearestPowerof2Number) != 0) {
            bitCount += getTotalSetBits(n-nearestPowerof2Number);
        }
        return bitCount;
    }
};

int main() {
    int n;
    Solution obj;
    cout<<"Enter a number: ";
    cin>>n;
    cout<<"Total Set Bits are: "<<obj.getTotalSetBits(n);
    cout<<endl;
    return 0;
}
