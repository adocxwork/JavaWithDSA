#include <iostream>
#include <sstream>
#include <string>

using namespace std;

// Function to check if a word is in the known words array
bool isKnownWord(const string& word, const string knownWords[], int knownSize) {
    for (int i = 0; i < knownSize; ++i) {
        if (word == knownWords[i]) {
            return true;
        }
    }
    return false;
}

// Function to find unknown words in the text
void findUnknownWords(const string& text, const string knownWords[], int knownSize) {
    // Create a static array to store unknown words
    string unknownWords[100];
    int unknownCount = 0;

    // Use stringstream to split the text into words
    stringstream ss(text);
    string word;

    while (ss >> word) {
        // Remove punctuation from the word (basic implementation)
        word.erase(remove_if(word.begin(), word.end(), ::ispunct), word.end());

        // Check if the word is not in the known words array
        if (!isKnownWord(word, knownWords, knownSize)) {
            // Check if the word is not already in the unknownWords array
            bool alreadyFound = false;
            for (int i = 0; i < unknownCount; ++i) {
                if (word == unknownWords[i]) {
                    alreadyFound = true;
                    break;
                }
            }

            if (!alreadyFound) {
                unknownWords[unknownCount++] = word;
            }
        }
    }

    // Print the result
    if (unknownCount == 0) {
        cout << "Successful" << endl;
    } else {
        cout << "{";
        for (int i = 0; i < unknownCount; ++i) {
            if (i > 0) cout << ", ";
            cout << "\"" << unknownWords[i] << "\"";
        }
        cout << "}" << endl;
    }
}

int main() {
    string text = "the sun rises in the east";
    string knownWords[] = {"sun", "in", "east", "doctor", "day"};
    int knownSize = sizeof(knownWords) / sizeof(knownWords[0]);

    findUnknownWords(text, knownWords, knownSize);

    return 0;
}
