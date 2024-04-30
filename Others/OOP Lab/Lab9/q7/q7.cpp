#include <iostream>
#include <fstream>
#include <string>

using namespace std;

struct Employee {
    string firstName;
    string middleInitial;
    string lastName;
    unsigned long employeeNumber;
};

int main() {
    // Prompt the user to enter name data
    char choice;
    ofstream outFile("employee_data.txt");

    if (!outFile) {
        cout << "Error: Unable to create file." << endl;
        return 1;
    }

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

        // Write data to the file
        outFile << emp.firstName << " " << emp.middleInitial << " " << emp.lastName << " " << emp.employeeNumber << endl;

        cout << "Do you want to enter another employee data? (Y/N): ";
        cin >> choice;
    } while (choice == 'Y' || choice == 'y');

    outFile.close();

    // Open the file for reading
    ifstream inFile("employee_data.txt");
    if (!inFile) {
        cout << "Error: Unable to open file." << endl;
        return 1;
    }

    // Read and display all the data in the file
    Employee emp;
    while (inFile >> emp.firstName >> emp.middleInitial >> emp.lastName >> emp.employeeNumber) {
        cout << "First Name: " << emp.firstName << endl;
        cout << "Middle Initial: " << emp.middleInitial << endl;
        cout << "Last Name: " << emp.lastName << endl;
        cout << "Employee Number: " << emp.employeeNumber << endl;
        cout << endl;
    }

    inFile.close();

    return 0;
}
