//
//  josephProblem.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 05/12/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int getLastSurvivor(int n, int k) {
        if (n == 0) {
            return k;
        }
        return (getLastSurvivor(n - 1, k) + k-1) % n + 1;
    }
};

int main() {
    Solution obj;
    cout<<obj.getLastSurvivor(5, 3)<<endl;
    return 0;
}
