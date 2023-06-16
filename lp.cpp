#include<iostream>
using namespace std;

    
    bool leapYear(int year){
        if(year % 4 ==0){
            if(year % 100 ==0 || year % 400==0){
                return true;
            }
            return false;
        }
        return false;
    }
    

int main(){

while (true)
{

    int year;
    cout<<"Enter the year: ";
    cin>>year;

    bool ans = leapYear(year);

    if(ans){
        cout<<"The given year is leap year.";
        cout<<endl;
    }else{
        cout<<"The given year is not leap year.";
        cout<<endl;
    }
    
}
}