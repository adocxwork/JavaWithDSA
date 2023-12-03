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
    int arr[] = {1,8,2,6,4,5,7};
    dis(arr);
    for(int i=0; i<7; i++)
    {
        for(int j=0; j<7-i-1; j++)
        {
            if(arr[j]<arr[j+1])
            {
                int t = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = t;
            }
        }
    }
    dis(arr);
    return 0;
}