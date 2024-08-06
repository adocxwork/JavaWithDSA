#include <iostream>

using namespace std;

// Function to perform linear search
int linearSearch(int arr[], int size, int target) {
    for (int i = 0; i < size; ++i) {
        if (arr[i] == target) {
            return i;  // Element found, return its index
        }
    }
    return -1;  // Element not found
}

int main() {
    int size;

    // Input the size of the array
    cout << "Enter the number of elements in the array: ";
    cin >> size;

    int* arr = new int[size];  // Dynamically allocate memory for the array

    // Input the elements of the array
    cout << "Enter " << size << " elements: ";
    for (int i = 0; i < size; ++i) {
        cin >> arr[i];
    }

    // Input the element to search for
    int target;
    cout << "Enter the element to search for: ";
    cin >> target;

    // Perform the search
    int index = linearSearch(arr, size, target);

    // Output the result
    if (index != -1) {
        cout << "Element " << target << " found at index " << index << "." << endl;
    } else {
        cout << "Element " << target << " not found in the array." << endl;
    }

    delete[] arr;  // Deallocate the memory used for the array

    return 0;
}
