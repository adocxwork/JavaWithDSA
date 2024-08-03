#include <iostream>
#include <string>
using namespace std;
class Mother {
public:
    void display() {
        cout << "I am the mother." << endl;
    }
};
class Daughter : public Mother {
public:
    void display() {
        cout << "I am the daughter." << endl;
    }
};
int main() {
    Daughter daughterObj;
    daughterObj.display();
    daughterObj.Mother::display();
    return 0;
}