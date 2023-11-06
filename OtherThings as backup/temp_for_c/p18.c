// assignment
// b) Find Greatest common divisor(HCF)
#include<stdio.h>
int main()
{
    int x,y,i;
    printf("Enter the value of x & y :-\n");
    scanf("%d %d", &x, &y);

    if(x<y)
    i=x;
    else
    i=y;

    while (i>0)
    {
        --i;
        if(x%i==0 && y%i==0)
        {
            printf("The HCF is %d", i);
            break;
        }
    }
    
    return 0;
}