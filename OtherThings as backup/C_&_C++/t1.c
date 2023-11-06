// to swap two numbers using with and without temporary variable.
#include<stdio.h>
int main()
{
    int a=7, b=11, temp;
    printf("The value of a is : %d\n", a);
    printf("The value of b is : %d\n", b);

    temp=a;
    a=b;
    b=temp;
    
    printf("After swaping :-\n");
    printf("The value of a is : %d\n", a);
    printf("The value of b is : %d\n", b);
    return 0;
}