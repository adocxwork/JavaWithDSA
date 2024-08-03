// This program is written by Aditya Gupta(231B017)
#include<iostream>
using namespace std;
class order{
    public:
    static float minTableCharge;
    int tableNo, noOfPatrons;
    char serverName[100];
};
float order::minTableCharge = 4.75;
int main(){
    float cost = order::minTableCharge;
    cout<<"Minimum table charge : "<<cost<<endl;
    return 0;
}