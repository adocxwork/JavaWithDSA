#include <iostream>
#include <fstream>
#include <string>

using namespace std;

void encryptDecryptFile(const string& inputFileName, const string& outputFileName, char key) {
    ifstream inputFile(inputFileName, ios::binary);
    if (!inputFile) {
        cout << "Error: Unable to open input file." << endl;
        return;
    }

    ofstream outputFile(outputFileName, ios::binary);
    if (!outputFile) {
        cout << "Error: Unable to create output file." << endl;
        inputFile.close();
        return;
    }

    char ch;
    while (inputFile.get(ch)) {
        ch = ch ^ key;
        outputFile.put(ch);
    }

    inputFile.close();
    outputFile.close();
}

int main() {
    string inputFile = "input.txt";
    string encryptedFile = "encrypted.txt";
    string decryptedFile = "decrypted.txt";
    char key = 'K';

    encryptDecryptFile(inputFile, encryptedFile, key);
    cout << "File encrypted successfully." << endl;

    encryptDecryptFile(encryptedFile, decryptedFile, key);
    cout << "File decrypted successfully." << endl;

    return 0;
}
