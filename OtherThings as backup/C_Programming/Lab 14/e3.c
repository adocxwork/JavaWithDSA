#include<stdio.h>
int main()
{
    int arr1[] = {3,4,5,0,1};
    int arr2[] = {9,2,6,7,8};
    int arr3[10];
    int *p1 = arr1;
    int *p2 = arr2;
    int *p3 = arr3;
    for(int i=0; i<5; i++)
    {
        *(p3+i) = *(p1+i);
        *(p3+i+5) = *(p2+i);
    }
    for(int i=0; i<10; i++)
    {
        printf("%d ", arr3[i]);
    }
    return 0;
}