#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    // Create and write to the file
    ofstream outFile("TEXT.txt");
    if (!outFile) {
        cout << "Error: Unable to create file." << endl;
        return 1;
    }
    
    outFile << "This is a sample text file.\n";
    outFile << "It contains several lines.\n";
    outFile << "Each line has multiple words.\n";
    outFile.close();

    // Read from the file and display information
    ifstream inFile("TEXT.txt");
    if (!inFile) {
        cout << "Error: Unable to open file." << endl;
        return 1;
    }

    string line;
    int lineCount = 0, wordCount = 0, charCount = 0;

    while (getline(inFile, line)) {
        lineCount++;
        charCount += line.length();
        
        // Counting words in each line
        size_t pos = 0;
        while ((pos = line.find(' ', pos)) != string::npos) {
            wordCount++;
            pos++;
        }
    }

    inFile.close();

    // Adding the last line's word count
    wordCount++;

    cout << "Number of lines: " << lineCount << endl;
    cout << "Number of words: " << wordCount << endl;
    cout << "Number of characters: " << charCount << endl;

    return 0;
}
