#include <iostream>
#include <fstream>

using namespace std;

// Function to read integers from a file
bool readIntegersFromFile(const string& filename, int array[], int& size) {
    ifstream file(filename);
    if (!file.is_open()) {
        cerr << "Error: Unable to open " << filename << endl;
        return false;
    }

    size = 0;
    int num;
    while (file >> num) {
        array[size++] = num;
    }

    file.close();
    return true;
}

// Function to write integers to a file
bool writeIntegersToFile(const string& filename, int array[], int size) {
    ofstream file(filename);
    if (!file.is_open()) {
        cerr << "Error: Unable to create/open " << filename << " for writing." << endl;
        return false;
    }

    for (int i = 0; i < size; ++i) {
        file << array[i] << endl;
    }

    file.close();
    return true;
}

// Function to merge two sorted arrays
void mergeSortedArrays(int arr1[], int size1, int arr2[], int size2, int result[]) {
    int i = 0, j = 0, k = 0;

    while (i < size1 && j < size2) {
        if (arr1[i] < arr2[j]) {
            result[k++] = arr1[i++];
        } else {
            result[k++] = arr2[j++];
        }
    }

    while (i < size1) {
        result[k++] = arr1[i++];
    }

    while (j < size2) {
        result[k++] = arr2[j++];
    }
}

int main() {
    const int MAX_SIZE = 1000; // Max size for the arrays
    int arr1[MAX_SIZE], arr2[MAX_SIZE];
    int size1 = 0, size2 = 0;

    // Read integers from source files
    if (!readIntegersFromFile("Source1.txt", arr1, size1) || !readIntegersFromFile("Source2.txt", arr2, size2)) {
        return 1; // Exit with error code 1 if unable to read from any source file
    }

    // Merge the sorted arrays
    int mergedSize = size1 + size2;
    int mergedArray[MAX_SIZE];
    mergeSortedArrays(arr1, size1, arr2, size2, mergedArray);

    // Write merged array to target file
    if (!writeIntegersToFile("Target.txt", mergedArray, mergedSize)) {
        return 1; // Exit with error code 1 if unable to write to target file
    }

    cout << "Merged list written to Target.txt" << endl;

    return 0;
}
