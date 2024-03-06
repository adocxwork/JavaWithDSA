#include <iostream>
#include <string>
using namespace std;
class BankAccount {
    int accountNumber;
    string accountHolderName;
    double balance;

public:
    BankAccount() {
        accountNumber = 0;
        accountHolderName = "";
        balance = 0.0;
    }
    BankAccount(int aN, string ahn) {
        accountNumber = aN;
        accountHolderName = ahn;
        balance = 0.0;
    }
    BankAccount(int an, string ahn, double bal) {
        accountNumber = an;
        accountHolderName = ahn;
        balance = bal;
    }
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            cout << "Insufficient balance!" << endl;
        }
    }
    void display() {
        cout << "Account Number: " << accountNumber << endl;
        cout << "Account Holder Name: " << accountHolderName << endl;
        cout << "Balance: " << balance << endl;
    }
};

int main() {
    BankAccount a1;
    BankAccount a2(928373, "Adi");
    BankAccount a3(789012, "Aditya", 1000.0);

    a1.deposit(500);
    a2.withdraw(200);
    a3.deposit(300);
    a3.withdraw(1500);

    cout << "Account 1 :-" << endl;
    a1.display();
    cout << "Account 2 :-" << endl;
    a2.display();
    cout << "Account 3 :-" << endl;
    a3.display();
    return 0;
}
