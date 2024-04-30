#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    // Open the source file for reading
    ifstream sourceFile("source.txt", ios::binary);
    if (!sourceFile) {
        cout << "Error: Unable to open source file." << endl;
        return 1;
    }

    // Open the destination file for writing
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

    // Close files
    sourceFile.close();
    destFile.close();

    cout << "File copied successfully." << endl;

    return 0;
}
