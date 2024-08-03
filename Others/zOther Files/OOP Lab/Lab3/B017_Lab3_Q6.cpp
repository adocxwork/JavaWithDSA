// This program is written by Aditya Gupta(231B017)
#include<iostream>
using namespace std;
class rectangle{
    int length, width;
    public:
    void setData(){
        int l, w;
        cout<<"Enter length & width :-\n";
        cin>>l>>w;
        length=l;
        width=w;
    }
    void showData(){
        cout<<"Length & Width is :-\n"<<length<<"\n"<<width<<endl;
    }
    int peri(){
        return 2*(length + width);
    }
    int area(){
        return length*width;
    }
};
int main(){
    rectangle r;
    r.setData();
    r.showData();
    cout<<"Perimeter : "<<r.peri()<<endl;
    cout<<"Area : "<<r.area()<<endl;
    return 0;
}
