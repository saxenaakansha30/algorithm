//
//  primeFactors.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 24/10/21.
//
#include <iostream>
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
    
    void primeFactors(int n) {
        for (int i = 2; i <= n; i++) {
            if (n <= 1) {
                return;
            }
            
            if (isPrime(i)) {
                while (n%i == 0) {
                    n = n/i;
                    cout<<i<<" ";
                }
            }
        }
    }
};

int main() {
    int n;
    cout<<"Enter the number to calculate its prime factors: ";
    cin>>n;
    
    Solution ob;
    ob.primeFactors(n);
    return 0;
}
