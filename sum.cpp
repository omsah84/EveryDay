#include <iostream>
#include "userclass.cpp"
using namespace std;
int main()
{
    userclass om;
    int n, su;
    cin >> n;
    su = sum(n);
    cout << su;

}

int sum(int n)
{
    int s = 0;

public:
    for (int i = 1; i <= n; i++)
    
    {
        s += i;
    }

    return s;
}