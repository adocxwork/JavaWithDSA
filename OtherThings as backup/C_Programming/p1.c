#include<stdio.h>
int main()
{
    int a = 5;
    int *x = &a;
    int **y = &x;

    printf("%d\n", *x);
    printf("%d\n", **y);
    // printf("%p", &x);
    return 0;
}