#include <iostream>
#include <fstream>
using namespace std;
int main() {
    int lines=0;
    char str1[100];

    ifstream inf("TEXT.txt"), inf2("TEXT.txt");
    if (inf.good())
        cout << "Every thing is okay.." << endl;
    else {
        cout << "Something went wrong.." << endl;
        return 0;
    }
    while (inf) {
        inf.getline(str1, 100);
        lines++;
    }

    ofstream outf("TEXT_copy.txt");
    char str2[lines-1][100];
    for(int i=0; i<lines-1; i++){
        inf2.getline(str2[i], 100);
        outf << str2[i] << "\n" ;
    }

    inf.close();
    inf2.close();
    outf.close();
    return 0;
}