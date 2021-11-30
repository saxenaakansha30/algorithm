//
//  ropeCuttingProblem.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 30/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int getMaxOf3Num(int x, int y, int z) {
        if (x>y && x>z) {
            return x;
        } else if (y>z) {
            return y;
        } else {
            return z;
        }
    }

    int getMaxRopeCut(int leng, int count, int a, int b, int c) {
        int res, lengA, lengB, lengC;
        if (leng < 0) {
            return -1;
        }
        if (leng == 0) {
            return count;
        }
        lengA = getMaxRopeCut(leng-a, count+1, a, b, c);
        lengB = getMaxRopeCut(leng-b, count+1, a, b, c);
        lengC = getMaxRopeCut(leng-c, count+1, a, b, c);
        res = getMaxOf3Num(lengA, lengB, lengC);
        return res;
    }
};

int main() {
    Solution obj;
    cout<<obj.getMaxRopeCut(23, 0, 12, 9, 11)<<endl;
    return 0;
}
