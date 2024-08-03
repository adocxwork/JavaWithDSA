// This program is written by Aditya Gupta(231B017)
#include<iostream>
using namespace std;
int fourFun(int a, int b, int c, int d, char o){
    if(o=='+'){
        return (a*d + b*c)/(b*d);
    } else if(o=='-'){
        return  (a*d - b*c)/(b*d);
    } else if(o=='*'){
        return (a*c)/(b*d);
    } else if(o=='/') {
        return (a*d)/(b*c);
    }
}
int main(){
    int a, b, c, d;
    char o;
    cin>>a>>b>>o>>c>>d;
    cout<<"\nAnswer : "<<fourFun(a, b, c, d, o);
    return 0;
}
