// This program is written by Aditya Gupta(231B017)
#include<iostream>
using namespace std;
int add(int a, int b, int c){
    return a+b+c;
}
float add(float a, float b, float c){
    return a+b+c;
}
double add(double a, double b, double c){
    return a+b+c;
}
long double add(long double a, long double b, long double c){
    return a+b+c;
}
int main(){
    int i1=1, i2=1, i3=1;
    float f1=1, f2=1, f3=1;
    double d1=1, d2=1, d3=1;
    long double ld1=1, ld2=1, ld3=1;
    cout<<add(i1, i2, i3)<<endl;
    cout<<add(f1, f2, f3)<<endl;
    cout<<add(d1, d2, d3)<<endl;
    cout<<add(ld1, ld2, ld3)<<endl;
    return 0;
}
