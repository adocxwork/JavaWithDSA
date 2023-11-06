#include<stdio.h>
#include<math.h>
int main()
{
    int n, nn, noOfDigits, digit, i=9, count=0;
    printf("Enter the number : ");
    scanf("%d", &n);

    noOfDigits = log10(n) + 1;
    printf("The no of digits in the given number is : %d\n", noOfDigits);
    nn = n;

    while (i>=0)
    {
        while (nn)
        {
            digit = nn%10;
            nn/=10;
            if(digit==i)
            count++;
        }
        if(count>0)
        printf("The frequency of %d is %d\n", i, count);
        i--;
        nn = n;
        count=0;
    }
    return 0;
}