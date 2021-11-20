//
//  bitDifference.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 20/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int getBitDifference(int a, int b) {
        int n, res=0;
        // Your logic here
        n = a^b;
        while(n>0) {
            if((n&1) != 0) {
                res++;
            }
            n>>=1;
        }
        return res;
    }
};

int main() {
    int a,b;
    cout<<"Enter two numbers (ex 10 20): "<<endl;
    cin>>a>>b;
    Solution obj;
    cout<<obj.getBitDifference(a, b)<<endl;
    return 0;
}
