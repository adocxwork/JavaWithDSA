#include<stdio.h>
int main()
{
    int n=9;
    for(int i=0; i<n; i++)
    {
        for(int k=0; k<i; k++)
            printf("%d ", n-k);
        for(int j=0; j<=n-i; j++)
            printf("%d ", j);
        printf("\n");
    }
    return 0;
}