#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;

    int i = 0;
    int sum = 0;
    while (i<=n){
        // cout<<i << ends;
        sum = sum + i++;  
    }

    cout<<sum;
   
    
    return 0;
}