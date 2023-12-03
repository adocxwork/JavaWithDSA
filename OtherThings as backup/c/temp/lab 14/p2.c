#include<stdio.h>
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
    int arr[] = {7,3,0,1,5,8,2};
    dis(arr, 7);
    int *p = arr;
    for(int i=0; i<7; i++)
    {
        for(int j=0; j<7-i-1; j++)
        {
            if(*(p+j) < *(p+j+1))
            {
                int t = *(p+j);
                *(p+j) = *(p+j+1);
                *(p+j+1) = t;
            }
        }
    }
    dis(arr, 7);
    return 0;
}