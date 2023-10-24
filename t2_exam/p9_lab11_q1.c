#include<stdio.h>
int x,y;
void swap()
{
    int temp;
    temp=x;
    x=y;
    y=temp;
}
int main()
{
    int a,b;
    printf("Enter two numbers :-\n");
    scanf("%d %d", &x, &y);

    printf("X : %d\n", x);
    printf("Y : %d\n", y);

    swap();
    printf("After swap :-\n");
    printf("X : %d\n", x);
    printf("Y : %d\n", y);
    return 0;
}