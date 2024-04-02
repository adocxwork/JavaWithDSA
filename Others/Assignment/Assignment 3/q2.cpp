#include <iostream>
#include <string>

using namespace std;

bool areRotations(string str1, string str2) {
    // Check if lengths of both strings are equal and not empty
    if (str1.length() != str2.length() || str1.empty() || str2.empty()) {
        return false;
    }

    // Concatenate str1 with itself
    string concatenatedStr = str1 + str1;

    // Check if str2 is a substring of concatenatedStr
    if (concatenatedStr.find(str2) != string::npos) {
        return true;
    }

    return false;
}

int main() {
    string s1, s2;
    cout << "Enter the first string: ";
    cin >> s1;
    cout << "Enter the second string: ";
    cin >> s2;

    // Check if s1 and s2 are rotations of each other
    if (areRotations(s1, s2)) {
        cout << "TRUE" << endl;
    } else {
        cout << "FALSE" << endl;
    }

    return 0;
}
