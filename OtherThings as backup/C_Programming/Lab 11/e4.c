#include<stdio.h>
int p=1, q=1;
int deci2bi(int n)
{
    int m=0;
    if(n==0) return m;
    else
    m += (n%2)*p;
    p*=10;
    return m + deci2bi(n/2);
}
int bi2deci(int n)
{
    int m=0;
    if(n==0) return m;
    else
    m+=(n%10)*q;
    q*=2;
    return m + bi2deci(n/10);
}
int main()
{
    printf("%d\n", deci2bi(126));
    printf("%d", bi2deci(1111110));
    return 0;
}