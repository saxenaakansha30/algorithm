//
//  bitwiseKthTerm.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 12/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    void kthTermLeftShift(int n, int k) {
        if (((1<<k-1) & n) != 0) {
            cout<<"Yes"<<endl;
        }
        else {
            cout<<"No"<<endl;
        }
    }
    void kthTermRightShift(int n, int k) {
        if (((n>>(k-1)) & 1) != 0) {
            cout<<"Yes"<<endl;
        }
        else {
            cout<<"No"<<endl;
        }
    }
};

int main() {
    int n,k;
    Solution obj;
    cout<<"Enter the nth term: ";
    cin>>n;
    cout<<"Enter the bit number to find if it has value 1 or not: ";
    cin>>k;
    obj.kthTermLeftShift(n,k);
    obj.kthTermRightShift(n,k);
    return 0;
}
