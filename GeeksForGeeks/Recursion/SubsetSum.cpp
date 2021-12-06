//
//  SubsetSum.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 06/12/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int getSubSetSumCount(int arr[], int n, int sum, int level = 0, int subSetSum = 0) {
        if (level >= n) {
            return (subSetSum == sum) ? 1 : 0;
        }
        return getSubSetSumCount(arr, n, sum, level+1, subSetSum) + getSubSetSumCount(arr, n, sum, level+1, subSetSum+arr[level]);
    }

    int getSubSetSumCountBetter(int arr[], int n, int sum) {
        if (n == 0) {
            return (sum == 0) ? 1 : 0;
        }
        return getSubSetSumCountBetter(arr, n-1, sum) + getSubSetSumCountBetter(arr, n-1, sum-arr[n-1]);
    }
};

int main() {
    int arr[3] = {5,5,3};
    Solution obj;
    cout<<obj.getSubSetSumCount(arr, 3, 0)<<endl;
    cout<<obj.getSubSetSumCountBetter(arr, 3, 0)<<endl;
    return 0;
}
