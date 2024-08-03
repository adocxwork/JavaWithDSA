#include <iostream>

using namespace std;

// Function template to find the maximum element in an array
template <typename T>
T findMax(const T array[], int size) {
    T maxElement = array[0];
    for (int i = 1; i < size; ++i) {
        if (array[i] > maxElement) {
            maxElement = array[i];
        }
    }
    return maxElement;
}

int main() {
    // Integer array
    int intArray[] = {5, 10, 3, 8, 15};
    int intMax = findMax(intArray, 5);
    cout << "Maximum element in integer array: " << intMax << endl;

    // Float array
    float floatArray[] = {3.14, 2.71, 1.618, 0.577, 2.718};
    float floatMax = findMax(floatArray, 5);
    cout << "Maximum element in float array: " << floatMax << endl;

    // Char array
    char charArray[] = {'a', 'z', 'c', 'g', 'm'};
    char charMax = findMax(charArray, 5);
    cout << "Maximum element in char array: " << charMax << endl;

    return 0;
}
