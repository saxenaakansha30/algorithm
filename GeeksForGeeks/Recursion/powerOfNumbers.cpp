//
//  powerOfNumbers.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 08/12/21.
//

#include<iostream>
using namespace std;

class Solution {
public:
    // Naive solution.
    long long power(long long N,long long R)
    {
        int M = 1000000007;
        if (R == 0) {
            return 1;
        }
        if (R == 1) {
            return N%M;
        }
        return ((N%M)*power(N,R-1))%M;
    }
    
    // Fast expnential and optimized solution.
    long long powerLongExponential(long long N, long long R) {
        long long half=0, output=0, M = 1000000007;
        if (R == 0) {
            return 1;
        }
        if (R == 1) {
            return N;
        }
        half = powerLongExponential(N, (long)R/2);
        output = (half%M*half%M)%M;
        if (R%2 != 0) {
            return ((output)*(N%M))%M;
        }
        return output;
    }
};

int main() {
    Solution obj;
    long long a = 2, b=0;
    cout<<obj.power(a, b)<<endl;
    cout<<obj.powerLongExponential(a, b)<<endl;
    return 0;
    
}
