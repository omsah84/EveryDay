#include <iostream>
using namespace std;

void pat1(int n)
{

    int i = 1;
    while (i <= n)
    {
        cout << "* * * * * * ";
        cout << "          ";
        cout << "* * * * * * ";

        cout << endl;

        i++;
    }

  


}

void pat2(int n)
{
    int i = 1;
    while (i <= n)
    {
        int j = 1;
        while (j <= i)
        {
            cout << "* ";
            j++;
        }

        cout << endl;
        i++;
    }

     i = n;
    while (i >= 1)
    {
        int j = 2;
        while (j <= i)
        {
            cout << "* ";
            j++;
        }

        cout << endl;
        i--;
    }
}

int main()
{
    int n;
    cout << "Entet the number: ";
    cin >> n;

    pat1(n);
    pat2(n);
    pat2(n);
    pat1(n);
}