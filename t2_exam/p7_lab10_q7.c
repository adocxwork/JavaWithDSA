#include<stdio.h>
int main()
{
    for(int i=1; i<=3; i++)
    {
        for(int j=1; j<=10; j++)
        {
            if(2*i+j<=7 || 2*i-j<=-4)
            printf("* ");
            else
            printf("  ");
        }
        printf("\n");
    }
    for(int i=1; i<=3; i++)
    {
        for(int j=1; j<=10; j++)
        {
            if(2*i-j>=1)
            printf("%d ", 6-i);
            else if(2*i+j>=12)
            printf("%d ", i);
            else
            printf("  ");
        }
        printf("\n");
    }
    return 0;
}