//
//  towerOfHanoi.cpp
//  GeeksForGeeks
//
//  Created by Akansha.Saxena on 04/12/21.
//

#include <iostream>
using namespace std;

class towerOfHanoi {
public:
    long long printTowerOfHanoi(int n, char a, char b, char c) {
        if (n <= 0) {
            return 0;
        }
        printTowerOfHanoi(n-1, a, c, b);
        cout<<"move disc "<<n<<" from rod "<<a<<" to rod "<<c<<endl;
        printTowerOfHanoi(n-1, b, a, c);
        return (1<<n)-1;
    }
};

int main() {
    towerOfHanoi obj;
    cout<<obj.printTowerOfHanoi(1, '1', '2', '3')<<endl;
    return 0;
}
