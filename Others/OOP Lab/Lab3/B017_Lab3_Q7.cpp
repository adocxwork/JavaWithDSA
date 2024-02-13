// This program is written by Aditya Gupta(231B017)
#include<iostream>
using namespace std;
class Shirt{
    public:
    int collarsize, sleeveLength;
};
class Pants{
    public:
    int waistSize, inSeam;
};
void displayClothingFacts(Shirt s){
    cout<<"Shirt Info : -\n";
    cout<<"Collar Size : "<<s.collarsize<<"\nSleeve Length : "<<s.sleeveLength<<endl;
}
void displayClothingFacts(Pants p){
    cout<<"Pant Info : -\n";
    cout<<"Waist Size : "<<p.waistSize<<"\nIn Seam : "<<p.inSeam<<endl;
}
int main(){
    Shirt s;
    s.collarsize = 10;
    s.sleeveLength = 30;
    Pants p;
    p.waistSize = 40;
    p.inSeam = 45;
    displayClothingFacts(s);
    displayClothingFacts(p);
    return 0;
}