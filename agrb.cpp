#include<iostream>
using namespace std;

void greater(int &a, int &b){
    if(a>b){
        // return 1;
        cout << "Yes";
    }


    // return -1;
    cout << "No";
}

int main(){

    int a, b;

    cout<<"Enter the first numebr: ";
    cin >> a;

    cout << "Enter the second number: ";
    cin >> b;

    greater(a, b);

    return 0;
}

