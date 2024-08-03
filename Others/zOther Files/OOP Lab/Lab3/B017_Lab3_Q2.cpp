// This program is written by Aditya Gupta(231B017)
#include<iostream>
using namespace std;
void minmax( int arr[], int l, int & min, int & max){
    min = arr[0];
    max = arr[0];
    for(int i=0; i<l; i++){
        if(arr[i]>max) max=arr[i];
        if(arr[i]<min) min=arr[i];
    }
}
int main(){
    int arr[] = {1,2,3,4,5};
    int a=-1, b=-1;
    int &min=a, &max=b;
    minmax(arr, 5, min, max);
    cout<<"Min : "<<a<<"\nMax : "<<b;
    return 0;
}