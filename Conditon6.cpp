#include <iostream>
using namespace std;

int method1(int button){
    switch (button){
        case 1:
            cout << "hello"<<endl;
            break;
        case 2:
            cout << "Namaste"<<endl;
            break;
        case 3:
            cout << "Banjoo"<<endl;
            break;
        
        default:
            cout << "invalid"<<endl;
    }
 return 0;
}
int main()
{
    int button;
    cin >> button;

    if (button == 1)
    {
        cout << "Hello."<<endl;
    }
    else if (button == 2)
    {
        cout << "Namaste"<<endl;
    }
    else if (button == 3)
    {
        cout << "Bonjou"<<endl;
    }
    else
    {
        cout << "invalid"<<endl;
    }

    method1(button);

    return 0;
}