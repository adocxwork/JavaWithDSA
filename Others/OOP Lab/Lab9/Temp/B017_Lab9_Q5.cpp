#include <iostream>
#include <fstream>
#include <string>

using namespace std;

// Function to encrypt text using Caesar cipher
string encrypt(const string& text, int shift) {
    string result = "";

    for (char ch : text) {
        if (isalpha(ch)) {
            char base = isupper(ch) ? 'A' : 'a';
            result += static_cast<char>((ch - base + shift) % 26 + base);
        } else {
            result += ch;
        }
    }

    return result;
}

// Function to decrypt text using Caesar cipher
string decrypt(const string& text, int shift) {
    return encrypt(text, 26 - shift); // Decryption is just encryption with the inverse shift
}

// Function to read text from a file
string readFromFile(const string& filename) {
    ifstream file(filename);
    if (!file.is_open()) {
        cerr << "Error: Unable to open " << filename << endl;
        return "";
    }

    string content((istreambuf_iterator<char>(file)), (istreambuf_iterator<char>()));
    file.close();
    return content;
}

// Function to write text to a file
void writeToFile(const string& filename, const string& content) {
    ofstream file(filename);
    if (!file.is_open()) {
        cerr << "Error: Unable to create/open " << filename << " for writing." << endl;
        return;
    }

    file << content;
    file.close();
}

int main() {
    string inputFilename = "input.txt";
    string encryptedFilename = "encrypted.txt";
    string decryptedFilename = "decrypted.txt";

    // Read text from input file
    string originalText = readFromFile(inputFilename);
    if (originalText.empty()) {
        return 1; // Exit with error code 1 if unable to read input file
    }

    // Encrypt the text
    int shift = 3; // Example Caesar cipher shift value
    string encryptedText = encrypt(originalText, shift);

    // Write encrypted text to file
    writeToFile(encryptedFilename, encryptedText);

    // Decrypt the encrypted text
    string decryptedText = decrypt(encryptedText, shift);

    // Write decrypted text to file
    writeToFile(decryptedFilename, decryptedText);

    cout << "Encryption and decryption completed successfully." << endl;

    return 0;
}
