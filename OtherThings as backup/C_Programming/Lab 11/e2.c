#include<stdio.h>
int powerOf(int x, int y)
{
    if(y==0) return 1;
    return x * powerOf(x, y-1);
}
int main()
{
    int a, b;
    printf("Enter two numbers :-\n");
    scanf("%d %d", &a, &b);
    printf("The x^y : %d", powerOf(a, b));
    return 0;
}