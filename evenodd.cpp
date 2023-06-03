#include<iostream>
using namespace std;

bool evenodd(int n){
    if(n%2==0){
        return 1;
    }
    return 0;
}

int main(){
    int num;

    cout << "Enter the number: ";
    cin >> num;

    if(evenodd(num)){
        cout << "Even";
    }
    else{
        cout << "odd";
    }
    
}

