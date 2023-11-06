#include<stdio.h>
int main()
{
    int n=7;
    for(int i=1; i<=(n/2)+1; i++)
    {
        for(int j=1; j<=(n/2)+1-i; j++)
        printf("  ");
        for(int j=i; j<=(i*2)-1; j++)
        printf("%d ", j);
        for(int j=i*2-2; j>=i; j--)
        printf("%d ", j);
        printf("\n");
    }
    for(int i=(n/2); i>=1; i--) //3,2,1
    {
        for(int j=(n/2); j>=i; j--)
        printf("  ");
        for(int j=i; j<=(i*2-1); j++)
        printf("%d ", j);
        for(int j=(i*2-2); j>=i; j--)
        printf("%d ", j);
        printf("\n");
    }
    return 0;
}