#include <iostream>
#include <fstream>
#include <string>

using namespace std;

// Function to encrypt or decrypt the contents of a file using XOR operation
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
        ch = ch ^ key; // Perform XOR operation with the key
        outputFile.put(ch);
    }

    inputFile.close();
    outputFile.close();
}

int main() {
    string inputFile = "input.txt";
    string encryptedFile = "encrypted.txt";
    string decryptedFile = "decrypted.txt";
    char key = 'K'; // Encryption key

    // Encrypt the input file
    encryptDecryptFile(inputFile, encryptedFile, key);
    cout << "File encrypted successfully." << endl;

    // Decrypt the encrypted file
    encryptDecryptFile(encryptedFile, decryptedFile, key);
    cout << "File decrypted successfully." << endl;

    return 0;
}
