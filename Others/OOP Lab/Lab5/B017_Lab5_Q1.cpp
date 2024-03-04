#include <iostream>
using namespace std;

class Complex {
private:
    double real;
    double imag;

public:
    // Default constructor
    Complex() {
        real = 0.0;
        imag = 0.0;
    }

    // Constructor with one argument
    Complex(double r) {
        real = r;
        imag = r;
    }

    // Constructor with two arguments
    Complex(double r, double i) {
        real = r;
        imag = i;
    }

    // Function to add two complex numbers
    Complex sum(Complex c1, Complex c2) {
        Complex result;
        result.real = c1.real + c2.real;
        result.imag = c1.imag + c2.imag;
        return result;
    }

    // Function to display the complex number
    void display() {
        cout << real;
        if (imag >= 0)
            cout << "+";
        cout << imag << "i" << endl;
    }
};

int main() {
    Complex c1;         // Default constructor
    Complex c2(3.5);    // Constructor with one argument
    Complex c3(2, 4);   // Constructor with two arguments

    Complex sum;
    sum = sum.sum(c2, c3);

    cout << "c1: ";
    c1.display();

    cout << "c2: ";
    c2.display();

    cout << "c3: ";
    c3.display();

    cout << "Sum of c2 and c3: ";
    sum.display();

    return 0;
}
