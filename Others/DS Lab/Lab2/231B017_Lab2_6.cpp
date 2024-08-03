#include <iostream>
using namespace std;

void decimalToBinary(int decimal) {
    if (decimal == 0) {
        cout << "The binary equivalent of decimal 0 is: 0" << endl;
        return;
    }
    int binaryNumber = 0;
    int placeValue = 1;

    while (decimal > 0) {
        int remainder = decimal % 2;
        binaryNumber += remainder * placeValue;
        placeValue *= 10;
        decimal /= 2;
    }

    cout << "The binary equivalent is: " << binaryNumber << endl;
}

int main() {
    int decimalNumber;

    cout << "Enter a decimal number: ";
    cin >> decimalNumber;

    decimalToBinary(decimalNumber);

    return 0;
}
