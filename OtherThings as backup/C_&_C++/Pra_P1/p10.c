#include<stdio.h>
int main()
{
    int n1, n2, i, ii;
    printf("Enter two numbers :-\n");
    scanf("%d %d", &n1, &n2);

    if(n1>n2)
    i=n2;
    else
    i=n1;

    do{
        if((n2%i==0 && n1%i==0) || i==1)
        {
            printf("HCF is %d", i);
            break;
        }
        else
        {
            i--;
        }
    }while(1);

    i=n1, ii=n2;
    do{
        if(n1==n2)
        {
            printf("\nLCM is %d", n1);
            break;
        }
        else
        {
            if(n1>n2)
            n2=n2+ii;
            else
            n1=n1+i;
        }
    }while(1);

    return 0;
}