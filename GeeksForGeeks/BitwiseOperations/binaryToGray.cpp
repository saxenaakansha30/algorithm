//
//  binaryToGray.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 21/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int binaryToGray(int n) {
        return n^(n>>1);
    }
};

int main() {
    int n;
    cout<<"Enter the number: ";
    cin>>n;
    Solution obj;
    cout<<obj.binaryToGray(n)<<endl;
    return 0;
}
