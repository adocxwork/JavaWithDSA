#include<stdio.h>
int x, y;
void swap()
{
    int temp = x;
    x = y;
    y = temp;
}
int main()
{
    int a;
    printf("Enter the value of x : ");
    scanf("%d", &a);
    int b;
    printf("Enter the value of y : ");
    scanf("%d", &b);
    x = a;
    y = b;
    printf("The value of x is : %d\n", x);
    printf("The value of y is : %d\n", y);
    swap();
    printf("The value of x is : %d\n", x);
    printf("The value of y is : %d\n", y);
}