#include<iostream>
using namespace std;

int main(){
    string str = "AB";
    int intValue = 0;
    for(int i = 0;i<str.length();i++){

        intValue = intValue *26 +(str[i] - 'A' +1);
    }

    cout<<intValue;
}