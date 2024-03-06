#include <iostream>
using namespace std;
class Complex {
    double real;
    double imag;
public:
    Complex() {
        real = 0.0;
        imag = 0.0;
    }
    Complex(double r) {
        real = r;
        imag = r;
    }
    Complex(double r, double i) {
        real = r;
        imag = i;
    }
    Complex sum(Complex c1, Complex c2) {
        Complex result;
        result.real = c1.real + c2.real;
        result.imag = c1.imag + c2.imag;
        return result;
    }
    void display() {
        cout << real << " + " << imag << "i" << endl;
    }
};

int main() {
    Complex c1;
    Complex c2(3.5);
    Complex c3(2, 4);
    Complex s;
    s = s.sum(c2, c3);

    cout << "c1: ";
    c1.display();
    cout << "c2: ";
    c2.display();
    cout << "c3: ";
    c3.display();
    cout << "Sum of c2 and c3: ";
    s.display();
    return 0;
}
