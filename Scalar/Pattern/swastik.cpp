//
//  swastik.cpp
//  Scalar
//
//  Created by Akansha.Saxena on 15/01/22.
//

#include <iostream>
using namespace std;

int main() {
    int n;
    cout<<"Enter the size of the swastik pattern: "<<endl;
    cin>>n;
    for (int row = 1; row < 2*n; row++) {
        for (int col = 1; col < 2*n; col++) {
            if(col == n || row == n) {
                cout<<"* ";
            } else if (row < n) {
                if (col == 1) {
                    cout<<"* ";
                } else if (row == 1 && col > n) {
                    cout<<"* ";
                } else {
                    cout<<"  ";
                }
            } else {
                if (col == 2*n-1) {
                    cout<<"* ";
                } else if (row == 2*n-1 && col < n) {
                    cout<<"* ";
                } else {
                    cout<<"  ";
                }
            }
        }
        cout<<endl;
    }
    return 0;
}
