#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int flip() {
    return rand() % 2; // Returns 0 for tails and 1 for heads
}

int main() {
    srand(time(0)); // Seed the random number generator

    int hC = 0;
    int tC = 0;

    for (int i = 0; i < 100; ++i) {
        int r = flip();
        if (r == 0) {
            cout << "Tails\n";
            tC++;
        } else {
            cout << "Heads\n";
            hC++;
        }
    }

    cout << endl;
    cout << "Number of Heads: " << hC << endl;
    cout << "Number of Tails: " << tC << endl;

    return 0;
}