#include <iostream>

struct Complex {
    double real;
    double imaginary;
};

Complex addComplex(Complex c1, Complex c2) {
    Complex result;
    result.real = c1.real + c2.real;
    result.imaginary = c1.imaginary + c2.imaginary;
    return result;
}

int main() {
    Complex num1, num2;

    std::cout << "Enter the real part of the first complex number: ";
    std::cin >> num1.real;

    std::cout << "Enter the imaginary part of the first complex number: ";
    std::cin >> num1.imaginary;

    std::cout << "Enter the real part of the second complex number: ";
    std::cin >> num2.real;

    std::cout << "Enter the imaginary part of the second complex number: ";
    std::cin >> num2.imaginary;

    Complex sum = addComplex(num1, num2);

    std::cout << "Sum: " << sum.real << " + " << sum.imaginary << "i" << std::endl;

    return 0;
}
