#include <iostream>
using namespace std;

class mc {
public:
    mc() {
        cout << "Constructor called" << endl;
    }
    ~mc() {
        cout << "Destructor called" << endl;
    }
};
mc ob;
int main() {
    cout << "Program started" << endl;
    cout << "Program ended" << endl;
    return 0;
}
