#include<iostream>
using namespace std;

void btdeci(int num ,int i,int an){
    if(num == 0){
        cout << an;
        return;
    }

    int last = num & 1;
    num = num >> 1;

    an = last*(pow(2, i));

    btdeci(num, 0,an);
}


int main(){
    int n = 0101;
    btdeci(n, 0,0);
}