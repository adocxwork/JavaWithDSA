//6 Determine whether the input year is a leap-year or not.
// leap year is divisible by 400 or divisible by 4 but not divisible by 100).
#include<stdio.h>
int main()
{
    int a;
    printf("Enter the year : ");
    scanf("%d", &a);

    if(a%400==0)
    printf("Leap year.");
    else if(a%4==0 && a%100!=0)
    printf("Leap year.");
    else
    printf("Not a Leap year.");

    return 0;
}