#include <iostream>
using namespace std;

class Check_Adjacent {
    int Arr[100];
    int Size;

public:
    Check_Adjacent() : Size(0) {}
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
    void Show_Data() {
        cout << "Array elements:" << endl;
        for (int i = 0; i < Size; ++i) {
            cout << Arr[i] << " ";
        }
        cout << endl;
    }
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
    obj.Input_Data();
    obj.Show_Data();
    obj.Check_Adjacent_Elements();
    return 0;
}