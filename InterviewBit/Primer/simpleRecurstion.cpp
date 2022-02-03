//
//  simpleRecurstion.cpp
//  Scalar
//
//  Created by Akansha.Saxena on 07/01/22.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int bar(int x, int y) {
        if (y==0)
            return 0;
        return x + bar(x, y-1);
    }
    
    int foo(int x, int y) {
        if (y==0) {
            return  1;
        }
        return bar(x, foo(x, y-1));
    }
};

int main() {
    Solution obj;
    cout<<obj.foo(3,5)<<endl    ;
    return 0;
}
