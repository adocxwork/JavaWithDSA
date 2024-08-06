#include <iostream>

using namespace std;

// Function to perform linear search and return the index of the element
int linearSearch(int arr[], int size, int target) {
    for (int i = 0; i < size; ++i) {
        if (arr[i] == target) {
            return i;  // Element found, return its index
        }
    }
    return -1;  // Element not found
}

// Function to delete an element from the array at a given index
void deleteElement(int arr[], int& size, int index) {
    for (int i = index; i < size - 1; ++i) {
        arr[i] = arr[i + 1];
    }
    --size;  // Reduce the size of the array
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

    // Input the element to delete
    int target;
    cout << "Enter the element to delete: ";
    cin >> target;

    // Find the index of the element to delete
    int index = linearSearch(arr, size, target);

    // If the element is found, delete it; otherwise, print an error message
    if (index != -1) {
        deleteElement(arr, size, index);
        cout << "Array after deletion: ";
        for (int i = 0; i < size; ++i) {
            cout << arr[i] << " ";
        }
        cout << endl;
    } else {
        cout << "Error: element not found" << endl;
    }

    delete[] arr;  // Deallocate the memory used for the array

    return 0;
}
