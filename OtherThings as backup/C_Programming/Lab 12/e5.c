#include<stdio.h>
void sort(int arr[], int s)
{
    for(int i=0; i<s; i++)
    {
        for(int j=0; j<s-i-1; j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
}
void dis(int arr[], int s)
{
    for(int i=0; i<s; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
int main()
{
    int arr[] = {7,2,4,9,0,1,3};
    dis(arr, 7);
    sort(arr, 7);
    dis(arr, 7);
    return 0;
}