#include<iostream>
using namespace std;


void dcb(int n,int sum){

    if(n == 0){
        return;
    }

    int last = n & 1;
    n = n >> 1;
    dcb(n , sum);

    cout << last;
}

int main()
{

    int n = 1100;
    dcb(n,1);
    return 0;
}