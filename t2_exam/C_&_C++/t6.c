// determine whether the input year is a leap year or not
#include<stdio.h>
int main()
{
    int year;
    printf("Enter the year : ");
    scanf("%d", &year);
    if(year%4==0)
    {
        printf("This is a leap Year.");
    }
    else
    {
        printf("This is not a leap Year.");
    }
    return 0;
}