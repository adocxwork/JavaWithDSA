#include <iostream>

class Integer {
private:
    int value;

public:
    // Constructor
    Integer(int val = 0) : value(val) {}

    // Overloaded ! operator to calculate factorial
    int operator!() {
        int fact = 1;
        for (int i = 2; i <= value; ++i) {
            fact *= i;
        }
        return fact;
    }

    // Function to set the value
    void setValue(int val) {
        value = val;
    }

    // Function to get the value
    int getValue() const {
        return value;
    }
};

int main() {
    Integer Ob(5); // Initialize Integer object with value 5

    int fact = !Ob; // Calculate factorial using overloaded ! operator
    std::cout << "Factorial of " << Ob.getValue() << " is " << fact << std::endl;

    return 0;
}

/*
In this code:

The Integer class contains an integer data member (value).
The constructor initializes the value member with the given integer (or 0 if no integer is provided).
The ! operator is overloaded to calculate the factorial of the integer stored in the Integer object.
In the main() function, an Integer object Ob is created with an initial value of 5.
The ! operator is used on the Ob object to calculate the factorial of its value, and the result is stored in the fact variable and printed out.
*/