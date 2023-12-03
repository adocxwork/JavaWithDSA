#include<stdio.h>
void swap(int *p1, int *p2)
{
    int t = *p1;
    *p1 = *p2;
    *p2 = t;
}
int main()
{
    int a=5, b=10;
    int *p1 = &a, *p2 = &b;
    printf("a : %d\n", a);
    printf("b : %d\n", b);
    swap(p1, p2);
    printf("a : %d\n", a);
    printf("b : %d\n", b);
    return 0;
}