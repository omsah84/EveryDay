#include <iostream>

int findGCD(int num1, int num2) {
    while (num2 != 0) {
        int temp = num2;
        num2 = num1 % num2;
        num1 = temp;
    }

    return num1;
}

int findLCM(int num1, int num2) {
    int gcd = findGCD(num1, num2);
    int lcm = (num1 * num2) / gcd;
    return lcm;
}

int main() {
    int num1, num2;

    std::cout << "Enter the first number: ";
    std::cin >> num1;

    std::cout << "Enter the second number: ";
    std::cin >> num2;

    int lcm = findLCM(num1, num2);

    std::cout << "The LCM of " << num1 << " and " << num2 << " is: " << lcm << std::endl;

    return 0;
}
