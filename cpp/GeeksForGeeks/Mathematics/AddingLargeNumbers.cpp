//
//  AddingLargeNumbers.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 27/10/21.
//

#include <iostream>
using namespace std;

class Solution {
    public:
    long long sum(long long a, long long b, int M) {
        long long c;
        a = a%M;
        b = b%M;
        c = (a+b)%M;
        return c;
    }
};

int main() {
    Solution obj;
    long long int num1, num2;
    cout<<"Enter two long integers: "<<endl;
    cin>>num1>>num2;
    cout<<obj.sum(num1, num2, 1000000007);

    cout<<endl;
    return 0;
}
