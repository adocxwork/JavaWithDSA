#include<stdio.h>
int main()
{
    int n=7;
    for(int i=0; i<n; i++)
    {
        for(int j=0; j<n; j++)
        {
            if(i==(n/2) || j==(n/2))
            printf("+ ");
            else if(i<(n/2) && j<(n/2))
            printf("* ");
            else if(i<(n/2) && j>(n/2))
            printf("%d ", 1);
            else if(i>(n/2) && j<(n/2))
            printf("%c ", 97);
            else if(i>(n/2) && j>(n/2))
            printf("%c ", 90);
        }
        printf("\n");
    }
    return 0;
}