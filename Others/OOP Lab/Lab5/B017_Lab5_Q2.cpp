#include <iostream>
#include <string>
using namespace std;

class BankAccount {
private:
    int accountNumber;
    string accountHolderName;
    double balance;

public:
    // Constructors
    BankAccount() {
        accountNumber = 0;
        accountHolderName = "";
        balance = 0.0;
    }

    BankAccount(int accNum, string accHolderName) {
        accountNumber = accNum;
        accountHolderName = accHolderName;
        balance = 0.0;
    }

    BankAccount(int accNum, string accHolderName, double bal) {
        accountNumber = accNum;
        accountHolderName = accHolderName;
        balance = bal;
    }

    // Member function to deposit money
    void deposit(double amount) {
        balance += amount;
    }

    // Member function to withdraw money
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            cout << "Insufficient funds. Withdrawal not processed." << endl;
        }
    }

    // Member function to display account details
    void display() {
        cout << "Account Number: " << accountNumber << endl;
        cout << "Account Holder Name: " << accountHolderName << endl;
        cout << "Balance: " << balance << endl;
    }
};

int main() {
    // Creating objects using all three constructors
    BankAccount account1;
    BankAccount account2(123456, "Alice");
    BankAccount account3(789012, "Bob", 1000.0);

    // Performing deposit and withdrawal operations
    account1.deposit(500);
    account2.withdraw(200);
    account3.deposit(300);
    account3.withdraw(1500);

    // Displaying account details
    cout << "Account 1 details:" << endl;
    account1.display();
    cout << endl;

    cout << "Account 2 details:" << endl;
    account2.display();
    cout << endl;

    cout << "Account 3 details:" << endl;
    account3.display();

    return 0;
}
