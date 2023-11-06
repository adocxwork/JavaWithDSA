// without temporary variable
#include<stdio.h>
int main()
{
    int a=7, b=11;
    printf("The value of a is : %d\n", a);
    printf("The value of b is : %d\n", b);

    a = a+b;
    b = a-b;
    a = a-b;

    printf("After swaping :-\n");
    printf("The value of a is : %d\n", a);
    printf("The value of b is : %d\n", b);
    return 0;
}