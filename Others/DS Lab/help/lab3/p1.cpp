#include <iostream>

using namespace std;

// Function to insert a new element at a specific index
void insertElement(int arr[], int& size, int element, int index, int capacity) {
    if (size >= capacity) {
        cout << "Array is full. Cannot insert new element." << endl;
        return;
    }
    if (index < 0 || index > size) {
        cout << "Invalid index." << endl;
        return;
    }

    // Shift elements to the right to make space for the new element
    for (int i = size; i > index; --i) {
        arr[i] = arr[i - 1];
    }

    // Insert the new element at the specified index
    arr[index] = element;
    ++size;  // Increase the size of the array
}

int main() {
    int capacity = 100; // Maximum capacity of the array
    int size = 0; // Initial size of the array
    int arr[capacity];

    // Input existing elements
    cout << "Enter the number of elements currently in the array: ";
    int numElements;
    cin >> numElements;

    if (numElements > capacity) {
        cout << "Number of elements exceeds the capacity of the array." << endl;
        return 1;
    }

    size = numElements;
    cout << "Enter " << size << " elements: ";
    for (int i = 0; i < size; ++i) {
        cin >> arr[i];
    }

    // Input new element and index
    int element, index;
    cout << "Enter the element to insert: ";
    cin >> element;
    cout << "Enter the index at which to insert the new element: ";
    cin >> index;

    // Insert the element
    insertElement(arr, size, element, index, capacity);

    // Output the updated array
    cout << "Array after insertion: ";
    for (int i = 0; i < size; ++i) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
