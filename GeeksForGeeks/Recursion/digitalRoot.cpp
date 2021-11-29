//
//  digitalRoot.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 29/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int digitalRoot(int n)
    {
        int sum = 0;

        if (n/10 == 0) {
            return n;
        }

        while (n > 0) {
            sum += n%10;
            n = n/10;
        }
        
        return digitalRoot(sum);
    }
};

int main() {
    int n=1;
    Solution obj;
    cout<<obj.digitalRoot(n)<<endl;
    
    
    
    
    
    
    
    return 0;
}
