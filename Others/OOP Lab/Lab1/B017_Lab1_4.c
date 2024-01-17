#include<stdio.h>
int fun(int arr[], int size)
{
    for(int i=0; i<size; i++)
    {
        if(arr[i]!=i) return 0;
    }
    return 1;
}
int main()
{
    int arr[] = {0,1,2,3,4,5,6,7};
    printf("%d", fun(arr, 8));
    return 0;
}

