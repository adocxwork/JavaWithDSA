#include<iostream>
using namespace std;
void reverse(long double arr[], int n)
{
    int i=0, j=n-1;
    while(i<j)
    {
        long double t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
        i++;
        j--;
    }
}
int main()
{
    int n;
    cout<<"Enter the size of array : ";
    cin>>n;
    long double *arr = (long double *)malloc(n*sizeof(long double));
    cout<<"Enter the array : -"<<endl;
    for(int i=0; i<n; i++)
    {
        cin>>arr[i];
    }
    reverse(arr,n);
    cout<<"Reverse array : -"<<endl;
    for(int i=0; i<n; i++)
    {
        cout<<arr[i]<<" ";
    }
    free(arr);
    return 0;
}
