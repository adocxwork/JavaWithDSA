#include <iostream>
using namespace std;
class Rational {
    int n;
    int d;
public:
    Rational() : n(0), d(1) {}
    void getInput() {
        cout << "Enter numerator: ";
        cin >> n;
        cout << "Enter denominator: ";
        cin >> d;
        if (d == 0) {
            cout << "Invalid input. Denominator cannot be zero." << endl;
            n = 0;
        }
    }
    void display() const {
        cout << n << "/" << d << endl;
    }
    Rational operator+(const Rational& ob) const {
        Rational result;
        result.n = n * ob.d + ob.n * d;
        result.d = d * ob.d;
        return result;
    }
    Rational operator-(const Rational& ob) const {
        Rational result;
        result.n = n * ob.d - ob.n * d;
        result.d = d * ob.d;
        return result;
    }
    Rational operator*(const Rational& ob) const {
        Rational result;
        result.n = n * ob.n;
        result.d = d * ob.d;
        return result;
    }
    Rational operator/(const Rational& ob) const {
        Rational result;
        result.n = n * ob.d;
        result.d = d * ob.n;
        return result;
    }
};

int main() {
    Rational r1, r2, result;
    cout << "Enter details for first rational number:" << endl;
    r1.getInput();
    cout << "Enter details for second rational number:" << endl;
    r2.getInput();
    cout << "First rational number: ";
    r1.display();
    cout << "Second rational number: ";
    r2.display();

    result = r1 + r2;
    cout << "Addition: ";
    result.display();

    result = r1 - r2;
    cout << "Subtraction: ";
    result.display();

    result = r1 * r2;
    cout << "Multiplication: ";
    result.display();

    result = r1 / r2;
    cout << "Division: ";
    result.display();

    return 0;
}
