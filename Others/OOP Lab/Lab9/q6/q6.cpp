#include <iostream>
#include <fstream>

using namespace std;

int* mergeSortedArrays(int arr1[], int size1, int arr2[], int size2) {
    int* merged = new int[size1 + size2];
    int i = 0, j = 0, k = 0;

    while (i < size1 && j < size2) {
        if (arr1[i] < arr2[j]) {
            merged[k++] = arr1[i++];
        } else {
            merged[k++] = arr2[j++];
        }
    }
    while (i < size1) {
        merged[k++] = arr1[i++];
    }
    while (j < size2) {
        merged[k++] = arr2[j++];
    }
    return merged;
}

int* readIntegersFromFile(const string& filename, int& size) {
    ifstream file(filename);
    int* numbers = nullptr;
    int num, count = 0;

    if (!file) {
        cerr << "Error: Unable to open " << filename << "." << endl;
        return nullptr;
    }

    while (file >> num) {
        count++;
    }

    file.close();

    size = count;
    numbers = new int[size];

    file.open(filename);
    for (int i = 0; i < size; ++i) {
        file >> numbers[i];
    }

    file.close();

    for (int i = 1; i < size; ++i) {
        int key = numbers[i];
        int j = i - 1;

        while (j >= 0 && numbers[j] > key) {
            numbers[j + 1] = numbers[j];
            j = j - 1;
        }
        numbers[j + 1] = key;
    }

    return numbers;
}

void writeIntegersToFile(const string& filename, int arr[], int size) {
    ofstream file(filename);
    if (!file) {
        cerr << "Error: Unable to create " << filename << "." << endl;
        return;
    }

    for (int i = 0; i < size; ++i) {
        file << arr[i] << endl;
    }

    file.close();
}

int main() {
    int size1, size2;
    int* source1 = readIntegersFromFile("Source1.txt", size1);
    int* source2 = readIntegersFromFile("Source2.txt", size2);
    int* merged = mergeSortedArrays(source1, size1, source2, size2);

    writeIntegersToFile("Target.txt", merged, size1 + size2);
    cout << "Merged list stored in Target.txt successfully." << endl;

    delete[] source1;
    delete[] source2;
    delete[] merged;

    return 0;
}
