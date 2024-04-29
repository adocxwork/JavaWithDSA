#include <iostream>
#include <fstream>
#include <cstring>
using namespace std;

int main()
{
    char str1[100], str2[100], str3[50];
    int lines = 0, words = 0, ch = 0, nol;
    cout << "Enter no of lines to be entered : ";
    cin >> nol;
    cin.ignore();

    // writing
    ofstream outf("TEXT.txt");

    if (outf.good())
    {
        cout << "Every thing is okay.." << endl;
    }
    else
    {
        cout << "Something went wrong.." << endl;
        return 0;
    }

    cout << "Enter " << nol << " lines :-\n"
         << endl;
    for (int i = 0; i < nol; i++)
    {
        cin.getline(str1, 100);
        outf << str1 << "\n";
    }
    outf.close();

    // reading
    ifstream inf("TEXT.txt"), tempObj("TEXT.txt");

    if (inf.good())
    {
        cout << "\nEvery thing is okay.." << endl;
    }
    else
    {
        cout << "Something went wrong.." << endl;
        return 0;
    }

    cout << "Text from file :-\n"
         << endl;
    while (inf)
    {
        inf.getline(str2, 100);
        cout << str2 << endl;
        lines++;
        ch += strlen(str2);
    }
    while (tempObj.eof() != 1)
    {
        tempObj >> str3;
        words++;
    }
    tempObj.close();
    inf.close();

    cout << "Lines : " << lines - 1 << endl;
    cout << "Words : " << words - 1 << endl;
    cout << "Characters : " << ch << endl;

    return 0;
}
