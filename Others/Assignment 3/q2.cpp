#include <iostream>
#include <string>
using namespace std;

bool areRotations(string str1, string str2) {
    if (str1.length() != str2.length() || str1.empty() || str2.empty()) {
        return false;
    }
    string cstr = str1 + str1;
    if (cstr.find(str2) != string::npos) return true;
    return false;
}

int main() {
    string s1, s2;
    cout << "Enter the first string: ";
    cin >> s1;
    cout << "Enter the second string: ";
    cin >> s2;
    if (areRotations(s1, s2)) cout << "TRUE" << endl;
    else cout << "FALSE" << endl;
    return 0;
}
