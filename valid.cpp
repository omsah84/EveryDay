#include<iostream>
using namespace std;

bool validTriangle(int a, int b, int c){
    if((a+b)>c){
        if((a+c)>b){
            if((b+c)>a){
                return 1;
            }
            return 0;
        }
        return 0;
    }

    return 0;
}

int main(){
    int a, b, c;

    cout << "Enter the first side numeber: ";
    cin >> a;

    cout << "Enter the second side number: ";
    cin >> b;

    cout << "Entet the third side number: ";
    cin >> c;

    if(validTriangle(a,b,c)){
        cout << "Valid";
    }
    else{
        cout << "Not valid";
    }
}