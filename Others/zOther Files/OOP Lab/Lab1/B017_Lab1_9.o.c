#include<stdio.h>
int missingEle(int arr[], int size)
{
    for(int i=0; i<size-1; i++)
    {
        if(arr[i]!=arr[i+1]-1) return arr[i]+1;
    }
    return -1;
}
int main()
{
    int arr[] = {1,2,3,5,6,7,8,9,10,11};
    printf("%d", missingEle(arr, 10));
    return 0;
}
