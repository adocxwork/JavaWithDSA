#include <iostream>
using namespace std;

class FLOAT {
    float value;
public:
    FLOAT(float val = 0.0) : value(val) {}
    FLOAT operator+(const FLOAT& other) const {
        return FLOAT(value + other.value);
    }
    FLOAT operator-(const FLOAT& other) const {
        return FLOAT(value - other.value);
    }
    FLOAT operator*(const FLOAT& other) const {
        return FLOAT(value * other.value);
    }
    FLOAT operator/(const FLOAT& other) const {
        if (other.value == 0) {
            cerr << "Error: Division by zero." << endl;
            return FLOAT();
        }
        return FLOAT(value / other.value);
    }
    float getValue() const {
        return value;
    }
};

int main() {
    FLOAT a(5.5);
    FLOAT b(2.5);

    FLOAT sum = a + b;
    cout << "Sum: " << sum.getValue() << endl;
    FLOAT diff = a - b;
    cout << "Difference: " << diff.getValue() << endl;
    FLOAT product = a * b;
    cout << "Product: " << product.getValue() << endl;
    FLOAT quo = a / b;
    cout << "Quotient: " << quo.getValue() << endl;
    return 0;
}