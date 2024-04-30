#include <iostream>
#include <fstream>
#include <string>

using namespace std;

struct Employee {
    string firstName;
    char middleInitial;
    string lastName;
    unsigned long employeeNumber;
};

int main() {
    string filename = "employee_data.txt";
    ofstream outFile(filename, ios::app); // Open file for appending

    if (!outFile.is_open()) {
        cerr << "Error: Unable to open file for writing." << endl;
        return 1; // Exit with error code 1 if unable to open file
    }

    char choice;
    do {
        Employee emp;

        cout << "Enter first name: ";
        cin >> emp.firstName;

        cout << "Enter middle initial: ";
        cin >> emp.middleInitial;

        cout << "Enter last name: ";
        cin >> emp.lastName;

        cout << "Enter employee number: ";
        cin >> emp.employeeNumber;

        outFile << emp.firstName << " " << emp.middleInitial << " " << emp.lastName << " " << emp.employeeNumber << endl;

        cout << "Do you want to enter another employee data? (Y/N): ";
        cin >> choice;

    } while (toupper(choice) == 'Y');

    outFile.close(); // Close ofstream object

    ifstream inFile(filename);

    if (!inFile.is_open()) {
        cerr << "Error: Unable to open file for reading." << endl;
        return 1; // Exit with error code 1 if unable to open file
    }

    cout << "Employee Data:" << endl;
    string line;
    while (getline(inFile, line)) {
        cout << line << endl;
    }

    inFile.close(); // Close ifstream object

    return 0;
}
