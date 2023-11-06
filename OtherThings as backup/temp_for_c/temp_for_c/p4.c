// 1 To Swap two numbers using with and without
// temporary variable.
#include<stdio.h>
int main()
{
    // with temporary variable
    int a=10, b=7, temp;
    temp = a;
    a = b;
    b = temp;
    printf("\nThe value of a is : %d", a);
    printf("\nThe value of b is : %d", b);

    // without temporary variable
    int x=11, y=14;
    x = x + y;
    y = x - y;
    x = x - y;
    printf("\nThe value of x is : %d", x);
    printf("\nThe value of y is : %d", y);
    return 0;
}