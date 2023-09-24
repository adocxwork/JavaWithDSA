// assignment
// a) Conversion from binary number to decimal number
#include<stdio.h>
int main()
{
    int bi, de=0;
    printf("Enter binary number :-\n");
    scanf("%d", &bi);
    
    int i=1;
    while (bi>0)
    {
        de = de + ((bi%10)*i);
        bi /= 10;
        i*=2;
    }

    printf("The Decimal form is : %d", de);
    
    return 0;
}