// to find the largest of three input numbers
#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter three numbers :-\n");
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);

    if(a>b && a>c)
    {
        printf("The largest number is : %d", a);
    }
    else if(b>a && b>c)
    {
        printf("The largest number is : %d", b);
    }
    else
    {
        printf("The largest number is : %d", c);
    }
    return 0;
}