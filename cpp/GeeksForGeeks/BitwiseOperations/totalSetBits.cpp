//
//  totalSetBits.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 19/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int getNearestPowerOf2(int n) {
        int power = 0;
        while(n > 1) {
            n = n>>1;
            power++;
        }
        return power;
    }

    int getTotalSetBits(int n) {
        int x, bitCount=0, nearestPowerof2Number;
        x = getNearestPowerOf2(n);
        nearestPowerof2Number = getPowerOf2Decimal(x);
        // Total bits upto nearest perfect power of 2 number and the MSB of rest the numbers
        bitCount = getPowerOf2Decimal(x-1)*x + (n+1-nearestPowerof2Number);
        if ((n-nearestPowerof2Number) != 0)  {
            // Repeat the above calculation until you reach the 0.
            bitCount += getTotalSetBits(n-nearestPowerof2Number);
        }
        return bitCount;
    }
    
    int getPowerOf2Decimal(int power) {
        return 1<<power;
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
