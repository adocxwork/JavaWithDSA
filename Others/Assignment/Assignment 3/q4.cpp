#include <iostream>

using namespace std;

class FLOAT {
private:
    float value;

public:
    // Constructor
    FLOAT(float val = 0.0) : value(val) {}

    // Overloaded addition operator
    FLOAT operator+(const FLOAT& other) const {
        return FLOAT(value + other.value);
    }

    // Overloaded subtraction operator
    FLOAT operator-(const FLOAT& other) const {
        return FLOAT(value - other.value);
    }

    // Overloaded multiplication operator
    FLOAT operator*(const FLOAT& other) const {
        return FLOAT(value * other.value);
    }

    // Overloaded division operator
    FLOAT operator/(const FLOAT& other) const {
        if (other.value == 0) {
            cerr << "Error: Division by zero." << endl;
            return FLOAT();
        }
        return FLOAT(value / other.value);
    }

    // Overloaded unary minus operator
    FLOAT operator-() const {
        return FLOAT(-value);
    }

    // Function to get the value
    float getValue() const {
        return value;
    }
};

int main() {
    FLOAT a(5.5);
    FLOAT b(2.5);

    // Test addition
    FLOAT sum = a + b;
    cout << "Sum: " << sum.getValue() << endl;

    // Test subtraction
    FLOAT difference = a - b;
    cout << "Difference: " << difference.getValue() << endl;

    // Test multiplication
    FLOAT product = a * b;
    cout << "Product: " << product.getValue() << endl;

    // Test division
    FLOAT quotient = a / b;
    cout << "Quotient: " << quotient.getValue() << endl;

    // Test unary minus
    FLOAT negatedA = -a;
    cout << "Negated A: " << negatedA.getValue() << endl;

    return 0;
}
