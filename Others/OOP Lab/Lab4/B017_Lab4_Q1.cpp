// This program is written by Aditya Gupta(231B017)
#include <iostream>
#include <string>
using namespace std;
class Student {
    private:
    string name;
    int roll_no;

    public:
    void setdata() {
        cout << "Enter name: ";
        getline(cin, name);
        cout << "Enter roll number: ";
        cin >> roll_no;
    }
    void showdata() {
        cout << "Name: " << name << endl;
        cout << "Roll number: " << roll_no << endl;
    }
};
int main() {
    Student student;
    student.setdata();
    cout << "\nStudent Details:" << endl;
    student.showdata();
    return 0;
}
