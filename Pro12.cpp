#include <iostream>

bool isPrime(int number) {
    if (number <= 1) {
        return false;
    }

    for (int i = 2; i * i <= number; ++i) {
        if (number % i == 0) {
            return false;
        }
    }

    return true;
}

void printPrimes(int limit) {
    std::cout << "Prime numbers up to " << limit << " are: ";

    for (int i = 2; i <= limit; ++i) {
        if (isPrime(i)) {
            std::cout << i << " ";
        }
    }

    std::cout << std::endl;
}

int main() {
    int limit;

    std::cout << "Enter the limit: ";
    std::cin >> limit;

    printPrimes(limit);

    return 0;
}
