#include<iostream>
#include<cmath>
using namespace std;

int btodec(string str){
    int len = str.length();
    int sum = 0;
    for(int i = len-1 ;i>=0;i--){
        if(str[i] == 1){
            sum +=pow(2,(i-(len-1)));
        }
    }

    return sum;
}

int main(){
    string str ="0101001";
    // str ="hell";
    int decimalans= btodec(str);
    cout<<decimalans;
}