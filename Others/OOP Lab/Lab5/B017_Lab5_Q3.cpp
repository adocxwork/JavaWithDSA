#include <iostream>
using namespace std;

class MyClass {
public:
    MyClass() {
        cout << "Constructor called" << endl;
    }

    ~MyClass() {
        cout << "Destructor called" << endl;
    }
};

MyClass globalObject; // Globally declared object

int main() {
    cout << "Program started" << endl;

    // Any additional code can be added here

    cout << "Program ended" << endl;

    return 0;
}
