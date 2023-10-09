#include<stdio.h>
int main()
{
    int n, fact=1;
    printf("Enter a number : ");
    scanf("%d", &n);
    int nn = n;

    for(int i=1; i<=n; i++)
    {
        fact*=i;
    }

    // fa:
    // if(nn>0)
    // fact = fact * nn;
    // nn--;
    // if(nn>1)
    // goto fa;

    printf("The factorial of %d is %d", n, fact);
    return 0;
}