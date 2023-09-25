#include<iostream>
using namespace std;
int main(){
   
    // int a;
    // // a = cin.get();
    // cin>>a;
    // if(a>4){
    //     cout<<"A greater then 4."<<endl;
    // }
    // else{
    //     cout<<"A is not greater then 4.";
    // }

    // if(a>0){
    //     cout<<"A is greater then zero"<<endl;
    // }else if(a<0){
    //     cout<<"A is less then zero"<<endl;
    // }

    char c;
    cout<<"Enter the letter."<<endl;
    cin>>c;
    if(c>= 'a' && c <='z'){
        cout<<"This is lower letter.";
    }
    else if(c>='A' && c<='Z'){
        cout<<"The is capital letter";
    }
    else if(c>='0' && c<='9'){
        cout<<"This is numberic.";
    }
    
    
}