// This program is written by Aditya Gupta(231B017)
#include<iostream>
using namespace std;
void swap(int &a, int &b){
    int t = a;
    a = b;
    b = t;
}
int main(){
    int a=5, b=10;
    int &aa = a, &bb=b;
    cout<<"a="<<a<<"\nb="<<b<<endl;
    swap(aa, bb);
    cout<<"After swap: -\n";
    cout<<"a="<<a<<"\nb="<<b<<endl;
    return 0;
}