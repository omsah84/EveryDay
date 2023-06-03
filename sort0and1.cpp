#include<iostream>
using namespace std;

int sortedwh(int arr[],int size){
    int start = 0;
    int end = size - 1;

    while (start<end){


        if(arr[start] ==0 && arr[end] == 1){
            start++;
            end--;
        }

        if(arr[start] == 1 && arr[end] == 1){
            end--;
        }

        if(arr[start] == 0 && arr[end] == 0){
            start++;
        }

        swap(arr[start], arr[end]);
        start++;
        end--;
    }
   
    
}

void printarr(int arr[], int size){

    for (int a = 0; a < size;a++)
    {
        cout << arr[a] << " ";
    }

    cout << endl;
}

// void sort(int arr[], int size){

//     int zero = 0;
//     int one = 0;

//     for (int i = 0; i < size;i++){
//         if(arr[i]==0){
//             zero++;
//         }
//         else{
//             one++;
//         }
//     }


//     for (int i = 0; i < zero;i++){
//         arr[i] = 0;
//     }

//     for (int j = zero; j < one;j++){
//         arr[j] = 1;
//     }
// }



int main(){
    int arr[7] = {0, 1,0,1, 1, 0, 1};

    // sort(arr, 5);
    sortedwh(arr, 7);
    printarr(arr, 7);
}