//
//  findMsb.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 16/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int getMsbOfNumber(int n) {
        while((n&(n-1)) != 0) {
            n = n&n-1;
        }
        return n;
    }
};

int main() {
    int n;
    Solution obj;
    cout<<"Enter a number: ";
    cin>>n;
    cout<<obj.getMsbOfNumber(n)<<endl;
    return 0;
}
