#include<iostream>
using namespace std;

void printevennum(int num){
    for (int i = 0; i <= num;i++){

        if(i%2==0){
            cout << "even: " << i << endl;
        }
    }
}

int main(){

    int num;

    cout << "Enter the number: ";
    cin >> num;

    printevennum(num);
}