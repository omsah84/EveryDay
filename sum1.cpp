#include<iostream>
using namespace std;

bool sumar(int arr[] , int size, int elem){
    for (int i = 0; i < size;i++){
        for (int j = i; j < size;j++){
            for (int k = j; k < size;k++){
                int newsum = arr[i] + arr[j] + arr[k];
                if(newsum == elem){
                    return 1;
                }
               
            }
        }
    }

    return 0;
}

int main(){
    int size = 8;

    int arr[size] = {
        1, 2, 4, 5, 2, 8, 4, 7};

    int ele = 100;
     bool res = sumar(arr, size, ele);

     if(res){
        cout << "Yes";
     }
     else{
        cout << "no";
     }
}