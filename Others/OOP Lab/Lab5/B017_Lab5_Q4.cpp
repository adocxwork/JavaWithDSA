#include <iostream>
using namespace std;
class Point {
    int x, y;
public:
    Point(){
        x = 0;
        y = 0;
    }
    Point(int xCoord, int yCoord) : x(xCoord), y(yCoord) {
        cout << "Point constructor (" << x << ", " << y << ")" << endl;
    }
    void setVal(int xx, int yy){
        x = xx;
        y = yy;
    }
    ~Point() {
        cout << "Point destructor (" << x << ", " << y << ")" << endl;
    }
};

class Rectangle {
    Point topLeft;
    Point bottomRight;

public:
    Rectangle(int x1, int y1, int x2, int y2){
        topLeft.setVal(x1, y1);
        bottomRight.setVal(x2, y2);
        cout << "Rectangle constructor (" << x1 << ", " << y1 << ")"
             << " and (" << x2 << ", " << y2 << ")" << endl;
    }
    ~Rectangle() {
        cout << "Rectangle destructor" << endl;
    }
};

int main() {
    cout << "Creating a Point object..." << endl;
    Point p(3, 4);

    cout << "\nCreating a Rectangle object..." << endl;
    Rectangle r(1, 2, 5, 6);

    cout << "\nProgram ended." << endl;

    return 0;
}
