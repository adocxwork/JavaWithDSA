#include <iostream>
using namespace std;

struct Date {
    int d;
    int m;
    int y;
};

int main() {
    Date uD;

    cout << "Enter a date in the format day/month/year: ";
    char s;
    cin >> uD.d >> s >> uD.m >> s >> uD.y;

    cout << "You entered: " << uD.d << "/" << uD.m << "/" << uD.y << endl;

    return 0;
}
