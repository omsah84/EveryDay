#include <iostream>
#include <string>

std::string addBinary(std::string a, std::string b) {
    std::string result;
    int carry = 0;
    int i = a.length() - 1;
    int j = b.length() - 1;

    while (i >= 0 || j >= 0 || carry > 0) {
        int sum = carry;
        if (i >= 0)
            sum += a[i--] - '0';
        if (j >= 0)
            sum += b[j--] - '0';

        result = std::to_string(sum % 2) + result;
        carry = sum / 2;
    }

    return result;
}

int main() {
    std::string a, b;

    std::cout << "Enter the first binary string: ";
    std::cin >> a;

    std::cout << "Enter the second binary string: ";
    std::cin >> b;

    std::string sum = addBinary(a, b);

    std::cout << "Sum: " << sum << std::endl;

    return 0;
}
