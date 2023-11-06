#include<stdio.h>
#include<math.h>
int main()
{
    int n, nod, tSum=0, i=0;
    printf("Enter a number : ");
    scanf("%d", &n);
    int nn=n;

    nod = log10(n)+1;

    while (nn)
    {
        i=nn%10;
        nn=nn/10;
        tSum+=pow(i, nod);
    }

    if(n==tSum)
    printf("Its a Armstrong number.");
    else
    printf("Its not..");
    return 0;
}