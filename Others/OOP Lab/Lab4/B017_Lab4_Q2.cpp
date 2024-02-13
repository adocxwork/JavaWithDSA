// This program is written by Aditya Gupta(231B017)
#include <iostream>
#include <string>
using namespace std;
class BankAccount {
private:
    string depositor_name;
    int account_number;
    string account_type;
    double balance;
public:
    void initialValues(string name, int acc_number, string acc_type, double initial_balance) {
        depositor_name = name;
        account_number = acc_number;
        account_type = acc_type;
        balance = initial_balance;
    }
    void deposit(double amount) {
        balance += amount;
        cout << "Amount " << amount << " deposited successfully." << endl;
    }
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            cout << "Amount " << amount << " withdrawn successfully." << endl;
        } else {
            cout << "Insufficient balance." << endl;
        }
    }
    void display() {
        cout << "Name: " << depositor_name << endl;
        cout << "Balance: $" << balance << endl;
    }
};
int main() {
    BankAccount account;
    string name, acctype;
    int accNo;
    double accBal;
    cout<<"Enter name : ";
    getline(cin, name);
    cout<<"Enter Account type : ";
    getline(cin, acctype);
    cout<<"Enter Account No : ";
    cin>>accNo;
    account.initialValues(name, accNo, acctype, 0.0);
    account.display();
    account.deposit(500);
    account.withdraw(200);
    account.display();
    return 0;
}
