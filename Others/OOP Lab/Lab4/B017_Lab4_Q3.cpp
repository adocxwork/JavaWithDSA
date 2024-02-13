#include <iostream>
using namespace std;
class DB;
class DM {
private:
    int meters;
    int centimeters;
public:
    void setData(int m, int c){
        meters = m;
        centimeters = c;
    }
    friend DM add(DM d, DB b);
    void display() {
        cout << "Distance: " << meters << " meters and " << centimeters << " centimeters" << endl;
    }
};

class DB {
private:
    int feet;
    int inches;

public:
    void setData(int f, int i){
        feet = f;
        inches = i;
    }
    friend DM add(DM d, DB b);
    void display() {
        cout << "Distance: " << feet << " feet and " << inches << " inches" << endl;
    }
};

DM add(DM d, DB b) {
    int total_centimeters = b.feet * 12 * 2.54 + b.inches * 2.54;

    int total_meters = d.meters + total_centimeters / 100;
    int total_centimeters_remainder = total_centimeters % 100;
    int final_centimeters = d.centimeters + total_centimeters_remainder;
    if (final_centimeters >= 100) {
        final_centimeters -= 100;
        total_meters++;
    }
    DM m;
    m.setData(total_meters, final_centimeters);
    return m;
}

int main() {
    DM d1;
    DB b1;
    d1.setData(2,30);
    b1.setData(5,10);
    cout << "Before addition:" << endl;
    cout << "DM Object:" << endl;
    d1.display();
    cout << "DB Object:" << endl;
    b1.display();

    DM result = add(d1, b1);

    cout << "\nAfter addition:" << endl;
    cout << "Result:" << endl;
    result.display();

    return 0;
}
