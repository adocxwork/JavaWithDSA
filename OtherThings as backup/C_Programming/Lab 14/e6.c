#include<stdio.h>
void swap(int *x, int *y)
{
    int temp = *x;
    *x = *y;
    *y = temp;
}
int main()
{
    int a=5, b=10;
    int *p1=&a, *p2=&b;
    printf("a : %d\n", a);
    printf("b : %d\n", b);
    swap(p1, p2);
    printf("\n");
    printf("a : %d\n", a);
    printf("b : %d\n", b);
    return 0;
}