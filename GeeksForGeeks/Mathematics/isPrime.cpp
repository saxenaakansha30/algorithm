//
//  isPrime.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 24/10/21.
//
#include <iostream>
#include <cmath>
using namespace std;

class Solution {
    public:
    // function to check if n is prime
    bool isPrime(int n)
    {
        if(n<=1) {
            return false;
        }
        else if (n == 2 || n == 3) {
            return true;
        }
        else if (n%2 == 0 || n%3 == 0) {
            return false;
        }
        else {
            for (int i = 5; i*i<=n; i = i+6) {
                if (n%i == 0 || n%(i+2) == 0) {
                    return false;
                }
            }
            return true;;
        }
    }
};

int main() {
    int N;
    cout<<"Enter a number to check if it is prime: ";
    cin>>N;
    Solution ob;
    cout<<ob.isPrime(N)<<endl;
    return 0;
    
}
