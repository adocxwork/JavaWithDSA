#include <iostream>
using namespace std;
class Point {
    int x, y;
public:
    Point(int xCoord, int yCoord) : x(xCoord), y(yCoord) {
        cout << "Point constructor (" << x << ", " << y << ")" << endl;
    }
    ~Point() {
        cout << "Point destructor (" << x << ", " << y << ")" << endl;
    }
};

class Rectangle {
    Point topLeft;
    Point bottomRight;
public:
    Rectangle(int x1, int y1, int x2, int y2): topLeft(x1, y1), bottomRight(x2, y2){
        cout << "Rectangle constructor" << endl;
    }
    ~Rectangle() {
        cout << "Rectangle destructor" << endl;
    }
};

int main() {
    cout << "\nCreating a Rectangle object..." << endl;
    Rectangle r(1, 2, 5, 6);

    cout << "\nProgram ended." << endl;

    return 0;
}
