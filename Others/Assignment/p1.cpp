#include <iostream>
using namespace std;

struct Phone {
    int aC;
    int e;
    int n;
};

int main() {
    Phone mN = {212, 767, 8900};

    cout << "Enter your area code, exchange, and number: ";
    Phone userInput;
    cin >> userInput.aC >> userInput.e >> userInput.n;

    cout << "My number is (" << mN.aC << ") " << mN.e << "-" << mN.n << endl;
    cout << "Your number is (" << userInput.aC << ") " << userInput.e << "-" << userInput.n << endl;

    return 0;
}
