#include<stdio.h>
int main()
{
    int arr1[] = {1,2,3,4,5};
    int arr2[] = {1,2,3,4,5};
    int arr3[10];
    int *p1 = arr1;
    int *p2 = arr2;
    int *p3 = arr3;
    for(int i=0; i<5; i++)
    {
        *(p3+i) = *(p1++);
    }
    for(int i=5; i<10; i++)
    {
        *(p3+i) = *(p2++);
    }
    for(int i=0; i<10; i++)
    printf("%d ", arr3[i]);
    return 0;
}