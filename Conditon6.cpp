#include <iostream>
using namespace std;
int main()
{
    int button;
    cin >> button;

    if (button == 1)
    {
        cout << "Hello.";
    }
    else if (button == 2)
    {
        cout << "Namaste";
    }
    else if (button == 3)
    {
        cout << "Bonjou";
    }
    else
    {
        cout << "invalid button";
    }

    return 0;
}