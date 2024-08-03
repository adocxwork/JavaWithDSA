#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    ifstream sourceFile("source.txt", ios::binary);
    if (!sourceFile) {
        cout << "Error: Unable to open source file." << endl;
        return 1;
    }

    ofstream destFile("destination.txt", ios::binary);
    if (!destFile) {
        cout << "Error: Unable to create destination file." << endl;
        return 1;
    }

    // Copy contents from source to destination
    char buffer[1024];
    while (!sourceFile.eof()) {
        sourceFile.read(buffer, sizeof(buffer));
        streamsize bytesRead = sourceFile.gcount();
        destFile.write(buffer, bytesRead);
    }

    sourceFile.close();
    destFile.close();

    cout << "File copied successfully." << endl;

    return 0;
}
