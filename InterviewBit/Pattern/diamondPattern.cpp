//
//  diamondPattern.cpp
//  Scalar
//
//  Created by Akansha.Saxena on 15/01/22.
//

#include <iostream>
using namespace std;

int main() {
    int n;
    cout<<"Enter the diamond size: ";
    cin>>n;
    int row = 1;
    // Upside of diamond.
    while (row <= n) {
        for (int i = row; i < n; i++) {
            cout<<" ";
        }
        for (int i = 1; i < 2*row; i++) {
            cout<<"*";
        }
        row++;
        cout<<endl;
    }
    row -= 2;
    // Downside of diamond.
    while (row > 0) {
        for (int i = n; i > row; i--) {
            cout<<" ";
        }
        for (int i = 1; i < 2*row; i++) {
            cout<<"*";
        }
        cout<<endl;
        row--;
    }
}
