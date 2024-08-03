#include<iostream>
using namespace std;
int main()
{
    struct com
    {
        int real;
        int imag;
    } v1, v2;
    v1.real = 1;
    v1.imag = 2;
    v2.real = 3;
    v2.imag = 3;
    cout<<"The sum of complex number is : -\n"<<v1.real+v2.real<<" + i"<<v1.imag+v2.imag<<endl;
    return 0;
}
