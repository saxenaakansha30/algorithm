//
//  swapBits.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 22/11/21.
//

#include <iostream>
using namespace std;

class Solution {
protected:
    const long ALL_EVEN_BITS = 0xAAAAAAAA;
    
    const long ALL_ODD_BITS = 0x55555555;
public:
    long swapBits(int n) {
        long oddBitsOfN, evenBitsOfN, swappedNumber;
        evenBitsOfN = ALL_EVEN_BITS & n;
        oddBitsOfN = ALL_ODD_BITS & n;
        swappedNumber = (evenBitsOfN>>1) | (oddBitsOfN<<1);
        return swappedNumber;
    }
};

int main() {
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    Solution obj;
    cout<<obj.swapBits(n);
    cout<<endl;
    return 0;
}
