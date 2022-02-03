//
//  exactly3Divisor.cpp
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
    
    // Function to check the numbers which has exactly 3 divisors.
    int exactly3Divisors(int N)
    {
        //Initializing counter to zero
        int counter=0;
        // running a loop from 1 to sqrt(N).
        for(int i=1;i*i<=N;i++)
        {
            // A number N only has 3 divisors if it is a
            // perfect square and its square  root is a prime number,
            // and we know the number of perfect squares less than N which
            // is sqrt(N), so just checking if i is prime or not
            if(isPrime(i))
                counter++;
        }
        return counter;
    }

};

int main() {
    int N;
    cout<<"Enter a number to calculate the exactly 3 diviros under that number: ";
    cin>>N;
    Solution ob;
    cout<<ob.exactly3Divisors(N)<<endl;
    return 0;
    
}
