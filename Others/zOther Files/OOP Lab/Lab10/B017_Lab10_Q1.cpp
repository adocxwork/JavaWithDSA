#include <iostream>

// Function template to swap two items
template <typename T>
void swap(T& a, T& b) {
    T temp = a;
    a = b;
    b = temp;
}

int main() {
    int int1 = 5, int2 = 10;
    double double1 = 3.14, double2 = 6.28;
    char char1 = 'A', char2 = 'B';

    // Swapping integers
    swap(int1, int2);
    std::cout << "After swapping integers: " << int1 << ", " << int2 << std::endl;

    // Swapping doubles
    swap(double1, double2);
    std::cout << "After swapping doubles: " << double1 << ", " << double2 << std::endl;

    // Swapping characters
    swap(char1, char2);
    std::cout << "After swapping characters: " << char1 << ", " << char2 << std::endl;

    return 0;
}
