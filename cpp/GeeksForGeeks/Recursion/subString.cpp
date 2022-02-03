//
//  subString.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 30/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    void getSubStrings(char str[], int n) {
        int subStrCount = 0;

        // total subset are going to be 2 power n where n is the number of unique char in passed string.
        char subStr[1<<n];
        subStr[0] = '*';
        for (int i=0; i < n; i++) {
            for (int j=0; j <= subStrCount; j++) {
                subStr[j] = subStr[j];
                string str2;
                str2 = str2 + subStr[j] + str[i];
                subStr[j+1] = str2;
                cout<<subStr[j]<<endl;
                cout<<subStr[j+1]<<endl;
            }
            subStrCount = (int) sizeof(subStr);
        }
    }
};

int main() {
    char str[2] = {'A', 'B'};
    Solution obj;
    obj.getSubStrings(str, size(str));
    return 0;
}
