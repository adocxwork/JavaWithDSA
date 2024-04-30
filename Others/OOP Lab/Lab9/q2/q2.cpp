#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    ifstream inFile("TEXT.txt");
    if (!inFile) {
        cout << "Error: Unable to open file." << endl;
        return 1;
    }

    const int MAX_LINES = 100;
    string lines[MAX_LINES];
    int lineCount = 0;

    string line;
    while (getline(inFile, line) && lineCount < MAX_LINES) {
        lines[lineCount++] = line;
    }
    inFile.close();

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
