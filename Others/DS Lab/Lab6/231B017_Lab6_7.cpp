#include <iostream>

using namespace std;

void insertionSort(char arr[], int n, int &shifts) {
    for (int i = 1; i < n; ++i) {
        char key = arr[i];
        int j = i - 1;

        // Move elements of arr[0..i-1] that are greater than key
        // to one position ahead of their current position
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j];
            --j;
            ++shifts; // Count each shift
        }
        arr[j + 1] = key;
    }
}

int main() {
    const int MAX_SIZE = 100; // Adjust size as needed
    char arr[MAX_SIZE];
    int n;

    cout << "Enter the number of characters: ";
    cin >> n;

    if (n > MAX_SIZE) {
        cout << "Error: Number of characters exceeds maximum allowed size." << endl;
        return 1;
    }

    cout << "Enter the characters: ";
    for (int i = 0; i < n; ++i) {
        cin >> arr[i];
    }

    int shifts = 0;
    insertionSort(arr, n, shifts);

    cout << "Sorted array: ";
    for (int i = 0; i < n; ++i) {
        cout << arr[i] << ' ';
    }
    cout << endl;

    cout << "Number of shifts: " << shifts << endl;

    return 0;
}
