#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main() {
    ifstream file1("file1.txt");
    if (!file1) {
        cout << "Error: Unable to open file1.txt." << endl;
        return 1;
    }

    ifstream file2("file2.txt");
    if (!file2) {
        cout << "Error: Unable to open file2.txt." << endl;
        file1.close();
        return 1;
    }

    ofstream outFile("merged_file.txt");
    if (!outFile) {
        cout << "Error: Unable to create merged_file.txt." << endl;
        file1.close();
        file2.close();
        return 1;
    }

    char ch;
    while (file1.get(ch)) outFile.put(ch);
    while (file2.get(ch)) outFile.put(ch);

    file1.close();
    file2.close();
    outFile.close();
    cout << "Files merged successfully." << endl;
    return 0;
}
