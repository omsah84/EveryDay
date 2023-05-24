#include <iostream>
using namespace std;
int main()
{
#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif

    int arr[5];
    //input
    for (int i = 0; i < sizeof(arr); i++)
    {
        cin >> arr[i];
    }

    printArray(arr);

    return 0;
}

void printArray(int arr[]){
    for (int i : arr)
    {
        cout << i << " ";
    }
    return;
}