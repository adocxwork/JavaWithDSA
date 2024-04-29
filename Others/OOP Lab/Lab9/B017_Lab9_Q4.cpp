#include <iostream>
#include <fstream>
#include <string>

using namespace std;

void mergeFiles(string filename1, string filename2, string outputFilename) {
    ifstream file1(filename1);
    ifstream file2(filename2);
    ofstream outputFile(outputFilename);

    if (!file1.is_open()) {
        cerr << "Error: Unable to open " << filename1 << endl;
        return;
    }

    if (!file2.is_open()) {
        cerr << "Error: Unable to open " << filename2 << endl;
        return;
    }

    if (!outputFile.is_open()) {
        cerr << "Error: Unable to create/open " << outputFilename << " for writing." << endl;
        return;
    }

    string line;

    while (getline(file1, line)) {
        outputFile << line << endl;
    }

    while (getline(file2, line)) {
        outputFile << line << endl;
    }

    cout << "Files merged successfully into " << outputFilename << endl;

    file1.close();
    file2.close();
    outputFile.close();
}

int main() {
    string file1 = "f1.txt";
    string file2 = "f2.txt";
    string outputFile = "f3.txt";

    mergeFiles(file1, file2, outputFile);

    return 0;
}
