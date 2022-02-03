//
//  palindrome.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 28/11/21.
//

#include <iostream>
using namespace std;

class Solution {
public:
    bool ifPalindrome (char str[], int start, int end) {
        // Terminate on reaching end.
        if (start >= end) {
            return true;
        }
        
        return (str[start] == str[end]) && ifPalindrome(str, start+1, end-1);
    }
};

int main() {
    char str[6] = {'a','b','c','c','b','a'};
    Solution obj;
    cout<<obj.ifPalindrome(str, 0, size(str)-1)<<endl;
    return 0;
}
