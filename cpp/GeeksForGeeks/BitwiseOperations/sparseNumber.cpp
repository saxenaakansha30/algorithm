//
//  sparseNumber.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 21/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int checkSparse(int n) {
        return ((n&(n>>1)) == 0);
    }
};

int main() {
    int n;
    cout<<"Enter a number to check is if it is sparse number: ";
    cin>>n;
    Solution obj;
    cout<<obj.checkSparse(n);
    cout<<endl;
    return 0;
}
