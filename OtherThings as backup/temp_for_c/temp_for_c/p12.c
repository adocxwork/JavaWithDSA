// 9. Write a program to display the message “I Love my India”
// when input number is 0 or negative.
#include<stdio.h>
int main()
{
    int a;
    printf("Enter a number : ");
    scanf("%d", &a);

    if(a<=0)
    printf("I Love my India");
    
    return 0;
}