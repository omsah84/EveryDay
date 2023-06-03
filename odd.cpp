#include<iostream>
using namespace std;

void printodd(int num,int count){


    if(num == count){
        return;
    }

    if (count % 2 != 0) {
        cout << count << endl;
    }

    printodd(num, count + 1);

}

int main(){
    int num;
    cout << "Enter the number: ";
    cin >> num;

    printodd(num, 0);
}