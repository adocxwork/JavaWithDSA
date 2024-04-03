#include <iostream>

class Integer {
    int value;
public:
    Integer(int val = 0) : value(val) {}
    int operator!() {
        int fact = 1;
        for (int i = 2; i <= value; ++i) {
            fact *= i;
        }
        return fact;
    }
    void setValue(int val) {
        value = val;
    }
    int getValue() const {
        return value;
    }
};

int main() {
    Integer Ob(5);
    int fact = !Ob;
    std::cout << "Factorial of " << Ob.getValue() << " is " << fact << std::endl;
    return 0;
}