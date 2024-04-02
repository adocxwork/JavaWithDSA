/*
the size of a derived class is influenced by several factors, including:

Base Class(es) Size: The size of the derived class includes the size of its base class(es). If the derived class inherits from multiple base classes, their sizes are summed up.

Data Members: The size of the derived class includes the size of its own data members, which may be added to the size inherited from the base class(es).

Padding and Alignment: C++ compilers may add padding bytes to ensure proper alignment of data members, which can affect the overall size of the class. The alignment requirements may depend on the size and type of the data members and the compiler's implementation.

Virtual Functions and Pointers to Virtual Functions: If the derived class introduces new virtual functions or overrides virtual functions from base classes, it may require additional space for the virtual function table (vtable) and pointers to the virtual functions.

Virtual Base Classes: If the derived class inherits from virtual base classes, the compiler may add additional pointers or offsets to maintain proper relationships between the derived class and the virtual base classes.

Here's an example illustrating these factors:
*/

#include <iostream>

// Base class
class Base {
public:
    int a;
    char b;
};

// Derived class
class Derived : public Base {
public:
    int c;
    virtual void foo() {}
};

int main() {
    std::cout << "Size of Base class: " << sizeof(Base) << std::endl;
    std::cout << "Size of Derived class: " << sizeof(Derived) << std::endl;
    return 0;
}

/*
In this example:

The Base class contains an int and a char, which typically occupy 4 and 1 byte(s) respectively (on many systems).
The Derived class inherits from Base and adds an additional int member.
Additionally, Derived introduces a virtual function foo().
The size of Derived might be larger than the sum of the sizes of its individual members due to padding and alignment requirements.
If virtual inheritance were used, there could be additional overhead to manage the virtual base class relationship.
You can run this code to see the sizes of the Base and Derived classes on your system, which may vary depending on the compiler and platform.
*/