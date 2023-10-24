#include<stdio.h>
int i, ii;
int LCM(int a, int b)
{
    if(a==b)
    return a;
    if(a>b)
    return LCM(a, b+ii);
    else
    return LCM(a+i, b);
}
int main()
{
    // int a=2, b=3;
    // int i=2, ii=3;
    // while (a!=b)
    // {
    //     if(a>b)
    //     b+=ii;
    //     else
    //     a+=i;
    // }
    // printf("%d is the LCM", a);
    i=2, ii=3;
    printf("%d", LCM(i, ii));
    return 0;
}