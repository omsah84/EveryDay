#include <iostream>
using namespace std;
int main()
{
#ifndef ONLINE_JUDEGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif

    int p, t, r;
    cin >> p >> t >> r;
    cout << "\nThe simple intrest is: ";
    cout << (p * t * r) / 100;

    return 0;
}