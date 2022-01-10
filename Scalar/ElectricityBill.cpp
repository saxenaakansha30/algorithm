//
//  ElectricityBill.cpp
//  Scalar
//
//  Created by Akansha.Saxena on 09/01/22.
//

#include<iostream>

using namespace std;

int main()  {
    float unit;
    float bill = 0;
    float range, rate;
    cin>>unit;

    // For first 50 units.
    if (unit > 0) {
        range = 50;
        rate = 0.50;
        if(unit <= range) {
            bill += unit * rate;
        } else {
            bill += rate * range;
        }
        unit -= range;
    }

    // For next 100 units.
     if (unit > 0) {
        range = 100;
        rate = 0.75;
        if(unit <= range) {
            bill += unit * rate;
        } else {
            bill += rate * range;
        }
        unit -= range;
    }

    // For next 100 units.
     if (unit > 0) {
        range = 100;
        rate = 1.20;
        if(unit <= range) {
            bill += unit * rate;
        } else {
            bill += rate * range;
        }
        unit -= range;
    }

    // For above 250 units.
     if (unit > 0) {
        rate = 1.50;
        bill += unit * rate;
    }
    
    // Additional surcharge of 20% on bill.
    bill += bill*0.20;

    cout<<(int)bill;
    return 0;
}
