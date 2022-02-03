//
//  powerOftwo.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 14/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    bool powerOfTwo(int n) {
        // Using Brain Kenningam's Algo here.
        return (n > 0) && ((n & (n-1)) == 0);
    }
};

int main() {
    int n;
    cout<<"Enter a number to check if it is power of 2: ";
    cin>>n;
    Solution obj;
    cout<<obj.powerOfTwo(n)<<endl;
    return 0;
}
