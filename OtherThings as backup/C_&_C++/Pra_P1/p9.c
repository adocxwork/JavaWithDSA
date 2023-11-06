#include<stdio.h>
#include<math.h>
int main()
{
    int n, nod;
    int nn = n, i, numC=0, digits=9;
    printf("Enter a number : ");
    scanf("%d", &n);

    nod = log10(n)+1;
    printf("The number of digits is : %d\n", nod);
    
    // while (digits>=0)
    // {
    //     while (nn)
    //     {
    //         i = nn%10;
    //         nn/=10;
    //         if(i==digits)
    //         numC++;
    //     }
    //     if(numC)
    //     printf("The frequency of %d is %d\n", digits, numC);
    //     numC=0, nn=n, digits--;
    // }
    return 0;
}