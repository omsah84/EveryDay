#include <iostream>
using namespace std;
int main()
{
#ifndef ONLINE_JUDEGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif

    int a, b;
    cin >> a >> b;
    cout << endl;
    cout << a + b;
}