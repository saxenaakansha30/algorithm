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
    void printTowerOfHanoi(int n, char a, char b, char c) {
        if (n <= 0) {
            return;
        }
        printTowerOfHanoi(n-1, a, c, b);
        cout<<"Move Disc "<<n<<" from "<<a<<" to "<<c<<endl;
        printTowerOfHanoi(n-1, b, a, c);
    }
};

int main() {
    towerOfHanoi obj;
    obj.printTowerOfHanoi(3, 'A', 'B', 'C');
    return 0;
}
