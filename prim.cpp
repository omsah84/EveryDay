#include<iostream>
using namespace std;

bool checkprim(int n){

    for (int i = 2; i < n;i++){
        if(n%i==0){
            return 0;
        }
    }

    return 1;
}

int main(){
    int n;
    cout << "Enter the numebr: ";
    cin >> n;
    if(checkprim(n)){
        cout << "Prime..";
    }
    else{
        cout << "not prime..";
    }
}