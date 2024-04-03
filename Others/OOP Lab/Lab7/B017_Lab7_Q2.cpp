#include <iostream>
#include <string>
using namespace std;

class Student {
protected:
    string school;
    string highestDegree;
public:
    void getStu(){
        cout<<"Enter school & degree :-"<<endl;
        cin.ignore();
        getline(cin, school);
        getline(cin, highestDegree);
    }
    void displayStudent() {
        cout << "School/University: " << school << endl;
        cout << "Highest Degree: " << highestDegree << endl;
    }
};

class Employee {
protected:
    string name;
    int employeeNumber;
public:
    void getEmp() {
        cout<<"Enter name & employee no :-"<<endl;
        cin.ignore();
        getline(cin, name);
        cin>>employeeNumber;
    }
    void displayEmployee() {
        cout << "Name: " << name << endl;
        cout << "Employee Number: " << employeeNumber << endl;
    }
};
class Manager : public Employee, public Student {
private:
    string title;
    float dues;
public:
    void getManager(){
        getStu();
        getEmp();
        cin.ignore();
        cout<<"Enter title & dues :-"<<endl;
        getline(cin, title);
        cin>>dues;
    }
    void displayManager() {
        displayStudent();
        displayEmployee();
        cout << "Title: " << title << endl;
        cout << "Dues: $" << dues << endl;
    }
};
class Scientist : public Employee, public Student {
private:
    int numPublications;
public:
    void getScientist(){
        getStu();
        getEmp();
        cout<<"Enter no of publications : ";
        cin>>numPublications;
    }
    void displayScientist() {
        displayStudent();
        displayEmployee();
        cout << "Number of Publications: " << numPublications << endl;
    }
};
class Laborer : public Employee {
public:
    void getLaborer(){
        getEmp();
    }
    void displayLaborer() {
        displayEmployee();
    }
};

int main() {
    cout<<"Manager :-"<<endl;
    Manager m;
    m.getManager();
    m.displayManager();
    cout<<endl;

    cout<<"Scientist :-"<<endl;
    Scientist s;
    s.getScientist();
    s.displayScientist();
    cout<<endl;

    cout<<"Laborer :-"<<endl;
    Laborer l;
    l.getLaborer();
    l.displayLaborer();
    return 0;
}
