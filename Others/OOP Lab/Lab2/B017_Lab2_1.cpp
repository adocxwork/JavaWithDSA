#include<iostream>
using namespace std;
void minMax(int arr[], int n, int *min, int *max)
{
    *min = arr[0];
    *max = arr[0];
    for(int i=0; i<n; i++)
    {
        if(arr[i]>*max)
        {
            *max = arr[i];
        }
        if(arr[i]<*min)
        {
            *min = arr[i];
        }
    }
}
int main()
{
    int arr[] = {7,1,6,2,5,3,9,8,0,4};
    int min, max;
    minMax(arr,10, &min, &max);
    cout<<"Max : "<<max<<"\nMin : "<<min;
    return 0;
}
