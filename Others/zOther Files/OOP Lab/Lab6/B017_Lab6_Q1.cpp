#include <iostream>
using namespace std;
class Distance {
    int feet;
    float inches;
public:
    Distance() : feet(0), inches(0.0) {}
    Distance(int f, float i) {
        feet = f;
        if (i >= 12.0) {
            feet += static_cast<int>(i / 12.0);
            inches = i - (static_cast<int>(i / 12.0) * 12.0);
        } else {
            inches = i;
        }
    }
    void display() const {
        cout << "Feet: " << feet << " Inches: " << inches << endl;
    }
    Distance operator-(const Distance& d) const {
        int newFeet = feet - d.feet;
        float newInches = inches - d.inches;
        if (newInches < 0) {
            newInches += 12.0;
            newFeet--;
        }
        return Distance(newFeet, newInches);
    }
    Distance operator+(const Distance& d) const {
        int newFeet = feet + d.feet;
        float newInches = inches + d.inches;
        if (newInches >= 12.0) {
            newInches -= 12.0;
            newFeet++;
        }
        return Distance(newFeet, newInches);
    }
    Distance& operator+=(const Distance& d) {
        *this = *this + d;
        return *this;
    }
    Distance& operator-=(const Distance& d) {
        *this = *this - d;
        return *this;
    }
    bool operator>(const Distance& d) const {
        if (feet > d.feet)
            return true;
        else if (feet == d.feet && inches > d.inches)
            return true;
        else
            return false;
    }
    bool operator<(const Distance& d) const {
        if (feet < d.feet)
            return true;
        else if (feet == d.feet && inches < d.inches)
            return true;
        else
            return false;
    }
};

int main() {
    Distance d1(5, 10.5);
    Distance d2(3, 8.2);

    cout << "d1: ";
    d1.display();
    cout << "d2: ";
    d2.display();

    Distance d3 = d1 + d2;
    cout << "Sum: ";
    d3.display();

    Distance d4 = d1 - d2;
    cout << "Difference: ";
    d4.display();

    cout << "d1 > d2: " << (d1 > d2) << endl;
    cout << "d1 < d2: " << (d1 < d2) << endl;

    return 0;
}
