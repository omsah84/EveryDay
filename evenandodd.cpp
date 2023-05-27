#include <iostream>
#include "userclass.cpp"
using namespace std;

void evenodd(int n)
{
    if (n % 2 == 0)
    {
        cout << "Even\n";
    }
    else
    {
        cout << "odd\n";
    }
}


int main()
{
    userclass omsah;

    int n;
    cin >> n;

    evenodd(n);

    return 0;
}