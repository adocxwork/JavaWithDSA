#include <iostream>

using namespace std;

class Check_Adjacent {
private:
    int Arr[100];
    int Size;

public:
    // Constructor to initialize Size to 0
    Check_Adjacent() : Size(0) {}

    // Function to input data for Arr and Size
    void Input_Data() {
        cout << "Enter the size of the array (not more than 100): ";
        cin >> Size;

        if (Size > 100) {
            cerr << "Error: Size cannot exceed 100." << endl;
            return;
        }

        cout << "Enter " << Size << " elements for the array:" << endl;
        for (int i = 0; i < Size; ++i) {
            cin >> Arr[i];
        }
    }

    // Function to display the elements of Arr
    void Show_Data() {
        cout << "Array elements:" << endl;
        for (int i = 0; i < Size; ++i) {
            cout << Arr[i] << " ";
        }
        cout << endl;
    }

    // Function to check for adjacent occurrences of the same number
    void Check_Adjacent_Elements() {
        int count = 0;
        for (int i = 0; i < Size - 1; ++i) {
            if (Arr[i] == Arr[i + 1]) {
                count++;
            }
        }
        cout << "Count of adjacent occurrences of the same number: " << count << endl;
    }
};

int main() {
    Check_Adjacent obj;

    // Input data
    obj.Input_Data();

    // Show data
    obj.Show_Data();

    // Check for adjacent occurrences of the same number
    obj.Check_Adjacent_Elements();

    return 0;
}
/*
This code defines a class Check_Adjacent with private data members Arr (an array of integers) and Size (to store the array size). It provides member functions to input data for Arr and Size, display the elements of Arr, and check for adjacent occurrences of the same number.

In the main() function, an object obj of class Check_Adjacent is created. The member functions are called on this object to perform the desired operations.
*/