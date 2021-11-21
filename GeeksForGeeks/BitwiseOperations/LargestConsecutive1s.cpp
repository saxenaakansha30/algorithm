//
//  LargestConsecutive1s.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 21/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    int getLargestConsecutives1sCount(int n) {
        int counter = 0;
        while(n!=0) {
            n = n&(n>>1);
            counter++;
        }
        return counter;
    }
};

int main() {
    int n;
    cout<<"Enter a number: ";
    cin>>n;
    Solution obj;
    cout<<obj.getLargestConsecutives1sCount(n);
    cout<<endl;
    return 0;
}
