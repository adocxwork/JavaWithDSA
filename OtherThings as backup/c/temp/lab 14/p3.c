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
    int arr1[] = {1,2,3,4,5};
    int arr2[] = {1,2,3,4,5};
    int arr3[10];
    int *p1 = arr1;
    int *p2 = arr2;
    int *p3 = arr3;
    for(int i=0; i<5; i++)
        *(p3+i) = *(p1+i);
    for(int i=5; i<10; i++)
        *(p3+i) = *(p2+i-5);
    dis(arr3, 10);
    return 0;
}