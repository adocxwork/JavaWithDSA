#include<stdio.h>
void dis(int arr[])
{
    for(int i=0; i<7; i++)
    {
        printf("%d ", arr[i]);
    }
    printf("\n");
}
int main()
{
    int temp;
    int arr[] = {7,2,4,0,9,1,3};
    dis(arr);
    for(int i=0; i<7; i++)
    {
        for(int j=0; j<7-i-1; j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    dis(arr);
    return 0;
}