//
//  grayToBinar.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 21/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int grayToBinary(int n) {
        int res = 0;
        while(n!=0) {
            res = res^n;
            n=n>>1;
        }
        return res;
    }
};

int main() {
    int n=4;
    Solution obj;
    cout<<obj.grayToBinary(n);
    cout<<endl;
    return 0;
}
