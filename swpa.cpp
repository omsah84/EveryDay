#include<iostream>
using namespace std;

void swape(int arr[], int size){
    for (int i = 0; i < size; i++)
    {
        if((i+1)<size){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
}

void printarrr(int arr[] , int size){
     for (int i = 0; i < size;i++){
        cout<< arr[i]<<" ";
    }
}

int main(){
    int size = 5;
    int arr[size];

    for (int i = 0; i < size;i++){
        cin >> arr[i];
    }

    printarrr(arr, size);
    swape(arr, size);
    cout << endl;
    printarrr(arr, size);
}