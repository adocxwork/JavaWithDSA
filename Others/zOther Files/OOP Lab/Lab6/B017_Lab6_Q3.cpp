#include <iostream>
#include <string>
using namespace std;
class MyString {
    string str;
public:
    MyString() {}
    MyString(const string& s) : str(s) {}
    MyString operator+(const MyString& other) const {
        MyString result;
        result.str = this->str + other.str;
        return result;
    }
    void display() const {
        cout << str << endl;
    }
};

int main() {
    MyString uninitialized1, uninitialized2;
    MyString str1("Hello"), str2(" World!");
    MyString ans = str1 + str2;
    cout << "Concatenated String: ";
    ans.display();
    return 0;
}
