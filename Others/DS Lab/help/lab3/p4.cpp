#include <iostream>

using namespace std;

// Function to check for duplicate elements in the array
bool hasDuplicates(int arr[], int size) {
    for (int i = 0; i < size; ++i) {
        for (int j = i + 1; j < size; ++j) {
            if (arr[i] == arr[j]) {
                return true;  // Duplicate found
            }
        }
    }
    return false;  // No duplicates found
}

int main() {
    int size;

    // Input the size of the array
    cout << "Enter the number of elements in the array: ";
    cin >> size;

    if (size <= 0) {
        cout << "Invalid size." << endl;
        return 1;
    }

    int* arr = new int[size];  // Dynamically allocate memory for the array

    // Input the elements of the array
    cout << "Enter " << size << " elements: ";
    for (int i = 0; i < size; ++i) {
        cin >> arr[i];
    }

    // Check for duplicates
    if (hasDuplicates(arr, size)) {
        cout << "The array contains duplicate elements." << endl;
    } else {
        cout << "The array does not contain any duplicate elements." << endl;
    }

    delete[] arr;  // Deallocate the memory used for the array

    return 0;
}
