#include<stdio.h>
int powerOf(int a, int b)
{
    if(b==0)
    return 1;
    return a*powerOf(a, b-1);
}
int main()
{
    int a, b;
    printf("Enter two numbers :-\n");
    scanf("%d %d", &a, &b);

    printf("The x^y : %d", powerOf(a,b));
    return 0;
}