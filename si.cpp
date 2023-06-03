#include<iostream>
using namespace std;

float sum(float P, float T, float R){
    return (P * T * R) / 100;
}



int main(){

    float p, t, r, simpleinterest;
    cout << "Enter the principle:";
    cin >> p;

    cout << "Enter the time: ";
    cin >> t;

    cout << "Enter the rate: ";
    cin >> r;

    simpleinterest = sum(p, t, r);
    cout << "The simple interest is: " << simpleinterest;

    return 0;
}



