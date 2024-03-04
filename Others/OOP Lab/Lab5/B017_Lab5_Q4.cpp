#include <iostream>
using namespace std;

class Point {
private:
    int x, y;

public:
    // Constructor to initialize Point object with given coordinates
    Point(int xCoord, int yCoord) : x(xCoord), y(yCoord) {
        cout << "Point constructor called with coordinates (" << x << ", " << y << ")" << endl;
    }

    // Destructor
    ~Point() {
        cout << "Point destructor called for coordinates (" << x << ", " << y << ")" << endl;
    }
};

class Rectangle {
private:
    Point topLeft;      // Top-left vertex of the rectangle
    Point bottomRight;  // Bottom-right vertex of the rectangle

public:
    // Parameterized constructor to initialize Rectangle object with given vertices
    Rectangle(int x1, int y1, int x2, int y2) : topLeft(x1, y1), bottomRight(x2, y2) {
        cout << "Rectangle constructor called with top-left vertex (" << x1 << ", " << y1 << ")"
             << " and bottom-right vertex (" << x2 << ", " << y2 << ")" << endl;
    }

    // Destructor
    ~Rectangle() {
        cout << "Rectangle destructor called" << endl;
    }
};

int main() {
    cout << "Creating a Point object..." << endl;
    Point p(3, 4);

    cout << "\nCreating a Rectangle object..." << endl;
    Rectangle r(1, 2, 5, 6);

    cout << "\nProgram ended. Destructors will be called automatically." << endl;

    return 0;
}
