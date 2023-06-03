#include<iostream>
using namespace std;

bool pos(int num){
    if(num>0){
        return 1;
    }

    return 0;
}

int main(){
    int num;

    cout << "Enter the number: ";
    cin >> num;

    if(pos(num)){
        cout << "positive.";
    }
    else{
        cout << "Not positive.";
    }
}