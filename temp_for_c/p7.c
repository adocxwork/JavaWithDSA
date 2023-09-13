//4 To determine whether a given input number is even or odd.
#include<stdio.h>
int main()
{
    int a;
    printf("Enter a number : ");
    scanf("%d", &a);

    if(a%2==0)
    printf("Even");
    else
    printf("Odd");
    
    return 0;
}