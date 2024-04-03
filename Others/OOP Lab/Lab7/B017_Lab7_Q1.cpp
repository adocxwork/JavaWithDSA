#include <iostream>
#include <string>
using namespace std;
class Student {
protected:
    int rollNumber;
    string name;
public:
    void getStu() {
        cout<<"Enter roll no & name :-"<<endl;
        cin >> rollNumber;
        cin.ignore();
        getline(cin, name);
    }
    void stuInfo(){
        cout << "Roll No : " << rollNumber << endl;
        cout << "Name : " << name << endl;
    }
};

class Exam : public Student {
protected:
    int marks[6];
public:
    void getMarks() {
        cout<<"Enter marks :-"<<endl;
        for(int i=0; i<6; i++) {
            cin >> marks[i];
        }
    }
    void marksInfo() {
        cout << "Marks in Subjects: ";
        for (int i = 0; i < 6; ++i) {
            cout << marks[i] << " ";
        }
        cout << endl;
    }
};

class Result : public Exam {
private:
    int totalMarks;
public:
    void displayResult() {
        totalMarks = 0;
        for(int i=0; i<6; i++){
            totalMarks += marks[i];
        }
        stuInfo();
        marksInfo();
        cout << "Total Marks : " << totalMarks << endl;
    }
};

int main() {
    Result r;
    r.getStu();
    r.getMarks();
    cout<<"Info :-\n\n";
    r.displayResult();
    return 0;
}
