#include <iostream>
using namespace std;

int gcd(int num1, int num2)
{
    int gcdans = 0;
    for (int i = 1; i < num1 && i < num2; i++)
    {
        if (num1 % i == 0 && num2 % i == 0)
        {
            gcdans = i;
        }
    }
    return gcdans;
}

int lcm(int num1, int num2)
{
    int ans;

    ans = (num1 * num2) / gcd(num1, num2);
    return ans;
}

int main()
{
    int num1, num2;

    cout << "Enter the first number:";
    cin >> num1;

    cout << "Enter the second number:";
    cin >> num2;

    int lcmans = lcm(num1, num2);
    cout << "The lcm of two number is: " << lcmans;
}