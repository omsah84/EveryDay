#include<iostream>
using namespace std;

bool validtr(double a, double b, double c){
    if(a<=0 || b<=0 || c<=0){
        return 0;
    }

    if((a+b<c) || (a+c)<b || (b+c)<a){
        return 0;
    }

    return 1;
}

int main(){
    double a, b, c;
    cout << "Enter the side of triangle : ";
    cin >> a >> b >> c;

    if(validtr(a,b,c)){
        cout << "valid.";
    }
    else{
        cout << "not valid.";
    }
}