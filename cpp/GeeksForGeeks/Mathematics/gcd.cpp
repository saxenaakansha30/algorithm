//
//  gcd.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 31/10/21.
//

#include <iostream>
using namespace std;

class Solution {
    public:
    int gcdNaiveSolution(int a, int b) {
        int gcd = 1, n;
        if (a<b) {
            n = a;
        }
        else {
            n = b;
        }
        for (int i = n; i >= 2; i--) {
            if (a%i == 0 && b%i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }
    
    int gcdEuclideanAlgo(int a, int b) {
        if (a == 0) {
            return b;
        } else {
            return gcdEuclideanAlgo(b%a,a);
        }
    }
};

int main() {
    int no1,no2;
    cout<<"Enter two numbers: "<<endl;
    cin>>no1>>no2;
    Solution ob;
    cout<<ob.gcdNaiveSolution(no1, no2)<<endl;
    
    // Euclidean Algo.
    cout<<ob.gcdEuclideanAlgo(no1, no2)<<endl;    
    return 0;
}
