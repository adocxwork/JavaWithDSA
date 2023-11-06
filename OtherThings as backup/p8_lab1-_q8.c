#include<stdio.h>
int main()
{
    int n=9;
    for(int i=0; i<n; i++)
    {
        for(int j=n; j>n-i; j--)
        printf("%d ", j);
        for(int j=0; j<=n-i; j++)
        printf("%d ", j);
        printf("\n");
    }
    return 0;
}