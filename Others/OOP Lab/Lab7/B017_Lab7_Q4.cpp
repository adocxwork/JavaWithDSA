#include <iostream>
#include <string>
using namespace std;

class Staff
{
protected:
  int code;
  string name;

public:
  void read()
  {
    cout << "Enter staff code: ";
    cin >> code;
    cout << "Enter staff name: ";
    cin.ignore();
    getline(cin, name);
  }

  void print()
  {
    cout << "Staff code: " << code << endl;
    cout << "Staff name: " << name << endl;
  }
};

class Teacher : public Staff
{
  string subject;
  string publication;

public:
  void read()
  {
    Staff::read();
    cout << "Enter teacher's subject: ";
    getline(cin, subject);
    cout << "Enter teacher's publications: ";
    getline(cin, publication);
  }

  void print()
  {
    Staff::print();
    cout << "Teacher's subject: " << subject << endl;
    cout << "Teacher's publications: " << publication << endl;
  }
};

class Typist : public Staff
{
  int speed;

public:
  void read()
  {
    Staff::read();
    cout << "Enter typist's speed (wpm): ";
    cin >> speed;
  }

  void print()
  {
    Staff::print();
    cout << "Typist's speed: " << speed << " wpm" << endl;
  }
};

class Officer : public Staff
{
  string grade;

public:
  void read()
  {
    Staff::read();
    cout << "Enter officer's grade: ";
    cin.ignore();
    getline(cin, grade);
  }

  void print()
  {
    Staff::print();
    cout << "Officer's grade: " << grade << endl;
  }
};

class Regular : public Typist
{
public:
  void read()
  {
    Typist::read();
  }
  void print()
  {
    Typist::print();
  }
};

class Casual : public Typist
{
  double daily_wages;

public:
  void read()
  {
    Typist::read();
    cout << "Enter casual employee's daily wage: ";
    cin >> daily_wages;
  }

  void print()
  {
    Typist::print();
    cout << "Daily wage: " << daily_wages << endl;
  }
};

int main()
{
  Teacher t;
  Regular r;
  Casual c;
  Officer o;

  // Read data for each object
  t.read();
  r.read();
  c.read();
  o.read();

  // Print data for each object
  cout << "\n--- Staff Information ---\n";
  t.print();
  r.print();
  c.print();
  o.print();

  return 0;
}