// This program is written by Aditya Gupta(231B017)
#include<iostream>
using namespace std;
void fun(char movie[], int rtm=90){
    cout<<"Movie : "<<movie<<endl;
    cout<<"Run time : "<<rtm<<endl;
}
int main(){
    fun("Space");
    fun("Your Name", 999);
    return 0;
}
