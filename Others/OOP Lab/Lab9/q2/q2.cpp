#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    // Open the file for reading
    ifstream inFile("TEXT.txt");
    if (!inFile) {
        cout << "Error: Unable to open file." << endl;
        return 1;
    }

    const int MAX_LINES = 100; // Maximum number of lines
    string lines[MAX_LINES]; // Array to store lines
    int lineCount = 0;

    // Read lines from the file and store them in the array
    string line;
    while (getline(inFile, line) && lineCount < MAX_LINES) {
        lines[lineCount++] = line;
    }

    inFile.close();

    // Display the lines
    if (lineCount == 0) {
        cout << "The file is empty." << endl;
    } else {
        cout << "Lines read from the file:" << endl;
        for (int i = 0; i < lineCount; ++i) {
            cout << lines[i] << endl;
        }
    }

    return 0;
}
