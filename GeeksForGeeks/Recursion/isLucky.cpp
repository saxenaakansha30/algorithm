//
//  isLucky.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 10/01/22.
//

#include <iostream>
using namespace std;

class Solution{
public:
    bool isLucky(int n, int deletion_counter = 2) {
        int next_pos;
        if (deletion_counter > n) {
            return true;
        }
        
        if (n%deletion_counter == 0) {
            return false;
        }
        
        next_pos = n - n/deletion_counter;
        return isLucky(next_pos, deletion_counter+1);
    }
};

int main() {
    int n;
    Solution obj;
    cin>>n;
    cout<<obj.isLucky(n);
    return 0;
}
