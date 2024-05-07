#include <iostream>

using namespace std;

// Generic class template
template <typename T>
class Pair {
private:
    T first;
    T second;

public:
    Pair(T first, T second) : first(first), second(second) {}

    T getFirst() const {
        return first;
    }

    T getSecond() const {
        return second;
    }

    void setFirst(T value) {
        first = value;
    }

    void setSecond(T value) {
        second = value;
    }
};

int main() {
    // Creating a Pair of integers
    Pair<int> intPair(5, 10);
    cout << "Integer Pair: " << intPair.getFirst() << ", " << intPair.getSecond() << endl;

    // Creating a Pair of doubles
    Pair<double> doublePair(3.14, 6.28);
    cout << "Double Pair: " << doublePair.getFirst() << ", " << doublePair.getSecond() << endl;

    // Creating a Pair of strings
    Pair<string> stringPair("Hello", "World");
    cout << "String Pair: " << stringPair.getFirst() << ", " << stringPair.getSecond() << endl;

    return 0;
}
