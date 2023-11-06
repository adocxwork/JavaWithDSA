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
    int temp, i=0, j=6;
    int arr[] = {8,2,6,0,1,7,4};
    dis(arr);
    while(i<j)
    {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    dis(arr);
    return 0;
}