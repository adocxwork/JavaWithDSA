#include<stdio.h>
int main()
{
    int n=7;
    for(int i=0; i<=(n/2); i++) //0,1,2,3
    {
        for(int j=i; j<(n/2); j++)
        printf("  ");
        for(int j=i+1; j<=(i+1)*2-1; j++)
        printf("%d ", j);
        for(int j=(i+1)*2-2; j>i; j--)
        printf("%d ", j);
        printf("\n");
    }

    for(int i=(n/2); i>=1; i--) //3,2,1
    {
        for(int j=(n/2); j>=i; j--)
        printf("  ");
        for(int j=i; j<=(i*2)-1; j++)
        printf("%d ", j);
        for(int j=(i*2)-2; j>=i; j--)
        printf("%d ", j);
        printf("\n");
    }

    return 0;
}