#include <iostream>
using namespace std;

class Shape {
protected:
    double dimension1;
    double dimension2;
public:
    Shape(double d1 = 0, double d2 = 0) : dimension1(d1), dimension2(d2) {}
    virtual void get_data() {
        cout << "Enter dimensions: ";
        cin >> dimension1 >> dimension2;
    }
    virtual void display_area() {
        cout << "Area: " << endl;
    }
};

class Triangle : public Shape {
public:
    Triangle(double base = 0, double height = 0) : Shape(base, height) {}
    void get_data() {
        cout << "Enter base and height of triangle: ";
        Shape::get_data();
    }
    void display_area() {
        double area = 0.5 * dimension1 * dimension2;
        cout << "Area of triangle: " << area << endl;
    }
};

class Rectangle : public Shape {
public:
    Rectangle(double length = 0, double width = 0) : Shape(length, width) {}
    void get_data() {
        cout << "Enter length and width of rectangle: ";
        Shape::get_data();
    }
    void display_area() {
        double area = dimension1 * dimension2;
        cout << "Area of rectangle: " << area << endl;
    }
};

class Circle : public Shape {
public:
    Circle(double radius = 0) : Shape(radius) {}
    void get_data() {
        cout << "Enter radius of circle: ";
        Shape::get_data();
        dimension2 = 0;
    }
    void display_area() {
        double area = 3.141 * dimension1 * dimension1;
        cout << "Area of circle: " << area << endl;
    }
};

int main() {
    Shape *s;
    Triangle t;
    Rectangle r;
    Circle c;

    s = &t;
    s->get_data();
    s->display_area();

    s = &r;
    s->get_data();
    s->display_area();

    s = &c;
    s->get_data();
    s->display_area();

    return 0;
}
